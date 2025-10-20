class student{
    student(int roll,String name){
        System.out.println("The roll number of "+ name + " is "+ roll);
    }
}

class parameterized_constructor{
    public static void main(String[] args) {
        student obj=new student(1,"praneeth");
    }
}