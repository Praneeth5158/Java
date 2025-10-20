//======Multi level inheritance=====
class grandparent{
    public void fun1(){
        System.out.println("This is the statement in the grand parent class");
    }
}
class parent extends grandparent{
    void fun2(){
        System.out.println("This is the statemnt in the parent class");
    }
}
class child extends parent{
    void fun3(){
        System.out.println("this is the statement in the child class");
    }
}
/*ippudu object creation child class create cheyyali enduku antey parent class loo 
grand parent details extend chesaam antey grand paarent details mottam ippudu 
parent loo vuntaay and next parent class ni child loo extend chestaam antey 
ippudu child loo parent details and grand parent details rendu vuntaay soo child class
ki obhject create chestaam*/
public class multilevel_inheritance{
    public static void main(String[] args) {
        child obj = new child();
        obj.fun1();
        obj.fun2();
        obj.fun3();

    }
}