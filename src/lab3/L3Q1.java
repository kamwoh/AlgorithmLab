package lab3;

public class L3Q1 {

    public static void main(String[] args)
    {   
        int arr[] = {2, 3, 4, 6, 8, 9};
        int n = arr.length;
        int x = 6;

        System.out.print("Given array             :");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Index of the array      :");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Finding 6");
        int result = binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
    public static int binarySearch(int arr[], int l, int r, int x)
    {
        if (r < l)
            return -1;

        if (r >= 1) {
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            return binarySearch(arr, mid + 1, r, x);
        }

        return -1;
    }
}
