
package lab1;

public class L1Q2 {
    public static void main(String[] args){
        int[]arr1={1,2,6};
        int[]arr2={6,1,2,3};
        int[]arr3={13,6,1,2,3};
        System.out.println("Array [1,2,6] is " + firstLast6(arr1));
        System.out.println("Array [6,1,2,3] is " + firstLast6(arr2));
        System.out.println("Array [13,6,1,2,3] is " + firstLast6(arr3));
    }
    public static boolean firstLast6(int[]array){
        return (array[0]==6 || array[array.length-1]==6);
    }
}

