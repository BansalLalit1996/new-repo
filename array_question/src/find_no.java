//write a program to find out weather a given no is present in an array or not : Searching.

import java.util.Scanner;

public class find_no {
    public static void main(String[] args) {
        int[] arr = {5,8,9,4,3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your no. which yor want to find in array");
        int n = sc.nextInt();
            boolean array = false;
        for (int j : arr) {
            if (j == n) {
                array = true;
                break;
            }
        }
            if (array)
                System.out.println(n + " is present in the given array");
            else
                System.out.println(n + " is not presnt in the given in the array");

        }
    }

