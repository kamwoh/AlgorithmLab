
package lab2;

import java.util.Arrays;
public class L2Q4 {
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a = {4,29,2,2,110,99,5};
        System.out.println("Array Before Sort");
        System.out.println(Arrays.toString(a));
        System.out.println("Array After Shell Sort");
        shellSort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void shellSort(int[] array) {
        int inner, outer;
        int temp;
        int h = 1;
        while (h <= array.length / 3) {
          h = h * 3 + 1;
        }
        while (h > 0) {
          for (outer = h; outer < array.length; outer++) {
            temp = array[outer];
            inner = outer;

            while (inner > h - 1 && array[inner - h] >= temp) {
              array[inner] = array[inner - h];
              inner -= h;
            }
            array[inner] = temp;
          }
          h = (h - 1) / 3;
        }
    }
}
