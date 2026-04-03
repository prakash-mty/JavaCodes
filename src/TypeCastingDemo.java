public class TypeCastingDemo{
    public static void main(String[] args)
    {
        // Implicit Type Casting
        int myInt = 12;
        double myD=myInt; // Automatic casting: int to double
        System.out.println("Implicit Type Casting:");
        System.out.println("Integer value: " + myInt);
        System.out.println("Double value: " + myD);
        System.out.println();

        //Explicit type casting
        double myDouble = 9.456;
        float myfloat = (float)myDouble; // Manual casting: double to float
        System.out.println("Explicit Type Casting:");
        System.out.println("Double value: " + myDouble);
        System.out.println("Float value: " + myfloat);
    }
}