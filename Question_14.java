import java.util.*;
class Question_14
{ 
    double[] array; 
    
     Question_14()
    { 
        array =new double[10];
    }
    
     void init()
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 10 numbers");
        for(int i=0;i<array.length;i++)
        {
           array[i]=sc.nextDouble();
        }
    }
    
    void arrange()
    {  
        double sum=0.0;
        for(int i=0;i<array.length;i++)
        {
          sum=sum+array[i];
        }
          double avg= sum/10.0;
        for( int i=0;i<array.length;i++) 
        {
              if(array[i]>avg)
            { 
                System.out.println(array[i]);
            }
        }
    }
    
    public static void main()
    {
        Question_14 obj = new Question_14();
        obj.init();
        obj.arrange();
    }
}