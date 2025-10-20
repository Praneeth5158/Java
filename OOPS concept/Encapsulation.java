/*------Encapsulation=wrapping the data(variables) and code acting on data (methods )
together single unit
private= Only the class itself can access 
default= Accessible by classes in the same package(same folder)
protect= Accessible by classes in the same package and by child (subclass) classes
public= Accessible by everyone
*/

class Example {
    private int a = 10;         // Only inside this class
    int b = 20;                 // Default - same package
    protected int c = 30;       // Same package + child class
    public int d = 40;          // Accessible everywhere

    void show() {
        System.out.println(a + " " + b + " " + c + " " + d);
    }
}

class Child extends Example {
    void display() {
        // a can't be accessed here (private)
        System.out.println(b); // default
        System.out.println(c); // protected
        System.out.println(d); // public
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Example obj1 = new Example();
        Child obj2 = new Child();

        obj1.show();   // can access all from same class
        obj2.display();// can access default, protected, public
        System.out.println(obj1.d); // public variable can be accessed anywhere
    }
}
