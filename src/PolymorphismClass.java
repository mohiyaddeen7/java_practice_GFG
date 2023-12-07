public class PolymorphismClass {

    //method overloading - compile time polymorphism
    public static void func1(int a){
        System.out.println("one parameter of int "+a);
    }

    public void func1(){
        System.out.println("no parameter of int ");
    }

    public static void func1(char a){
        System.out.println("one char parameter of "+a);
    }

    public static void func1(int a,int b)
    {
        System.out.println("two parameter of int "+a+" "+b);
    }
    

    public static void main(String[] args) {
        PolymorphismClass myObj = new PolymorphismSubClass();

        func1(10);
    }
}
