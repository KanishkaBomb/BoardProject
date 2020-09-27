import java.util.Scanner;
public class Question_2
{
    String name;
    float base_salary;
    
    void init()
    {
        Scanner que2 = new Scanner(System.in);
        System.out.println("Enter the name of the employee.");
        name = que2.nextLine();
        System.out.println("Enter the base salary of the employee.");
        base_salary = que2.nextFloat();
    }
    
    void calc_salary()
    {
        double total_salary = base_salary + ((50/100) * base_salary);
        System.out.println("Total salary:" + total_salary);
    }
    
    public static void  main()
    {
        Question_2 obj = new Question_2();
        obj.init();
        System.out.println("Name of the employee:" + obj.name);
        obj.calc_salary();
    }
}