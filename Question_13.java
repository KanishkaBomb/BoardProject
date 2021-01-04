import java.util.*;
class Question_13
{ 
    double[] temp; 
    int i;
    Question_13()
    { 
        temp=new double[5];
    }
    void input()
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println(" Enter the temperatures of 5 cities");
        for( i=0;i<temp.length;i++)
        {
          temp[i]=sc.nextDouble();
        }
    }
    void display()
    {
        for(int i=0;i<temp.length;i++)
        {
           System.out.print(" "+temp[i]+" ");
        }
        System.out.println();
    }
    void arrange()
    {  
        double swap;
        for(int i=0; i<temp.length; i++)
        {
          for(int j=0; j<temp.length-i-1; j++)
          { 
            if(temp[j]>temp[j+1])
            { 
                swap=temp[j];
                temp[j]=temp[j+1];
                temp[j+1]=swap;
            }
          }
        } 
        display();
    }
    public static void main()
    { 
        Question_13 obj= new Question_13();
        obj.input();
        obj.arrange();
    }
}