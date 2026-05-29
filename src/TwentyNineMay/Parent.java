package TwentyNineMay;

class Parent {

    void display(){
        System.out.println("parent method");
    }
}
class child extends Parent{
    @Override
    void display(){
        System.out.println("child method");
    }
}
