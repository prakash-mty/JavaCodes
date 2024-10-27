package OopsConcepts;

class Parent {
    void show() {
        System.out.println("This is parent class method.");
    }
}

class ChildNew extends Parent {
    //method overriding
    void show() {
        System.out.println("This is child class method");
    }
}

public class UpcastingAndDownCasting {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.show();//--->parent class method
        p = new ChildNew();
        p.show();//upcasting so type casting optional--> child class method
        ChildNew c = (ChildNew) p;//down casting
        c.show();
    }
}

