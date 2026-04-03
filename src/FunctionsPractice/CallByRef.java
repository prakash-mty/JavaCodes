package FunctionsPractice;

public class CallByRef {
    int temp =5;
    void valChange(CallByRef obj)
    {
        obj.temp =10;
        System.out.println("Value of temp inside the method: " + obj.temp);
    }
    public static void main(String[] args)
    {
        CallByRef obj1 = new CallByRef();
        obj1.valChange(obj1);
        System.out.println("Value of temp outside the method: " + obj1.temp); //reference variable is passed to the function and the value of temp is changed to 10
    }
    // different objects point to the same memory location, 
    // so when we change the value of temp using obj1,
    //  it changes for all objects that point to the same memory location.
    //  This is known as call by reference in Java.
    /*first obj1 → used to call the method
second obj1 → passed as argument 
Java copies the value of the reference into obj1 */
    
}
