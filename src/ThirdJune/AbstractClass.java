package ThirdJune;


abstract class Vehicle {

    abstract void start();

    void fuel() {
        System.out.println("Fuel Required");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car Started");
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.start();
        c.fuel();
    }
}
