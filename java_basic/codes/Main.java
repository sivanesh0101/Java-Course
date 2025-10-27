class Student {
    String name;   // field
    int roll;      // field
    String dept;

    void detail() {  // method
        System.out.println("Name :" + name);
        System.out.println("Roll_No :" + roll);
        System.out.println("Department :" + dept);
    }
}

public class Main {
    public static void main(String[] args) {
        Student std1 = new Student();    // object creation
        std1.name = "Siva";
        std1.roll = 001;
        std1.detail();  
        
        Student std2 = new Student();    // object creation
        std2.name = "Kavin";
        std2.roll = 002;
        std2.dept = "Mech";
        std2.detail();
    }
}
