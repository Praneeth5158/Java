//========Multiple inheritance===========
/*class a{
    void fn(){
        System.out.println("This is a");
    }
}
class b{
    void fn2(){
        System.out.println("This is b");
    }
}
//in java for multiple inheritancce will now work directly for that we have 
//another option that is interface
class c extends a,b{
    void fn3(){
        System.out.println("this is c");
    }
}
classs multiple_inheritance{
    public void main(String args[]){
        c obj=new c();
        obj.fn();
        obj.fn2();
        obj.fn3();
    }
}

*/

interface a{
    void fn();
}
//in interface wee can able to do only declaration
interface b{
    void fn2();
}
/*in java for multiple inheritancce will now work directly for that we have 
another option that is interface*/
class c implements a,b{
    //in interface we difinetely keep the public otherwise it will throw an error
    public void fn(){
        System.out.println("this is a");
    }
    public void fn2(){
        System.out.println("this is b");
    }
    void fn3(){
        System.out.println("this is c");
    }
}
class Multiple_inheritance{
    public static void main(String args[]){
        c obj=new c();
        obj.fn();
        obj.fn2();
        obj.fn3();
    }
}