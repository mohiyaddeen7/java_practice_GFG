import java.util.Arrays;

public class lcmof2no {
    public static void main(String[] args) {
        int a=27;
        int b=7;
        int ans;
//        if(a>b)
//        {
//            ans=a;
//
//
//        }else{
//            ans=b;
//        }
//        while(true){
//            if(ans%a==0 && ans%b==0){
//                break;
//
//            }
//            ans++;
//        }
//        System.out.println(ans);
        int[] arr = {1,2,3,5,7,11,13};
        int[] arr1 = new int[1];
        int[] arr2 = new int[3];
        int j=0;

        if (a%b==0)
        {
            System.out.println("lcm is = "+ a);
        }

        for (int i=1;i<arr.length;i++)
        {
            if(a%arr[i]==0)
            {

                arr1[j]=arr[i];
                j++;
            }
        }

        for (int i=1;i<arr.length;i++)
        {
            if(b%arr[i]==0)
            {

                arr2[j]=arr[i];
                j++;
            }
        }
//        System.out.print(" first array");
//        for(int i: arr1)
//        {
//
//            System.out.print(" "+i+" ");
//        }
//        System.out.println();
//        System.out.print(" second array");
//        for(int i: arr2)
//        {
//            System.out.print(" "+i+" ");
//        }
//
//        int[] arrMatch = new int[5];
//        int k=0;
//
//        for (int i=0; i<arr1.length;i++ )
//        {
//            for (int jj=0;jj< arr2.length;jj++)
//            {
//                if(arr1[i]==arr2[jj] && arr1[i]!=0)
//                {
//                    arrMatch[k]=arr1[i];
//                    k++;
//                }
//            }
//        }
//        System.out.println();
//        System.out.print(" third array");
//        for(int i: arrMatch)
//        {
//
//            System.out.print(" "+i+" ");
//        }
//
///*
//        for(int i=0;i< arr1.length;i++)
//        {
//            System.out.println(arr1[i]);
//        }
//        */
//
//
}
}
