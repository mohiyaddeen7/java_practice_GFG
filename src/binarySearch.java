import java.util.Arrays;

public class binarySearch {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        int searchEle = 10;

        int s=0,e= arr.length-1;
        int mid =((e-s)/2)+s;
        int i;
        for(i=0;i<arr.length;i++)
        {
            if(arr[mid]==searchEle)
            {
                System.out.println("got the element at index "+mid);
                break;
            }
            else if(searchEle>arr[mid])
            {
                s=mid+1;
            }
            else{
                e=mid-1;
            }
            mid =((e-s)/2)+s;
        }
        if(i==arr.length)
        {
            System.out.println("element not found");
        }
    }
}
