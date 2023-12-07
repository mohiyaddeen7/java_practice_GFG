import java.util.Scanner;

public class BillingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of your choice : ");
        int totalAmount = 0;
        int quantity = 0;
        String item = "";
        int cho = 1;
        boolean choice = false;
        do {
            System.out.println("1.Chai - 10rs\n2.VadaPav - 30rs\n3.PaniPuri - 20rs\n4.Pavbhaji - 40rs");
            System.out.print("Enter the number of your choice : ");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.print("Quantiy : ");
                    quantity = sc.nextInt();
                    totalAmount = quantity * 10;
                    item = "Chai";
                    break;

                case 2:
                    System.out.println("Quantiy");
                    quantity = sc.nextInt();
                    totalAmount = quantity * 30;
                    item = "VadaPav";
                    break;

                case 3:
                    System.out.println("Quantiy");
                    quantity = sc.nextInt();
                    totalAmount = quantity * 20;
                    item = "PaniPuri";

                    break;

                case 4:
                    System.out.println("Quantiy");
                    quantity = sc.nextInt();
                    totalAmount = quantity * 40;
                    item = "Pavbhaji";

                    break;

            }
            System.out.println("");
            System.out.println("");
            System.out.println("\tBill");
            System.out.println("Item : " + item);
            System.out.println("Quantity : " + quantity);
            System.out.println("Total Amount : " + totalAmount);


            System.out.println("Do you want to add some more items (1/0) : ");
            cho = sc.nextInt();
            if (cho == 1) {
                choice = true;
            }
            else{
                choice = false;
            }
        } while (choice);
    }
}
