//--------final keyword means “fixed” — once you set it, you can’t change it.
/*
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

*/

class fn{
    static final int a=10;
    static void fn(){
            a=30;//this will show an erro bcz we already mentioned above as final so final variable cannot able to change
            System.out.println("My number is "+ a);
    }
}
class Final_keyword{
    public static void main(String[] args) {
        fn.fn();

    }
}