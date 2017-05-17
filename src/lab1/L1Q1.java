
package lab1;


public class L1Q1 {
    public static void main(String[] args) {
        // TODO code application logic here
        int[]arr1={1,2,3};
        int[]arr2={5,11,2};
        int[]arr3={7,0,0};
        System.out.println("Sum for array [1,2,3] is " + sum3(arr1));
        System.out.println("Sum for array [5,11,2] is " + sum3(arr2));
        System.out.println("Sum for array [7,0,0] is " + sum3(arr3));

    }
    public static int sum3(int[]array){
        int sum=0;
        for(int i=0; i<array.length; i++){
            sum+=array[i];
        }
        return sum;
    }
}	

