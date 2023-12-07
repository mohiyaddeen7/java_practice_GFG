public class pyramid_pattern_number {
    public static void main(String[] args) {
        int n=5;

        for(int i=0;i<n;i++)
        {
            int count=i;
            int flag=i;
            for (int j=0;j<2*n;j++)
            {
                if((4-i)<=j)
                {
                    if(j>4)
                    {
                        if(count>0)
                        {

                            flag--;
                            System.out.print(flag);
                            count--;
                        }
                    }
                    else
                    {
                        flag++;
                        System.out.print(flag);
                    }

                }
                else {

                    System.out.print(" ");
                }

            }

            System.out.println("");
        }
    }
}
