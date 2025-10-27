public class InheritanceDemo {
    public static void main(String[] args) {
        CollegeStudent cs = new CollegeStudent();
        cs.name = "Ananya";
        cs.age = 20;
        cs.schoolName = "Jeevi Academy";
        cs.course = "Computer Science";

        cs.introduce();       // from Person
        cs.study();           // from Student
        cs.attendLecture();   // from CollegeStudent
    }
}