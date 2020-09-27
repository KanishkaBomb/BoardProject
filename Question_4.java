//Bank deposit
import java.util.Scanner;
public class Question_4
{    
    int ch;
    double P,r,n;
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Principal/monthly installment");
        P=sc.nextDouble();
        System.out.println("Enter the rate of interest");
        r=sc.nextDouble();
        System.out.println("Enter the time period");
        n=sc.nextDouble();
        System.out.println("Enter 1 or 2 based on your choice:"+"\n"+"1. Term Deposit");// asking the user for his/her choice
        System.out.println("2. Recurring Deposit");
        ch=sc.nextInt();
    }
    void result()
    {
         double A=0;
         switch(ch)
        {
           case 1:
           A=P*Math.pow((1+r/100),n); // term deposit 
            System.out.println(A);
            break;
        case 2:
         A=(P*n)+(((n*(n+1))/2)*(r/100)*(1/12)); //recurring deposit
         System.out.println(A);
         break;
        default:
        System.out.println("Invalid number entered");
        }
    }
    public static void main()
    {
        Question_4 obj = new Question_4();
        obj.input();
        obj.result();
    }
    }