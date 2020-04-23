// WAP to calc area of circle if r=10.5 cm,pi=3.14 using non interactive input
class Circle_area
{
    double r,area;
    final double pi=3.14;
    void init()
    {
        r=10.5;
    }
    void calc()
    {
        area=pi*r*r;
    }
    void disp()
    {
        System.out.println("The area of the circle is "+ area);
    }
}