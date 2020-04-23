// WAP to calculate the SI if P= 2000, R%=3.5, T= 2 using non-interactive 
class Simple_Interest
{
    double p,t,r,SI;
    void init()
    {
        p=2000;
        r=3.5;
        t=2;
    }
    void calc()
    {
      SI=(p*r*t)/100;
    }
    void disp()
    {
        System.out.println("The simple interest is"+ SI);
    }
}