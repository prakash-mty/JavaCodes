public class LocalVariableDemo {
    public int printLocalVariable()
        {
            int lacal = 10; // local variable must be initialized before use
            return lacal;
        }
    public static void main(String[] args)
    {
        LocalVariableDemo obj = new LocalVariableDemo();

           System.out.println("Local variabl is: "+obj.printLocalVariable());
    }
    
}
