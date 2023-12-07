public class Demo {
    static int v=5;

    static void func()
    {
        System.out.println("success");
    }

    public static void main(String[] args) {
        Demo myObj = new Demo();
        System.out.println(myObj.v);
        myObj.func();
    }
}
