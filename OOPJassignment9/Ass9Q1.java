class Vehicle {
    void drive() {
        System.out.println("Driving a vehicle");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Repairing a car");
    }
}

public class Ass9Q1 {
    public static void main(String args[]) {

        Vehicle v1 = new Vehicle();
        v1.drive();

        Car c1 = new Car();
        c1.drive();
    }
}
