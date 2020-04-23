//WAP to calculate the avg marks of a student for scores of 3 subjects using non interactive input
class AVG_MARKS
{
    int comp,lit,his;
    double avg;
    void init()
    {
        comp=97;
        lit=98;
        his=100;
    }
    void calc()
    {
        double sum=(double) (comp+lit+his);
        avg = sum/3;
    }
    void disp()
    {
        System.out.println(" The avg marks are " + avg);
    }
}
        