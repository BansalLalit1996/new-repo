import java.util.Scanner;
class greater_no{
    Scanner sc = new Scanner(System.in);
    int x,y,z;
     greater_no(int a,int b){
         System.out.println("Enter two no.");
         int x= sc.nextInt();
        int y = sc.nextInt();
        if (x>y)
            System.out.println(x+"  is greater");
        else System.out.println(y+" is greater");
    }
    greater_no(int a,int b, int c){
        System.out.println("Enter three no.");
        int x= sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
         if (x>y && x>z)
             System.out.println(x+ " is greater");
         else if (y>z)
             System.out.println(y+" is greater");
         else System.out.println(z+ " is greater");
    }
}
public class two_no_grt {
    public static void main(String[] args) {
        greater_no D = new greater_no(0,0);
        greater_no k = new greater_no(0,0,0);
    }
}
