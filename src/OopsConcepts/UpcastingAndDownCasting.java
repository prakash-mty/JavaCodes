package OopsConcepts;

class Parent {
    void show() {
        System.out.println("This is parent class method.");
    }
    void display()
    {
        System.out.println("Inside display method");
    }
}

class ChildNew extends Parent {
    //method overriding
    void show() {
        super.show();
        System.out.println("This is child class method");
    }
}

public class UpcastingAndDownCasting {
    public static void main(String[] args) {
        Parent p = new Parent();
       // p.show();//--->parent class method
        p = new ChildNew();//upcasting

        p.display();
        p.show();//upcasting so type casting optional--> child class method--->overridden so to get parent class
        //method we need to add super inside child class overridden method.
        ChildNew c = (ChildNew) p;//down casting
        c.show();
    }
}

