package OopsConcepts;

public class ConstructorDemo {
    //constructor, same as class name no return type
    public  ConstructorDemo()
    {
        System.out.println("Inside default constructor: ");
    }
    public static void main(String[] args)
    {
        //default constructor is get called
        ConstructorDemo obj = new  ConstructorDemo();
    }
}
