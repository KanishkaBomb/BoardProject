//WAP to generate 20 unique random numbers within the range of 1 to 100
public class Question_3
{
    void rand()
    {
        int max=100;
        int min= 1;// storing the maximum and minimum value
        for(int i =1;i <=20;i++)
        {
            
            System.out.println( Math.random()*(max-min+1)+min);
        }
    }
    public static void main()
    {
        Question_3 obj = new Question_3();
        obj.rand();
    }
}