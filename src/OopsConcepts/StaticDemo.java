package OopsConcepts;

class Sample {
    int m;
    static int n;

    //nonstatic method
    public void nonStatic() {
        m = 10;
        n = 20;
    }

    //static  method
    static void staticMethod() {
        //m=50;---> error as static methods can access only static members
        n = 90;
    }

    void display() {
        System.out.println("m= " + m + "n= " + n);
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        Sample obj = new Sample();
        obj.nonStatic();
        obj.display();//m= 10 n= 20
        Sample obj1 = new Sample();
        obj1.display();//m= 0 n= 20
        obj1.nonStatic();
        obj1.display();//m= 10 n= 20
        Sample.n = 100;
        obj.display();//m= 10 n= 100
        obj1.display();//m= 10 n= 100
    }
}
