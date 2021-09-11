import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        System.out.print("Enter a no. : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n==0)
            System.out.println(n + " is Netural");
            else if (n % 2 == 0)
                System.out.println(n + " is Even");
            else
                System.out.println(n + " is Odd");

    }
}
