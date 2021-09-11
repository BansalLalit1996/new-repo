//reverse an array
import java.util.Arrays;

public class reverse_arr {
    public static void main(String[] args) {
        System.out.println("Your  array");
        int[] arr = {1,2,3,4,5,6,7};
        int temp;

        for (int i=0;i<(arr.length/2);i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
