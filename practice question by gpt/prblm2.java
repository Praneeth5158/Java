/*Inheritance
Problem: Create a base class Animal with a method sound(). Derive classes Dog and Cat that override the sound() method to print “Barks” and “Meows”.*/
class Animal{
    void sound(){
        
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat Meows");
    }
}
class prblm2{
    public static void main(String[] args) {
        Dog obj1=new Dog();
        Cat obj2=new Cat();
        obj1.sound();
        obj2.sound();
    }
}
