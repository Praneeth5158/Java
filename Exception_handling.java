/*
    Try->allow block of code to test
    catch -> handles exceptions by the try
    Throw ->we can throw only one exception
    Throws-> we can handle multiple exceptions
    Finally-> execute any time
*/

/* class Exception_handling{
    public static void main(String args[]){
        try{
                int str[]={10,20,30};
                System.out.println(str[10]);
            }
        catch(Exception e){
                System.out.println("Nenu vinnanu nenu vunnanu");
            }
        finally{
            System.out.println("Naaku exception ki samandam ey ledu just nenu evarunaa naa execution nenu chestaa");
        }

    }
}
*/

//use of throw
class Exception_handling{
    static void fn(int age){
        if(age<18){
            throw new ArithmeticException("poraa pilla bachaa");
        }
        else{
            System.out.println("nuvvu peddodivey ley saamy");
        }
    }
    public static void main(String args[]){
        Exception_handling.fn(1);
    }
}
