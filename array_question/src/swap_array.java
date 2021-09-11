import java.util.Arrays;

public class swap_array {
    public static void main(String[] args) {
         int[] n = {4,7,8,6,5,1};
         sp(n,1,4);
        System.out.println(Arrays.toString(n));
    }
    static void sp(int[] a, int b, int c){
        int temp = a[b];
        a[b] = a[c];
        a[c]= temp;
    }
}
