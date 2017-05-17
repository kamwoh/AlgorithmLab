
package lab3;



/**
 *
 * @author kewjielong
 */
public class L3P2Q1 {
    public static void main(String[] args) {
         int arr[] = {1 ,2 ,3 ,4 ,5 ,6 ,7, 9, 10, 11};
         int arrNeedEntered[] = {1 ,2 ,3 ,4 ,5 ,6 ,7, 8 ,9, 10, 11};
         System.out.println("Given the matrix number that needed to be entered: ");
         printArray(arrNeedEntered);
         System.out.println("Given the entered matrix number : ");
         printArray(arr);
         System.out.println("Starting checking......");
         for(int i = 0; i < arrNeedEntered.length; i++){
            System.out.println("Matrix Number ---> " + arrNeedEntered[i]);
            System.out.println("Checking....");
            int x = arrNeedEntered[i];
            int result = missingInteger(arr, 0, arr.length - 1, x);
            if(result >= 0)
                System.out.println("The number is found at index of " + result);
            else{
                System.out.println("The number is missing");         
                System.out.println(x +" is the missing matrix number......");
                System.out.println("Closing program......");
                break;
            }                
        }           
    }
    public static int missingInteger(int []arr, int r, int l, int x){
        int mid = r + (l - r)/2;
                
        if(l < r)
            return -1;
        if(arr[mid] == x)
            return mid;
        else if(arr[mid] > x)
            return missingInteger(arr, r, mid - 1, x);
        else if(arr[mid] < x)
            return missingInteger(arr, mid+1, l, x);
        else
            return -1;
    }
    static void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }      
}

