//--------final keyword means “fixed” — once you set it, you can’t change it.

class final_ex{
    public final void fn1(){
        System.out.println("This method cannot be overriden by any sub class");
    }
}
class sub extends final_ex{
    public void fn1(){
        System.out.println("This will generate compilation error");
    }
}
class Final_keyword{
    public static void main(String[] args){
        sub obj=new sub();
        obj.fn1();
    }
}