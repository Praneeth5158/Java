//==========Single Inheritance======//
//parent class
class parent{
    void function(){ //th
        System.out.println("the statement which is present in the parent class");
    }
}
//child class
class child extends parent{
    void function2(){
        System.out.println("the statement which is present in the child class");
    }
}
// we need to create the object for the child class why bcz here we are extends 
//the parents class know so all the details of the parent class are in the child class
//so just we create the object for the child class it will work
public class single_inheritance{
    public static void main(String args[]){
        child obj=new child();
        obj.function();
        obj.function2();
    }
}