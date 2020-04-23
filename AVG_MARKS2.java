// WAP to calculate the avg marks of a student for scores of 3 subjects using interactive 
class AVG_MARKS2
{
    int comp1,lit1,his1;
    double avg;
    void init(int comp,int lit,int his)
    {
        comp1= comp;
        lit1= lit;
        his1= his;
    }
    void calc()
    {
        double sum=(double) (comp1+lit1+his1);
        avg = sum/3;
    }
    void disp()
    {
        System.out.println(" The avg marks are " + avg);
    }
}