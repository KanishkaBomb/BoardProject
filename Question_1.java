//WAP to print Floyd's right angled triangle using natural numbers
public class Question_1
{
    void pattern()
    {
        int p= 0;
        for(int i=1;i<=4;i++)
        {
           for(int j=1;j<=i;j++)
           {
              p =p+1;
              System.out.print(p + " ");
              
           }
            System.out.println();
        }
        }
    public static void main()
    {
         Question_1 obj = new Question_1 ();
         obj.pattern();
    }
}
               