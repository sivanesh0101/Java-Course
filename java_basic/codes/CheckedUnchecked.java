import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CheckedUnchecked {

    // ---------- Unchecked (ArithmeticException) ----------
    static void demoUnchecked() {
        System.out.println("1) Unchecked: ArithmeticException");
        int x = 10;
        int y = 0;

        // If you remove the try/catch, it will crash at runtime.
        try {
            int z = x / y; // ArithmeticException at runtime
            System.out.println("Result: " + z);
        } catch (ArithmeticException e) {
            System.out.println("Caught: " + e); // continues program
        }
        System.out.println();
    }

    // ---------- Checked (IOException) ----------
    // Matches your snippet: method declares it may throw IOException
    static void load() throws IOException {
        FileReader fr = new FileReader("config.txt"); // may not exist
        try (BufferedReader br = new BufferedReader(fr)) {
            String first = br.readLine();
            System.out.println("First line in config.txt: " + first);
        }
    }

    public static void main(String[] args) {
        // 1) Unchecked demo
        demoUnchecked();

        // 2) Checked demo (must handle or declare)
        System.out.println("2) Checked: IOException (must handle or declare)");
        try {
            load(); // forced to handle here
            System.out.println("Done reading file.");
        } catch (IOException e) {
            System.out.println("Handled IOException: "
                    + e.getClass().getSimpleName() + " -> " + e.getMessage());
        }
    }
}
