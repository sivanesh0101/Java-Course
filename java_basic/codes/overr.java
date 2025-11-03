class Calculator {
    // Parent method with parameters
    int add(int a, int b) {
        System.out.println("Adding numbers in Calculator class...");
        return a + b;

}

class AdvancedCalculator extends Calculator {
    // Overriding the same method with the same parameters\
    @Override
    int add(int a, int b) {
        System.out.println("Adding numbers in AdvancedCalculator class...");
        return a + b + 10; // adds extra 10 for demonstration
    }
}

public class overr {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        System.out.println("Result 1: " + c1.add(5, 5));   // Calls parent method

        AdvancedCalculator c2 = new AdvancedCalculator();
        System.out.println("Result 2: " + c2.add(5, 5));   // Calls overridden method
    }
}
