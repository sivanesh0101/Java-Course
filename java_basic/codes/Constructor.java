// class Car {
//     String brand;
//     int speed;

//     void show() {
//         System.out.println(brand + " : " + speed + " km/h");
//     }
// }

// public class ob {
//     public static void main(String[] args) {
//         Car c1 = new Car();
//         c1.brand = "BMW";
//         c1.speed = 100;
//         c1.show();

//         Car c2 = new Car();
//         c2.brand = "Tesla";
//         c2.speed = 120;
//         c2.show();
//     }
// }

class Car {
    String brand;
    int speed;

    Car(String brand1, int speed1) {
        this.brand = brand1;
        this.speed = speed1;
    }
    

    void show() {
        System.out.println(brand + " : " + speed + " km/h");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", 120);
        Car car2 = new Car("BMW", 100);

        car1.show(); // Tesla : 120 km/h
        car2.show(); // BMW : 100 km/h
    }
}