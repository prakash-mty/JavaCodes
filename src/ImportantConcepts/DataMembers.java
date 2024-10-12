package ImportantConcepts;

public class DataMembers {

        //class: collection of data members and methods
         //data members
        int age = 20;
        String name="Prakash";
        int id=345;
        //methods
    public void display()
    {
        System.out.println(age+" "+name+" "+" "+id);
    }
    public static void main(String[] args)
    {
        //creating object : object is an instance of class
        DataMembers obj1 = new DataMembers();
        obj1.display();
      System.out.println(obj1.age+" ");
        System.out.println(obj1.id);
        System.out.println(obj1.name);
    }
}
