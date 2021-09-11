import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        do {
            System.out.println("Enter your choice");
            System.out.println("+ , *");
            Scanner sc = new Scanner(System.in);
            String choice = sc.next();
            switch (choice) {
                case "+":
                    do {
                        System.out.println("enter two no.");
                        int a = sc.nextInt();
                        int b = sc.nextInt();
                        System.out.println("sum is :" + (a + b));
                        break;
                    }while (true);

                case "*":
                    System.out.println("enter two no.");
                    int c = sc.nextInt();
                    int d = sc.nextInt();
                    System.out.println("sum is :" + c * d);
                    break;
                default:
                    System.out.println("invalid choice");
                    break;
            }
        }while (true);

    }
}
