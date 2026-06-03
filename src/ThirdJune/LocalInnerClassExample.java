package ThirdJune;

public class LocalInnerClassExample {

    void show() {

        class Local {

            void display() {
                System.out.println("Inside Local Class");
            }
        }

        Local obj = new Local();
        obj.display();
    }

    public static void main(String[] args) {

        LocalInnerClassExample obj = new LocalInnerClassExample();
        obj.show();
    }
}
