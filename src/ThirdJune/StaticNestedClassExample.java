package ThirdJune;


class Outer {

    static int value = 100;

    static class Nested {

        void display() {
            System.out.println(value);
        }
    }
}

public class StaticNestedClassExample {

    public static void main(String[] args) {

        Outer.Nested obj = new Outer.Nested();
        obj.display();
    }
}
