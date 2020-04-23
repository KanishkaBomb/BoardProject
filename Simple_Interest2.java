// WAP to calculate the SI if p=2000,r=3.5 and t= 2 using interactive input
class Simple_Interest2
{
    double p1,r1,t1,SI; // instance variable
    void init(double p,double r,double t)//local variable
    {
        p1=p;
        r1=r;
        t1=t;
    }
    void calc()
    {
        SI=(p1*r1*t1)/100;
    }
    void disp()
    {
        System.out.println(" The simple interest is "+ SI);
    }
}