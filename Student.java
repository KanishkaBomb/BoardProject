import java.util.Scanner;
public class Student
{
    String name;
    int roll;
    int marks1,marks2,marks3,marks4,marks5; 
    
    Scanner sc = new Scanner(System.in);
    
    void input() 
    { 
        System.out.println("Enter the name of the student");
        name = sc.nextLine();
        
        System.out.println("Enter the roll number of the student");
        roll = sc.nextInt();
        
        System.out.println("Enter the marks scored in subject 1");
        marks1= sc.nextInt();
        
        System.out.println("Enter the marks scored in subject 2");
        marks2 = sc.nextInt();
        
        System.out.println("Enter the marks scored in subject 3");
        marks3 = sc.nextInt();
        
        System.out.println("Enter the marks scored in subject 4");
        marks4 = sc.nextInt();
        
        System.out.println("Enter the marks scored in subject 5");
        marks5 = sc.nextInt();
     }
     
    
    void allotment()
    {
        double avg = (marks1 + marks2 + marks3 + marks4 + marks5)/5.0;
        System.out.println("Average Marks: " + avg);
        if(avg>=90)
        {
            System.out.println("Science with Computers");
        }
        else if(80<=avg && avg<=89)
        {
            System.out.println("Science without Computers");
        }
        else if(70<=avg && avg<=79)
        {
            System.out.println("Commerce with Maths");
        }
        else
        {
            System.out.println("Commerce without Maths");
        }
    }
    
    void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + roll);
        allotment();
    }
    
    public static void main()
    {
        Student obj = new Student();
        obj.input();
        obj.display();
    }
    
}