import java.util.Scanner;
//Take integer inputs till the user enters 0 and print the largest number from all.

public class large_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no till 0");
        int a = sc.nextInt();
        int n = a;
        while (a!=0) {
            System.out.println("enter no again");
            a = sc.nextInt();
           if(a>n)
               n=a;
        }
        System.out.println("The larger no. from above is: " +n);
    }

}
