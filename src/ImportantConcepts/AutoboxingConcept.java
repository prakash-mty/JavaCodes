package ImportantConcepts;

import java.util.ArrayList;

public class AutoboxingConcept {
    public static void main(String[] args) {
        //autoboxing: converting primitive to object by Wrapper class
        int i = 10;//primitive type
        Integer j = i;//converting to Integer object
        System.out.println(j + " ");
        int a = 10;
        int b=0;
        ArrayList<Integer> list = new ArrayList<>();
        for (int k = 1; k < 10; k++) {
             b +=a;
            list.add(b);//autoboxing
        }
        for (int m : list) { //unboxing: wrapper type to primitive type
            //System.out.print(list.get(m)+" "); error as m is not index it is the value stored in list
            System.out.print(m + " ");
        }
    }
}
