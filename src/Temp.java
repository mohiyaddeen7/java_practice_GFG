import java.util.Arrays;
import java.util.Scanner;

public class Temp
{

    public static String rev(String str,int s, int e)
    {
        char temp = ' ';
        String result = "";
        result =str;
        while(s<=e)
        {
            temp =result.charAt(e);
            System.out.println("temp : "+temp);
            result=result.substring(0,e)+result.charAt(s)+result.substring(e+1,str.length());
            System.out.println("result1 : "+result);
            result=result.substring(0,s)+temp+result.substring(s+1,str.length());
            System.out.println("result2 : "+result);;
            s++;
            e--;
        }
        return result;
    }

    public static void main(String[] args)
    {
        String str = "hi mohiyaddeen";
        //Write your code here
        int i=0,j=str.length()-1;
        System.out.println(" i: "+i +" j : "+j);
        String result  = rev(str,i,j);

        j=result.indexOf(" ")-1;
        result = rev(result,i,j);

        j=result.indexOf(" ",j+2);
        if(j==-1){
            i=result.indexOf(" ")+1;
            j=str.length()-1;
            result=rev(result,i,j);
        }

        System.out.println("reverse  str in main : "+result);

    }
}