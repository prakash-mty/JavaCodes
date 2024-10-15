package OopsConcepts;

class ParentTest {
    void SingleLevelDemo() {
        System.out.println("Inside single level method");
    }
}

class Child extends ParentTest {
    void childMsg() {
        System.out.println("Inside child method");
    }
}

public class SingleLevelInheritance {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.childMsg();
        obj.SingleLevelDemo();
    }
}
