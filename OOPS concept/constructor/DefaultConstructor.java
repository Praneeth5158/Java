//============Default constructor=============
//A constructor is a special method in Java that runs automatically when an object is created.
//It is used to initialize variables of the object 
class Bike{
    Bike (){
        System.out.println("This is an example for default constructor");
    }
}
class DefaultConstructor{
    public static void main(String[] args) {
        Bike obj=new Bike();
//we dont need to call the constructor by defaultly it will called automatically when object is created
    }
}