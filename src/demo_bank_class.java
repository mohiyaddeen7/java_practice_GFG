public class demo_bank_class {

    private int amount=0;

    public void deposit(int amount)
    {
        this.amount+=amount;
    }

    public void display()
    {
        System.out.println(this.amount);
    }

    public void withdraw (int amount) throws demo_bank_exception
    {
        if(amount<this.amount)
        {

        this.amount-=amount;
        }
        else {

            throw new demo_bank_exception();
        }
    }

    public static void main(String[] args) {
        demo_bank_class bank1 = new demo_bank_class();

        bank1.deposit(10000);
        bank1.display();
        try {
        bank1.withdraw(15000);
        }catch (demo_bank_exception be)
        {
            be.except();
        }
        bank1.display();
    }

}
