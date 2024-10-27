package OopsConcepts;

public class PolymorphismMethodOverloading {

    public void sum(int i,int j)
    {
        int sum = i+j;
        System.out.println("Sum = "+sum);
    }
    //method overloading
    public int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static void main(String[] args)
    {
        PolymorphismMethodOverloading o1 = new PolymorphismMethodOverloading();
        o1.sum(20,45);//compile time polymorphism
        System.out.println("Sum = "+o1.sum(34,56,78));
    }
}
