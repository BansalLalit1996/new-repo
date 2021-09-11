import java.util.Scanner;

public class Factorial {
//    Print factorial of a number
public static void main(String[] args) {
    System.out.print("Enter a no.:");
    Scanner sc = new Scanner(System.in);
    int c= 1;
    int n = sc.nextInt();
//        for (int i = n; i >= 1; i--) {
//            c *= i;
//        }
//        System.out.printf("Factorial of %d is %d",n,c);

//    By using while loop

while (n>0) {
    c = c * n;
    n--;
}
    System.out.println("Factorial is "+ c);
}
}
