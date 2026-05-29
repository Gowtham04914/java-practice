package TwentyNineMay;

public class calucalation {
    public int sum(int val1,int val2){
        int total = val1+val2;
        return total;
    }

    public static void main(String[] args) {
        calucalation obj = new calucalation();
        System.out.println(obj.sum(2,3));
    }


}
