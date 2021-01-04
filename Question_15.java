import java.util.*;
public class Question_15
{
    Scanner sc = new Scanner(System.in);
    int [] AW;
    Question_15()
    {
        AW = new int [8];
    }
    
    void display()
    {
        for(int i =0; i<AW.length;i++)
        {
            if(AW[i]%10==3)
            {
                System.out.println(AW[i]);
            }
        }
    }
    
    void last_digit_3()
    {
        for(int i =0; i<AW.length;i++)
        {
            System.out.println("Enter the value for each index");
            AW [i] = sc.nextInt();
        }
        display();
    }
    
    public static void main()
    {
        Question_15 obj = new Question_15();
        obj.last_digit_3();
    }
}