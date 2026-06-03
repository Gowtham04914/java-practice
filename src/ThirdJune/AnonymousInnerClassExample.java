package ThirdJune;

abstract class Car {

    abstract void brake();
}

public class AnonymousInnerClassExample {

    public static void main(String[] args) {

        Car car = new Car() {

            @Override
            void brake() {
                System.out.println("ABS Brake Applied");
            }
        };

        car.brake();
    }
}
