public class Student {
    private String name;
    private int age;

    // Constructor
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Setter
    public String setName(String name) {
        this.name = name;
        return name;
    }

    // Normal method
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // ✅ Main method (entry point)
    public static void main(String[] args) {
        Student s = new Student("Sivanesh", 22);
        System.out.println(s.setName("Siva"));
        s.displayDetails();
    }
}

