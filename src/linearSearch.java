public class linearSearch {
    public static void main(String[] args){

        int[] arr={1,2,40,4,55,3,45,20};

        int searchEle = 4;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==searchEle)
            {
                System.out.print("Got the element at index "+i);
                break;
            }
        }

    }
}
