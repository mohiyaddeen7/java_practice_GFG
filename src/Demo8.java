public class Demo8 {

    public static int[] remove(int[]arr, int ele)
    {
        int size = arr.length;
        int [] temp=new int[size-1];
        int k=0;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==ele)
            {
                continue;
            }
            temp[k++] = arr[i];
        }
        return temp;
    }

    public static int minimum(int[]arr)
    {
        int min=Integer.MAX_VALUE;
        for (int i=0;i< arr.length;i++)
        {
            if(arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int [] arr={2,3,4};
        int sum=0;
        while(arr.length!=0)
        {
            int min = minimum(arr);
            System.out.println("min :  "+min);
            sum+=min;
            int idx=0;



            // to find the index of the minimum element
            for(int i=0;i<arr.length;i++)
            {
                if(arr[i]==min)
                {
                    idx=i;
                    break;
                }
            }


            if(idx==0 && arr.length>1)
            {
                System.out.println("flag1");
                arr = remove(arr,arr[idx]);
                arr=remove(arr,arr[idx]);
            }
            else if(idx==arr.length-1 && arr.length>1)
            {
                System.out.println("flag2");

                arr = remove(arr,arr[idx]);
                arr=remove(arr,arr[--idx]);
            } else if(arr.length>2){
                System.out.println("flag3");
                arr = remove(arr,arr[idx]);
                arr=remove(arr,arr[idx]);
                arr=remove(arr,arr[--idx]);
            }
            else if(arr.length==1)
            {
                arr =remove(arr,arr[idx]);
            }

            System.out.println("arr : ");
            for (int j=0;j<arr.length;j++)
            {
                System.out.println("i : "+arr[j]);
            }
        }
        System.out.println("Sum : "+sum);
    }
}
