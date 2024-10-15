package OopsConcepts;

public class ThisKeyWordInstanceVar {
    // Java code for using 'this' keyword to
// refer current class instance variable
    int a;
    int b;

    //parameterised constructor
    ThisKeyWordInstanceVar(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void display() {
        System.out.println("a= " + a + " b= " + b);
    }

    public static void main(String[] args) {
        ThisKeyWordInstanceVar obj = new ThisKeyWordInstanceVar(10, 20);
        obj.display();
    }
}
