public class abstractClassImplementation extends abstractClassTest1{
    public void func1(){
        System.out.println("Slow low");
    }

    public void func2(){
        System.out.println("bye");
    }

    public static void main(String[] args){
        abstractClassImplementation obj1 = new abstractClassImplementation();
        obj1.func1();
        abstractClassTest1.main();

    }

}

abstract class abstractClassTest1{
    public abstract void func1();

    public static void main(){
        System.out.println("hi");

    }
}

