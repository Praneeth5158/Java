/*class student{
     int id=1;
     String n="praneeth";
}
class about_class{
    public static void main(String args[]){
        student s1=new student();
        System.out.println(s1.id);
        System.out.println(s1.n);
    }
}
*/

class student{
    int roll;
    String name;
    void insert(int r,String n){
        roll=r;
        name=n;
    }
    void display(){
        System.out.println("the roll no of "+name+" is "+roll);
    }
}
public class about_class{
    public static void main( String args[]){
        student s1=new student();
        student s2=new student();
        s1.insert(1,"praneeth");
        s2.insert(2,"satya");
        s1.display();
        s2.display();
    }
}