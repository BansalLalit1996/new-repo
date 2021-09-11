import java.util.Arrays;

public class rev_fun_swap_arr {
    public static void main(String[] args) {
        int[] arr = {1,2, 3, 4, 5, 6, 7,65,89,34};
        swap(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int x1, int x2) {
        do {
            int temp = arr[x1];
            arr[x1] = arr[x2];
            arr[x2] = temp;
            x1++;
            x2--;
        }while(x1<x2);

    }
}
