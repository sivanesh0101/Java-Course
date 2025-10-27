// class Car {
//     String brand;
//     void showBrand() {
//         System.out.println("Brand: " + brand);
//     }
// }

// public class Method {
//     public static void main(String[] args) {
//         Car car = new Car();
//         car.brand = "Tesla";
//         car.showBrand(); 
//     }
// }





class Calculator {
    int add(int a, int b) {  // static method
        return a + b;
    }

    int multiply(int a, int b) {    //static method
        return a * b;
    }
}

public class Methods {
    public static void main(String[] args) {
        // Calling static method
        Calculator calc = new Calculator();
        int sum = calc.add(5, 3);
        System.out.println("Sum = " + sum);

        // // Calling non-static method
        int product = calc.multiply(5, 3);
        System.out.println("Product = " + product);
    }
}
