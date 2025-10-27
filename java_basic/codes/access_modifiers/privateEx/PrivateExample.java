package access_modifiers.privateEx;

public class PrivateExample {
    private int secret = 1234;  // private variable

    private void displaySecret() {
        System.out.println("Private value: " + secret);
    }

    public void reveal() {
        System.out.println("Accessing private data inside same class:");
        displaySecret(); 
    }
}
