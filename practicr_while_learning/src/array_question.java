import java.util.Scanner;

public class array_question{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println("no. for seardh");
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        boolean result = false;
        for (int i = 0;i<arr.length;i++) {
            if (arr[i] == t) {
                result = true;
                break;
            }
        }
 if(result)
     System.out.println(t + " is present in array ");
       else System.out.println(t + " is not present");
    }
}