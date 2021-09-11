import java.util.Scanner;
//Take user input till the user enters 0 and print the sum of all numbers
public class sum_of_no {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no till 0");
        int a = sc.nextInt();
        int n = a;
        while (a!=0) {
            System.out.println("enter no again");
             a = sc.nextInt();
            n+=a;
        }
        System.out.println("Sum is : " + n);
    }
}
