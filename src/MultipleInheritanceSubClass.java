public class MultipleInheritanceSubClass {
    public static void main(String[] args) {
        SubClass myObj = new SubClass();
        myObj.func1();
        myObj.func2();
        myObj.func3();
    }
}

interface one{
    public void func1();
}

interface two{
    public void func2();
}

interface three{
    public void func3();
}


//we are overriding the methods of a child class so we are using @override
class SubClass implements one,two,three{
    @Override
    public void func1() {
        System.out.println("func1");
    }

    @Override
    public void func2() {
        System.out.println("func2");
    }

    @Override
    public void func3() {
        System.out.println("func3");
    }
}