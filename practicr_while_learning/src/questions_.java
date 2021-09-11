import java.util.Scanner;

class cyl{
    cyl(int r){
        System.out.println(Math.PI*r*r);
    }
cyl(int l, int b){
    System.out.println(l*b);
}
}
public class questions_ {
    public static void main(String[] args) {
        System.out.println("Enter radius");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        cyl c = new cyl(5);
        cyl d = new cyl(5,5);


    }
}
