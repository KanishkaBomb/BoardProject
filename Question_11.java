import java.util.*;
public class Question_11
{
    Scanner sc = new Scanner(System.in);
    
    int n;
    int roll [];
    String name [];  
    int marks1 [];
    int marks2 [];
    int marks3 [];
    
    Question_11()
    {
       System.out.println("Enter the number of students");
       n = sc.nextInt();
       roll = new int [n];
       name = new String [n];
        marks1 = new int [n];
        marks2 = new int [n];
        marks3= new int [n];
    
    }
    
    void input()
    { 
        
        for(int i=0; i <n; i++)
        {
            System.out.println("Enter the roll number of the student");
            roll [i] = sc.nextInt();
        
        
            System.out.println("Enter the name of the student");
            name [i] = sc.next();
        
        
            System.out.println("Enter the marks scored in subject 1");
            marks1 [i] = sc.nextInt();
        
       
            System.out.println("Enter the marks scored in subject 2");
            marks2 [i] = sc.nextInt();
        
        
            System.out.println("Enter the marks scored in subject 3");
            marks3 [i] = sc.nextInt();
        }
    }
    
    void result()
    {
        for(int i=0; i < n; i++)
        {
            int avg = (marks1[i] + marks2[i] + marks3 [i])/3;
            if(85<=avg && avg<=100)
            {
                System.out.println("EXCELLENT");
                
            }
            else if(75<= avg && avg <= 84)
            {
                System.out.println("DISTINCTION");
            }
            else if(60<=avg && avg<=74)
            {
                System.out.println("FIRST CLASS");
            }
            else if(40<=avg && avg<=59)
            {
                System.out.println("PASS");
            }
            else
            {
                System.out.println("POOR");
            }
        }
    }
    
    public static void main()
    {
        Question_11 obj = new Question_11();
        obj.input();
        obj.result();
    }
}