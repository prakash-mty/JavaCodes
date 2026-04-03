public class InstanceVariable {
    int instanceVar = 20;
    int demoInst= 30;
    public static void main(String[] args)
    {
        InstanceVariable obj1 = new InstanceVariable();
        System.out.println("Instance Variable: " + obj1.instanceVar);
        InstanceVariable obj2 = new InstanceVariable();
        System.out.println("Demo Instance Variable: " + obj2.demoInst);
    }
    
}
