public class Combinations_that_add_up_to_target {
    public static void main(String[] args) {

        int [] arr = {2,3,4,1,5};
        int target =8;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int temp = arr[i]+arr[j];
                if(temp==target)
                {
                    System.out.println("target i : "+i+" target j : "+j);
                }
            }
        }
    }
}
