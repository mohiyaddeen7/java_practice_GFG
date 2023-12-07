public class Encapsulation {

    private int privateVar1;

    public int getValue(){
       return this.privateVar1;
    }

    public void setValue(int x)
    {
        this.privateVar1 = x;
    }

    public static void main(String[] args){
        Encapsulation myObj = new Encapsulation();
        System.out.println(myObj.privateVar1);
    }
}


