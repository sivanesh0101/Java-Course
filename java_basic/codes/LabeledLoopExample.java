public class LabeledLoopExample {
    public static void main(String[] args) {
        outer:
        for (int i = 1; i <= 3; i++) {   // i = 0,1,2
            for (int j = 1; j <= 3; j++) {  // j = 0,1,2
                if (i == 2 && j == 2) {   // break at second iteration
                    continue outer; // breaks out of both loops
               }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}
