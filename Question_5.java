import java.util.Scanner;
public class Question_5
{
    Scanner sc= new Scanner(System.in);
    int choice;
    int n;
    void input()
    {
       System.out.println("What would you like to do?");
       System.out.println("Enter 1 for pattern 1");
       System.out.println("Enter 2 for pattern 2");//asking the user to enter his/her choice 
       choice= sc.nextInt(); 
    }
    
    void pattern()
    {
      if(choice==1)
      {
        System.out.println("Enter the number of lines/terms till you want to print the pattern");
        n = sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
      }
      else if(choice==2)
      {
         System.out.println("Enter the number of lines/terms till you want to print the pattern");
         n = sc.nextInt(); 
        for(int i =n ;i>0;i--)
        {
            for(int j =1; j<=i; j++)
            {
                System.out.print("5"+" ");
            }
            System.out.println();
        }
      }
      else
      {
         System.out.println("Wrong entry");
      }
    }
    
    public static void main()
    {
        Question_5 obj = new Question_5();
        Scanner sc= new Scanner(System.in);
        char opt;
        do
        { 
          System.out.println("\f");
          obj.input();
          obj.pattern();
          System.out.println("Enter y to continue or any other character to exit");
          opt = sc.next().charAt(0);
        } while(opt == 'y');
    }
}