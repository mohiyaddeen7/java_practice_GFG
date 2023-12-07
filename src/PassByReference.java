public class PassByReference {

    public static void func(int[] arr) {
        arr[0]=7;
    }
    public static void func2(String[] arr) {
        arr[0]="r";
    }

    public static void main(String[] args) {

        int [] arr = {1,2,3,4};
        String[] arr2 = {"String"};
        String arr3 = "raza";
        arr3="12";
        System.out.println(arr3);
        func(arr);
        func2(arr2);
        for (int i=0;i<arr.length;i++)
        {
        System.out.print(" "+arr[i]);
        }
        System.out.println("");
        for (int i=0;i<arr2.length;i++)
        {
            System.out.print(" "+arr2[i]);
        }
    }
}
