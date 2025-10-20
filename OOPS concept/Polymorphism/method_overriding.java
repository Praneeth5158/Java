//----Method overriding(run time)=same method name but different classes
//two methods ki same name ichi and child class ki object create cheseytappudu
//we can acceess only child method to overcome this we are using "super.methodname()"
class animal{
    void display(){
        System.out.println("this is an animal");
    }
}
class lion extends animal{
    void display(){
        super.display();//this will add the parent class method also 
        System.out.println("this is a lion");
    }
}
class method_overriding{
    public static void main(String[] args) {
        lion obj=new lion();
        obj.display();
    }
}


/*
Feature	       Method Overloading	       Method Overriding
Method name	    Same	                    Same
Parameters	    Different (type/number)	    Same
Classes	        Same class	                Different classes (parent & child)
Polymorphism	Compile-time	            Runtime
super keyword	Not used	                Used to access parent method if needed
*/