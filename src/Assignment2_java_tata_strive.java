import java.util.Scanner;

public class Assignment2_java_tata_strive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        int age = sc.nextInt();
        float height = sc.nextFloat();
        String address = sc.nextLine();
        int mobile = sc.nextInt();

        System.out.println("******************************************************************");
        System.out.println("Name \t\t\t: \t\t\t"+name+"\nage \t\t\t: \t\t\t"+age+"\nheight \t\t\t: \t\t\t"+height+"\naddress \t\t: \t\t\t"+address+"\nmobile \t\t\t: \t\t\t"+mobile);
        System.out.println("******************************************************************");

    }
}
