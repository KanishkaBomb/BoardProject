/*6. WAP to check whether a number is a valid ISBN number or not.
The International Standard Book Number (ISBN)’ which is a unique number. By this number, we can find any book. It is a 10 digit number. The ISBN is legal if 1*digit1 + 2*digit2 + 3*digit3 + 4*digit4 + 5*digit5 + 6*digit6 + 7*digit7 + 8*digit8 + 9*digit9 + 10*digit10 is divisible by 11.
Example: For an ISBN "1259060977"
Sum = 1*10 + 2*9 + 5*8 + 9*7 + 0*6 + 6*5 + 0*4 + 9*3 + 7*2 + 7*1 = 209
Now divide it with 11 = 20%/11 = 0. If the resultant value will be Zero then it is a valide ISBN.
*/
import java.util.*;
public class Question_6
{
    long num, sum = 0L;
    int count=0;
    void input()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check if it's a valid ISBN number");
        num = sc.nextLong();
    }
    
    void check()
    {
       int i =1;
       long temp = num;
       while(temp!=0)
       {
          long rem = temp%10;
          sum= sum + rem*i++;
          temp = temp/10;
          count++;
       }
       
    }
    
    void display()
    {
        
        if(sum%11 == 0 && count == 10)
        {
            System.out.println("It is a valid ISBN number");
        }
        else
        {
            System.out.println("It is an invalid ISBN number");
        }
    }
    
    public static void main()
    {
        Question_6 obj = new Question_6();
        obj.input();
        obj.check();
        obj.display();
    }
}