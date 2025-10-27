package access_modifiers.privateEx;

public class TestPrivate {
    public static void main(String[] args) {
        PrivateExample obj = new PrivateExample();

        // obj.displaySecret();  
        // System.out.println(obj.secret); 
        obj.reveal();  // ✅ Works (accessed indirectly through public method)
    }
}

