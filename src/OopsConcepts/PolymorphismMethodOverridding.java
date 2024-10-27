package OopsConcepts;

class Vehicle {
    void ride() {
        System.out.println("car driving.....");
    }
}

class Bike extends Vehicle {
    void ride() {
        super.ride();
        System.out.println("Bike riding......");
    }
}

public class PolymorphismMethodOverridding {
    public static void main(String[] args) {
        Bike b = new Bike();
        //b.ride();
        //To access parent class ride method
        //Vehicle v = new Vehicle();
       // v.ride();---> parent class ride method
        //to access parent class method through child class we need to add super keyword in child ride method
        b.ride();//returns both parent and chile class ride as we added super keyword
    }
}
