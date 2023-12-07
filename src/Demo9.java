import java.util.ArrayList;

public class Demo9 {
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        System.out.println(arr);

        arr.set(0,7);
        System.out.println(arr);
    }
}
