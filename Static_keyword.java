//-------- static keyword = if we use this static keyword then no need to create object we can able to access it without creating an object
class stat_key{
    static void stat(){
        System.out.println("This is an example for the static");
    }
}
class Static_keyword{
    public static void main(String args[]){
        //Here iam not creating any object just i called it with method name
        stat_key.stat();
    }
}