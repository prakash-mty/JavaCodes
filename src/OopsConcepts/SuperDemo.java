package OopsConcepts;

class A {
    public A() {
        System.out.println("Parent Class default constructor");
    }
    //parameterised constructor
    public A(int i) {
        System.out.println("Parent class parameterised constructor with val: " + i);
    }
}

public class SuperDemo extends A {
    //super should be the first statement inside a constructor like this keyword
    //We can use either super or this
    //It is used to call parent class constructor
    // At a time we can have one super keyword
    //default constructor
    public SuperDemo() {
        //calling parent class parameterised constructor
        super(10);//calls only parameterized const. & super() by default created and calls parent class default constructor
        System.out.println("Child class constructor");
    }

    public static void main(String[] args) {
        SuperDemo obj = new SuperDemo();
    }
}

