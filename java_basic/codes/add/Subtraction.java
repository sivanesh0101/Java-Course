import java.util.*;

class Addition {
    public static void main(String[] args) {
        long num1 = 2147483647L;
        int num2 = 20;
        long sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}

class Subtraction {
    public static void main(String[] val){
         Scanner siva = new Scanner(System.in);
         System.out.println("Enter value A");
         int a = siva.nextInt();
         System.out.println("Enter Value B");
         int b = siva.nextInt();
         
         int sum = a - b;
         
         System.out.println("Subtraction of a and b ="+ sum);
         siva.close();
    }
}