public class demo_pratyoosh1 {

    public static int swapNumbers(int a, int b)
    {
        a=b;
        return a;
    }
    public static void main(String[] args) {
        int a=10,b=5;

        int temp=a;
        a = swapNumbers(a,b);//pass by value
        b = swapNumbers(b,temp);//pass by value
        System.out.println("a : "+a+" b : "+b);
    }
}
