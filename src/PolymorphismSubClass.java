public class PolymorphismSubClass extends PolymorphismClass{

    //method overriding - runtime polymorphism
    public static void func1(int a){
        System.out.println("overrided function");
    }

    public static void main(String[] args) {
        PolymorphismClass myObj = new PolymorphismSubClass();
        func1(10);
    }
}
