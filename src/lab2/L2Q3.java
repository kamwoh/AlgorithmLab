
package lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class L2Q3 {
    public static void main(String[] args) {
        // TODO code application logic here
        int [] a = {4,29,2,2,110,99,5};
        System.out.println("Array Before Sort");
        System.out.println(Arrays.toString(a));
        System.out.println("Array after Bucket Sort");
        System.out.println(Arrays.toString(bucketSort(a)));
    }
    public static int[] bucketSort(int[] arr){
        int max = 0;
        for(int i:arr) if(max<i) max = i;
        ArrayList<ArrayList> a = new ArrayList<>();
        for(int i=0;i<(max/10)+1;i++){
            a.add(new ArrayList<>());
        }
        for(int i:arr){
            int b = i/10;
            a.get(b).add(i);
        }
        for(int i=0;i<a.size();i++){
            Collections.sort(a.get(i));
        }
        int[] array = new int[arr.length];
        int index=0;
        for(int i=0;i<a.size();i++){
            ArrayList b = a.get(i);
            for(int j=0;j<b.size();j++){
                array[index++] = (int) b.get(j);
            }
        }
        return array;
    }
}