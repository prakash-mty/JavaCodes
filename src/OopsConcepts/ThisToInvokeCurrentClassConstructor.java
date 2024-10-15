package OopsConcepts;

public class ThisToInvokeCurrentClassConstructor {
    // Java code for using this() to
    // invoke current class constructor
    int a;
    int b;

    public ThisToInvokeCurrentClassConstructor(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Inside Parameterised constructor");
    }

    //default constructor
    ThisToInvokeCurrentClassConstructor() {
        //call to this is possible only inside a constructor
        //this should be the first statement inside the constructor
        this(25, 35);//invoke parameterised constructor
        System.out.println("Inside default constructor");
    }

    public static void main(String[] args) {
        ThisToInvokeCurrentClassConstructor obj = new ThisToInvokeCurrentClassConstructor();
    }
}
