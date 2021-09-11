import java.util.Scanner;
class alldetails{
    int id;
    String name;
    int salary;
    public void printdetail(){
        System.out.println("id "+ id +" name "+ name +" salary "+salary);
    }
}


public class oops {
    public static void main(String[] args) {
        System.out.println("These are all details of employee");
        alldetails a = new alldetails();
        alldetails b = new alldetails();
        alldetails c = new alldetails();
        a.id = 1;
        b.id = 2;
        c.id = 3;
        a.name = "lalit";
        b.name = "lakhan";
        c.name = "amit";
        a.salary = 10;
        b.salary = 0;
        c.salary = 35;
        a.printdetail();

    }
}
