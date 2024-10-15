package OopsConcepts;

public class MultiLevelInheritance {//can be written at last

    public static void main(String[] args) {
        BabyDog obj = new BabyDog();
        obj.eat();
        obj.bark();
        obj.weep();
    }
}

class Animal {
    void eat() {
        System.out.println("eating........");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Barking........");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("Weeping........");
    }
}
