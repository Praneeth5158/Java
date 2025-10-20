//=======heirachieal inheritance=======
//its like a tree one root node all child nodes
class a{
    void print_a(){
        System.out.println("A class");
    }
}
class b extends a{
    void print_b(){
        System.out.println("B class");
    }
}
class c extends a{
    void print_c(){
        System.out.println("C class");
    }
}
class d extends a{
    void print_d(){
        System.out.println("D class");
    }
}
/* ippudu manam prathi class ki object create cheyyali enduku antey idi heirachiel 
kaabatti antey only one root node remaining all child nodes*/
class Heirachieal_inheritance{
    public static void main(String args[]){
        b obj_b=new b();
        c obj_c=new c();
        d obj_d=new d();
        obj_b.print_a();
        obj_b.print_b();
        obj_c.print_a();
        obj_c.print_c();
        obj_d.print_a();
        obj_d.print_d();
    }
}