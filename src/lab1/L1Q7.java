package lab1;

import java.util.Arrays;
import java.util.Scanner;

public class L1Q7 {

    static int start = 2;
    static int[] arr1 = new int[start];
    static int[] arr2 = new int[start];

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements for array 1 ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter elements for array 2 ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Array " + bigger(arr1, arr2) + " is bigger !");
    }

    public static int sum3(int[] array)
    {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static String bigger(int[] arr1, int[] arr2)
    {
        if (sum3(arr1) > sum3(arr2)) {
            return Arrays.toString(arr1);
        }
        else {
            return Arrays.toString(arr2);
        }
    }
}
