//Bank deposit
import java.util.Scanner;
public class Question_4
{    
    int choice;
    double P,r,n;
    void input()
    {
        if(choice == 1 || choice==2)
        {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Principal/monthly installment based on your choice");
        P=sc.nextDouble();
        System.out.println("Enter the rate of interest");
        r=sc.nextDouble();
        System.out.println("Enter the time period");
        n=sc.nextDouble();
       }
    }
    
    void result()
    {
         double A=0;
         switch(choice)
        {
            case 1:
            A=P*Math.pow((1.0+r/100.0),n); // term deposit 
            System.out.println(A);
            break;
            case 2:
            A=(P*n)+((P*((n*(n+1.0))/2.0))*(r/100.0)*(1.0/12.0)); //recurring deposit
            System.out.println(A);
            break;
            default:
            System.out.println("Invalid number entered");
        }
    }
    
    public static void main()
    {
        Question_4 obj = new Question_4();
        Scanner sc= new Scanner(System.in);
        char opt;
        do
        {
          System.out.println("\f");
          System.out.println("What would you like to do?");
           System.out.println("1. Term Deposit");// asking the user for his/her choice
          System.out.println("2. Recurring Deposit");
          obj.choice =sc.nextInt();
          obj.input();
          obj.result();
          System.out.println("Enter y to continue or any other character to exit.");
          opt  = sc.next().charAt(0);
        } while (opt == 'y');
    }
}