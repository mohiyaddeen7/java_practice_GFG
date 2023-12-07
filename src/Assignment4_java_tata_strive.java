public class Assignment4_java_tata_strive {
    public static void main(String[] args) {
        String str1 = "Mo Raza";
        String str2 = "Raza";

        int k=0;

        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)==str2.charAt(k))
            {
                k++;
            }
            else{
                k=0;
            }
            if(k==str2.length())
            {
                System.out.println(i-str2.length()+1);
                break;
            }
        }
    }
}
