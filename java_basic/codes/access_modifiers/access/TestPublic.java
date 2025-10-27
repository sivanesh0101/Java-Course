package access_modifiers.access;

import access_modifiers.Example;

public class TestPublic {
    public static void main(String[] args) {
        Example e = new Example();
        System.out.println(e.num);
        e.show();                  
    }
}

