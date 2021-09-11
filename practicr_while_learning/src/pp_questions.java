import java.awt.geom.Area;

class Employee{
    int salary;
    String name;
    public int getSalary(){
        System.out.println("salary is " );
        return salary;
    }
    public String getName(){
        return name;
    }
    public  void setName(String n){
        name = n;
    }
}
class Square{
    int side;
    public int Area(int a){

    return a*a;
    }
    public int perimeter(int a){
        return 2*(a+a);

    }
}
public class pp_questions {
    public static void main(String[] args) {
//        Employee a = new Employee();
//        a.setName("lalit");
//        a.salary = 500;
//        System.out.println(a.getName());
//        System.out.println(a.getSalary());
        Square a = new Square();
        a.side = 5;
        System.out.println(a.Area(5));
        System.out.println(a.perimeter(6));
    }
}
