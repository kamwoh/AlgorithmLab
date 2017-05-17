package lab5;

import java.util.Random;

/**
 * Randomized Selection algorithm
 * @author Woh
 */
public class L5Q1 {

    public static void main(String[] args)
    {
        int[] array =
        {
            11, 4, 74, 55, 3, 17, 8, 46, 43, 33
        };

        int min = randomizedSelect(array, 1);
        System.out.println("a. Minimum: " + min);
        int max = randomizedSelect(array, 10);
        System.out.println("b. Maximum: " + max);
        int fifth = randomizedSelect(array, 5);
        System.out.println("c. i=5: " + fifth);
        int eighth = randomizedSelect(array, 8);
        System.out.println("d. i=8: " + eighth);
        boolean isOdd = true;
        if (array.length % 2 == 0)
            isOdd = false;
        if (isOdd)
        {
            int median = randomizedSelect(array, (array.length + 1) / 2);
            System.out.println("e. Median: " + median);
        }
        else
        {
            int lower = randomizedSelect(array, (array.length + 1) / 2);
            int upper = randomizedSelect(array, (array.length + 1) / 2 + 1); //+1 because upper
            System.out.println("e. Median [lower]: "+lower);
            System.out.println("e. Median [upper]: "+upper);
        }
    }

    public static int randomizedSelect(int[] array, int orderIndex)
    {
        return randomizedSelect(array.clone(), 0, array.length - 1, orderIndex);
    }

    /**
     *
     * @param array
     * @param start elements from start index
     * @param end to end index
     * @param orderIndex if you want to get 1st element, then orderIndex = 1
     * @return ith smallest element
     */
    public static int randomizedSelect(int[] array, int start, int end, int orderIndex)
    {
        if (start == end)
            return array[start];

        int mid = randomizedPartition(array, start, end);
        int numOfElements = mid - start + 1;
        if (orderIndex == numOfElements)
            return array[mid];
        else if (orderIndex < numOfElements)
            return randomizedSelect(array, start, mid - 1, orderIndex);
        else
            return randomizedSelect(array, mid + 1, end, orderIndex - numOfElements);

    }

    public static void display(int[] array)
    {
        for (int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
        System.out.println("");
    }

    /**
     * Simple randomized partition
     * @param array
     * @param start
     * @param end
     * @return 
     */
    public static int randomizedPartition(int[] array, int start, int end)
    {
        int i = new Random().nextInt(end - start + 1) + start;
        swap(array, end, i);
        return partition(array, start, end);
    }

    /**
     * partition code from quick sort
     * @param array
     * @param start
     * @param end
     * @return 
     */
    public static int partition(int[] array, int start, int end)
    {
        int x = array[end];
        int i = start - 1;
        for (int j = start; j < end; j++)
        {
            if (array[j] <= x)
            {
                i += 1;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, end);
        return i + 1;
    }

    public static void swap(int[] array, int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
