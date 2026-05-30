package ThirtMay;

abstract class Animal {
    abstract void sound();
}
class Dog extends Animal{
    void sound(){
        System.out.println(" animal is barkng");
    }
}
