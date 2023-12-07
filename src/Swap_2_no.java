public class Swap_2_no {
    public static void main(String[] args) {

        int a=10,b=50;

        b= b+a;
        a= b-a;
        b= b-a;

        System.out.println("a : "+a+" b : "+b);


    }
}
