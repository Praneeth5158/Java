/* Class and Object
Problem: Create a Student class with data members name, age, and marks. Create two objects and display their details.*/
class Student{
    static void info(String name,int age, int marks){
       System.out.println(name + " whose age is "+ age + " got "+ marks +" marks");
    }
}
class prblm1{
    public static void main(String[] args){
        Student obj1=new Student();
        Student obj2=new Student();
        obj1.info("praneeth",21,97);
        obj2.info("Satya",17,98);
        
    }
}