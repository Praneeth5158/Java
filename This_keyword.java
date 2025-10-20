//-------This=In Java, this is a keyword that refers to the current object of the class.---------

/*class student{
    int roll;
    String name;
    student(int roll,String name){
        //to rectify thhis problem we can use this keyword
        roll =roll;
        name =name;
    }
    void display(){
        System.out.println(name+"="+roll);
    }
}
class This_keyword{
    public static void main(String args[]){
        student obj=new student(1,"praneeth");
        obj.display();
    }
}

//in the above in that situation we can use this 

*/
class student{
    int roll;
    String name;
    student(int roll,String name){
        //to rectify thhis problem we can use this keyword
        this.roll =roll;
        this.name =name;
    }
    void display(){
        System.out.println(name+"="+roll);
    }
}
class This_keyword{
    public static void main(String args[]){
        student obj=new student(1,"praneeth");
        obj.display();
    }
}
