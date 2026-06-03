package ThirdJune;

class Print<T> {

    T value;

    void setValue(T value) {
        this.value = value;
    }

    T getValue() {
        return value;
    }
}

public class GenericClassExample {

    public static void main(String[] args) {

        Print<Integer> p = new Print<>();

        p.setValue(10);

        System.out.println(p.getValue());
    }
}