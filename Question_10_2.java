public class Question_10_2
{
    void pattern2()
    {
      for(int i=1;i<=5;i++)
      {
            for(int j=5;j>=i;j--)
            {
               System.out.print(" "+ j + " ");
            }
            System.out.println();
      }
    }
    
    public static void main()
    {
        Question_10_2 obj = new Question_10_2();
        obj.pattern2();
    }
}