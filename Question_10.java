public class Question_10
{
    void patterns()
    {    
    for(int i=1;i<=5;i++)
     {
            System.out.print(i);
            for(int j=1;j<=i;j++)
            {
               if(j%2==0)
               {
                   System.out.print(" * ");
                   }
                   else 
                   {
                       System.out.print(" # ");
                    }
            }
            System.out.println();
    }
    for(int i=1;i<=5;i++)
    {
            for(int j=5;j>=i;j--)
            {
               System.out.print(j);
            }
            System.out.println();
    }
    }
    public static void main()
    {
        Question_10 obj= new Question_10();
        obj.patterns();
    }
}