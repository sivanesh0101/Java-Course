class Car {
    String brand;


    void showBrand() {
        System.out.println("Brand: " + brand);
    }
}

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(){
            car1.brand = "Tesla"
        }  // b = "Tesla"
        Car car2 = new Car("BMW");    // b = "BMW"

        car1.showBrand(); // Brand: Tesla
        car2.showBrand(); // Brand: BMW
    }
}
