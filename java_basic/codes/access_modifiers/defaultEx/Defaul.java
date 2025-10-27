package access_modifiers.defaultEx;

class DefaultExample {  // 👈 no 'public' keyword
    int num = 50;       // default access
    void show() {       // default method
        System.out.println("Default access value: " + num);
    }
}
