//create an array of 5 floats and calculate their sum

import java.util.Arrays;
import java.util.Scanner;

public class sum_array {
    public static void main(String[] args){
        System.out.println("Enter a array of size 5");
        Scanner sc= new Scanner(System.in);
        float sum = 0f;
        float[] arr = new float[5];
        for (int i =0; i<arr.length;i++) {
            arr[i] = sc.nextFloat();
            sum+=arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Sum of all elements of array is :"+ sum);
    }
}
