import java.util.Scanner;

public class swapping {
    public static void main(String[] args) {
        System.out.println("enter two no.");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        System.out.println("after swapping");
//        by using third variable
//        int temp =a;
//        a = b;
//        b = temp;


//        without third variable
        b = a+b;
        a = b-a;
        b = b-a;
        System.out.println("a: "+a);
        System.out.println("b: "+b);

    }

}
