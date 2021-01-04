import java.util.*;
class Question_12
{ 
    char [] array; 
    int i;
    Question_12()
    { 
        array =new char[20];
    }
    void input()
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 20 alphabets to arrange them in descending order");
        for( i=0;i<array.length;i++)
        {
          array[i]=sc.next().charAt(0);
        }
    }
    void display()
    { 
        for(i=0;i<array.length;i++)
        { 
            System.out.print(" "+ array[i] +" ");
        }
        System.out.println();
    }
    void arrange()
    {  
        char temp;
        for(i=0; i<array.length; i++) 
        {
           for(int j=0; j<array.length-i -1; j++)  
           { 
             if(array[j] < array[j+1])
             { 
                temp=array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
             }
           }
        }   
        display();
   }
   public static void main()
   {   
        Question_12 obj= new Question_12();
        obj.input();
        obj.arrange();
   }
}