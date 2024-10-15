package OopsConcepts;
class AnimalNew
{
    void run()
    {
        System.out.println("Running.....");
    }
}
class Tiger extends AnimalNew{
    void runTiger()
    {
        System.out.println("Tiger Running.....");
    }
}
class Cat extends AnimalNew{
    void runCat()
    {
        System.out.println("Cat is running.........");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args)
    {
        Tiger obj = new Tiger();
        obj.run();
        obj.runTiger();
        Cat obj1 = new Cat();
        obj1.run();
        obj1.runCat();
    }
}
