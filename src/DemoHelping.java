import java.util.ArrayList;
import java.util.List;

public class DemoHelping {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();

        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        temp.add(2);
        temp.add(3);

        arr.add(temp);
        List<Integer> temp1 = new ArrayList<>();
        temp1.add(1);
        temp1.add(2);
        temp1.add(3);

        arr.add(temp1);


    }
}

