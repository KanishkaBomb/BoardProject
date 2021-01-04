import java.util.*;
public class Park
{
    Scanner sc = new Scanner(System.in);
    double EntryFee,Discount,Amount;
    int Age;
    
    Park()
    {
        EntryFee = 0.0;
        Discount = 0.0;
        Amount = 0.0;
        Age = 0;
    }
    
    void Input()
    {
        System.out.println("Enter your age.");
        Age = sc.nextInt();
        System.out.println("Enter your Entry Fee.");
        EntryFee = sc.nextDouble();
    }
    
     void Display()
    {
        System.out.println("Age: " + Age);
        System.out.println("Entry Fee: " + EntryFee);
    }
    
     void Calculate()
    {
        if(Age<=12)
        {
            System.out.println("Discount On Entry Fee: 45 %" );
            Discount = (EntryFee*(45.0/100.0));
            Amount = EntryFee - Discount;
        }
        else if(Age>=50)
        {
            System.out.println("Discount On Entry Fee: 50 %" );
            Discount = (EntryFee*(50.0/100.0));
            Amount = EntryFee - Discount;
        }
        else
        {
            System.out.println("Discount On Entry Fee: 10 %" );
            Discount = (EntryFee*(10.0/100.0));
            Amount = EntryFee - Discount;
        }
        System.out.println("Discount: " + Discount );
        System.out.println("Total Amount TO Be Paid: " + Amount );
        }
    
    public static void main()
    {
        Park obj = new Park();
        obj.Input();
        obj.Display();
        obj.Calculate();
    }
}
