package access_modifiers.defaultEx;

public class TestDefault {
    public static void main(String[] args) {
        DefaultExample d = new DefaultExample(); // ✅ Same package → allowed
        d.show();
    }
}
