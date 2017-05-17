package lab1;

import java.util.Random;
import java.util.Scanner;

public class L1Q4 {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int[] array = new int[100];
        System.out.println("Enter a number you would like to find : ");
        int in = sc.nextInt();
        //to insert random numbers into my array
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(1000) + 1;
        }
        System.out.println("\nNumber we are trying to find is " + in);
        System.out.println("Initiating linear search..");
        boolean found = false;
        for (int i = 0; i < array.length; i++)
            if (array[i] == in) {
                System.out.println("The number you're finding is at index " + i);
                found = true;
                break;
            }
        if (!found)
            System.out.println("Number is not in the array..");
    }
}
