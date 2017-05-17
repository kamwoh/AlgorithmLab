
package lab2;


import java.util.Arrays;

public class L2Q2 {

    public static void main(String[] args){
        // TODO code application logic here
        int[] a = {4, 29, 2, 2, 110, 99, 5};
        System.out.println("Array Before Sort");
        System.out.println(Arrays.toString(a));
        System.out.println("Array After Count Sort");
        countsort(a);
        System.out.println(Arrays.toString(a));
    }
    
    public static int max(int[] a){
        int max = 0;
        for(int i=0;i<a.length;i++){
            if (a[i]>max)
                max = a[i];
        }
        return max;
    }
    
    public static void countsort(int[] a){
        int n = a.length;

        int output[] = new int[n];
        int max = max(a);
        int count[] = new int[max+1];
        for (int i = 0; i < max+1; i++)
            count[i] = 0;

        for (int i = 0; i < n; i++)
            ++count[a[i]];

        for (int i = 1; i < max+1; i++)
            count[i] += count[i - 1];

        for (int i = 0; i < n; i++){
            output[count[a[i]] - 1] = a[i];
            --count[a[i]];
        }

        for (int i = 0; i < n; i++)
            a[i] = output[i];
    }
}

