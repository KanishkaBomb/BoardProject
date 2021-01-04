import java.util.Scanner;
public class Question_9
{
    
     void series1()
    {
        double sum = 0;
        for(double i =2;i<=20;i+=2)
        {
            if(i%4==0)
            {
               sum = sum-i; //pattern 1
            }
            else
            {
                sum= sum+i;
            }
        }
        System.out.println(sum);
    }
    
     void series2()
    {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter x for the second series"); // user will enter the value
        int x = sc.nextInt();
        
        double sum1=0;
        for(double i =2;i<=20;i+=3.0)
        {
            sum1= sum1+x/i; //pattern 2
        }
        System.out.println(sum1);
    }
    
    public static void main()
    {
        Question_9 obj= new Question_9();
        obj.series1();
        obj.series2();
    }
}
        