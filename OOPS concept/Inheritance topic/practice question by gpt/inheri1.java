/*Create a Java program using single inheritance where:

A Parent class named Vehicle has a method display() that prints “This is a vehicle.”

A Child class named Car inherits from Vehicle and has another method show() that prints “This is a car.”

In the main() method, create an object of Car and call both methods.

*/

class vehicle{
    void display(){
        System.out.println("This is a vehicle");
    }
}
class car extends vehicle{
    void show(){
        System.out.println("This is a car");
    }
}
public class inheri1{
    public static void main(String args[]){
        car obj=new car();
        obj.display();
        obj.show();
    }
}