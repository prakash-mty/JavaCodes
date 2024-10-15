package OopsConcepts;

public class ConstructorOverloading {
    int age;
    String name;

    public ConstructorOverloading(int age, String name) {
        this.age = age;
        this.name = name;
    }

    //constructor overloading
    ConstructorOverloading(int i) {
        System.out.println("Inside one argument constructor");
        System.out.println(i + " ");
    }

    //constructor overloading
    ConstructorOverloading(int a, int b) {
        System.out.println("Inside two argument constructor");
        System.out.println("a = " + a + " b= " + b);
    }

    void display() {
        System.out.println("Age =" + age + " Name= " + name);
    }

    public static void main(String[] args) {
        ConstructorOverloading obj = new ConstructorOverloading(10);
        ConstructorOverloading obj1 = new ConstructorOverloading(45, 68);
        ConstructorOverloading obj2 = new ConstructorOverloading(65, "Pointing");
        ConstructorOverloading obj4 = new ConstructorOverloading(35, "Ricky");
        obj1.display();
        obj2.display();
    }
}
