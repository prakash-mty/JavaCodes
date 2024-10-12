package ImportantConcepts;

public class TypeCastingDemo {
    //converting one primitive data type to another primitive data type is called casting
    //widening
    public static void main(String[] args)
    {
        int n=125;
        long l=n;//converting smaller data type to larger data type widening
        //byte-->short-->char-->int-->long--->float--->double
        System.out.println(l+" ");

        //narrowing
        double d = 1234.543;
        int i = (int)d;//converting larger data type to smaller data type
        System.out.println(i+" ");
    }
}
