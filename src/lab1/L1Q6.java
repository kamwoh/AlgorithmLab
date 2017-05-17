
package lab1;


public class L1Q6 {
    public static void main(String[]args){
        int[]arr1={1,2,3};
        int[]arr2={5,11,9};
        int[]arr3={7,0,0};
        rotateLeft(arr1);
        rotateLeft(arr2);	
        rotateLeft(arr3);
        System.out.print("Array [1,2,3] after rotated is ");
        for(int i=0; i<arr1.length; i++){
            System.out.print(arr1[i]+ ",");
              
        }
        System.out.println("");
        System.out.print("Array [5,11,9] after rotated is ");
        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+ ",");
              
        }
        System.out.println("");
        System.out.print("Array [7,0,0] after rotated is ");
        for(int i=0; i<arr3.length; i++){
            System.out.print(arr3[i]+ ",");
              
        }
        System.out.println("");
        
    }
    public static int[] rotateLeft(int[]array){
        int hold=0;
        for(int i=0; i<array.length; i++){
            if(i==0){
                hold=array[0];
                
            }
            else{
                array[i-1]=array[i];
            }
            
        }
        array[array.length-1]=hold;
        return array;
    }
}
