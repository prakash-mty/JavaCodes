public class StaticVar {
    static int var = 14; //static variable is shared among all instances of the class.
    public static void main(String[] args)
    {
        var = 20;
        int accessVar = StaticVar.var;
        System.out.println(accessVar);
    }
}
