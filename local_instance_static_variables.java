/*
Local variable:
- Declared inside the body of a method.
- Cannot be declared static.
- Exists only during method execution.

Instance variable:
- Declared inside a class but outside any method.
- Accessed using the object name.
- Each object has its own copy.

Static variable:
- Declared inside a class but outside any method, constructor, or block.
- Belongs to the class, shared by all objects.
- Can be accessed using class name.
*/
class local_instance_static_variables{
    int instanceVar = 10;           // instance variable
    static int staticVar = 20;      // static variable

    void show() {
        int localVar = 30;          // local variable
        System.out.println("Local variable: " + localVar);
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Static variable: " + staticVar);
    }

    public static void main(String[] args) {
        VariablesExample obj = new VariablesExample();
        obj.show();
    }
}
