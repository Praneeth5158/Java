/*Polymorphism (Method Overriding)
Create a class Shape with a method area().
Derive classes Circle and Rectangle that override the area() method to calculate and display their respective areas.
Create objects for both and call their area() methods */

class Shape{
    void area(){

    }
}
class Circle extends Shape{
    void area(){
        int r=4;
        double v=3.14*r*r;
        System.out.println(v);
    }
}
class Rectangle extends Shape{
    void area(){
        int l=20;
        int b=30;
        System.out.println(l*b);
    }
}
class prblm3{
    public static void main(String[] args){
        Circle obj1=new Circle();
        Rectangle obj2= new Rectangle();
        obj1.area();
        obj2.area();
    }
}