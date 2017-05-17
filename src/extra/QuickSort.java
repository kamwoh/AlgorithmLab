package extra;

import java.util.Random;

public class QuickSort {

    public static void main(String[] args)
    {
        Random rand = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = rand.nextInt(101);
            System.out.print(array[i] + " ");
        }
        System.out.println("");
        System.out.println("Start");
        quickSort(array, 0, array.length - 1);

    }

    public static void display(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    public static void quickSort(int[] array, int p, int r)
    {
        if (p < r)
        {
            int q = partition(array, p, r);
            display(array);
            System.out.println("pivot = array["+q+"] "+array[q]);
            quickSort(array, p, q - 1);
            quickSort(array, q + 1, r);
        }
    }

    public static int partition(int[] array, int p, int r)
    {
        int x = array[r];
        int i = p - 1;
        for (int j = p; j < r; j++)
        {
            if (array[j] <= x)
            {
                i += 1;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, r);
        return i + 1;
    }

    public static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
