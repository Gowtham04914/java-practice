package TwentyNineMay;

public class Invoice {
    void getInvoice(){
        System.out.println("no arguments");
    }
    void getInvoice(String name){
        System.out.println("customer:" +name);
    }
    int getInvoice(int amount){
        return amount;
    }
    void getInvoice(int a, int b) {
        System.out.println(a + b);
    }

    public static void main(String[] args) {
        Invoice obj = new Invoice();
        obj.getInvoice();
        obj.getInvoice("Gowtham");
        System.out.println(obj.getInvoice(100));
        obj.getInvoice(10, 20);

    }



}