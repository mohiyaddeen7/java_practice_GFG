public class Demo_subClass extends Demo_poly_superClass{

    public void func1(){
        System.out.println("inside sub class");
    }

    public static void main(String[] args) {
        Demo_subClass obj = new Demo_subClass();
        obj.func1();
    }

}
