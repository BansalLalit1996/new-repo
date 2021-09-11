import java.util.Arrays;

public class max_element {
    public static void main(String[] args) {
        int[] arr = {105,18,25,788,45,97,80};
        System.out.println(Arrays.toString(arr));
        int max = Integer.MIN_VALUE;

        for (int i=0;i< arr.length-1;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println(max+" is largest in array");
    }
}
