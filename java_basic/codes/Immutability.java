public class Immutability {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = s1;         
        s1 = s1 + " Rocks";
        System.out.println("s1 == s2 ? " + (s1 == s2)); 

        s2 = s1;         

        System.out.println("s1: " + s1);           
        System.out.println("s2: " + s2);           
        System.out.println("s1 == s2 ? " + (s1 == s2)); 
        System.out.println("s1.equals(s2)? " + s1.equals(s2));
    }
}
