import java.util.Scanner;
public class Employee 
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
    
    double calc_salary()
    {
        double total_salary = base_salary + ((50.0/100.0) * base_salary);
        return total_salary;
    }
    
    public static void  main()
    {
        Employee obj = new Employee();
        obj.init();
        System.out.println("Name of the employee:" + obj.name);
        System.out.println("Total salary:" + obj.calc_salary());
        
    }
}