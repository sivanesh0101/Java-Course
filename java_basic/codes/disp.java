class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows");
    }
}

public class disp {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound(); // Dog barks

        a = new Cat();
        a.sound(); // Cat meows
    }
}