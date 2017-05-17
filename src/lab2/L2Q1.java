package lab2;

import java.util.Arrays;

public class L2Q1 {

    public static void main(String[] args)
    {
        int[] a =
        {
            4, 29, 2, 2, 110, 99, 5
        };
        System.out.println("Array Before Sort");
        System.out.println(Arrays.toString(a));

        System.out.println("Array After Bubble Sort");
        bubblesort(a);
        System.out.println(Arrays.toString(a));
    }

    public static void bubblesort(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            for (int j = a.length - 1; j > i; j--)
            {
                if (a[j] < a[j - 1])
                {
                    int hold = a[j - 1];
                    a[j - 1] = a[j];
                    a[j] = hold;
                }
            }
        }
    }
}
