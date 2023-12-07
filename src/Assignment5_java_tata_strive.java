public class Assignment5_java_tata_strive {
    public static void main(String[] args) {
        String[] str= {"raza","mohiyaddeen","hi"};

        String name = "Raza";

        int s=0,e=name.length()-1;
        char temp =' ';

        // reversing for string
        for(int i=name.length()-1;i>=0;i--)
        {
            System.out.print(name.charAt(i));
        }
        System.out.println("");

        System.out.println("substring : "+name.substring(0,2));
        System.out.println("index of \"za\" : "+name.indexOf("za"));

        //reversing for string array
        for(int i=str.length-1;i>=0;i--)
        {
            System.out.print(str[i]+" ");
        }
    }
}
