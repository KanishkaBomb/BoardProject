//WAP to calc area of circle if r=10.5 cm and pi=3.14 using interactive input
class Circle_area2
{
    double r1,area;
    final double pi=3.14;
    
    void init(double r)
    {
        r1=r;
    }
    void calc()
    {
        area=pi*r1*r1;
    }
    void disp()
    {
        System.out.println("The area of the circle is " + area);
    }
}