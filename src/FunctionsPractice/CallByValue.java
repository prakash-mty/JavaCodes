package FunctionsPractice;

public class CallByValue{
    static void displayValue(int x)
    {
        System.out.println("value inside the function before update: " + x);
        x =20;//only local copy changes, actual value of a will not change
        System.out.println("value inside the function: " + x);
    }
    
    public static void main(String[] args)
    {
        int a = 50;
        displayValue(a);
        System.out.println("value outside the function: " + a);
    }
    //call by value means a copy of the actual parameter is passed to the function.
}