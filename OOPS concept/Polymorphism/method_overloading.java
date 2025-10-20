//------Method overloading(compile time) = same method name, different arguments (type, number, or both)
class adder{
    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(double a,double b){
        System.out.println(a+b);
    }
}
class method_overloading{
    public static void main(String args[]){
        adder obj=new adder();
        obj.add(1,2);
        obj.add(5.5,6.6);
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