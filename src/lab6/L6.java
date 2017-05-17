package lab6;

import java.util.Arrays;

public class L6 {
    public static void maxHeapify(int[] array, int heapSize, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        
        if (left < heapSize && array[left] > array[largest])
            largest = left;
        if (right < heapSize && array[right] > array[largest])
            largest = right;
        
        if (largest != i) {
            int temp = array[largest];
            array[largest] = array[i];
            array[i] = temp;
            maxHeapify(array, heapSize, largest);
        }
        
    }
    public static void buildMaxHeap(int[] array) {
        for(int i=array.length/2; i>=0; i--) {
            maxHeapify(array, array.length, i);
        }
    }
    public static void heapSort(int[] array) {
        buildMaxHeap(array);
        System.out.println("Done building max heap: "+Arrays.toString(array));
        int heapSize = array.length;
        for(int i=array.length-1;i>=0;i--){
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            heapSize--;
            maxHeapify(array, heapSize, 0);
        }
    }
    public static int heapMax(int[] array) {
        return array[0];
    }
    public static int heapExtractMax(int[] array, int heapSize) {
        int max = heapMax(array);
        array[0] = array[heapSize-1];
        heapSize--;
        array[heapSize] = Integer.MIN_VALUE;
        maxHeapify(array, heapSize, 0);
        return max;
    }
    public static void heapIncreaseKey(int[] array, int i, int key) {
        array[i] = key; //last = key
        int parent;
        if (i%2==0) {
            parent = (i-2)/2;
        } else {
            parent = (i-1)/2;
        }
        while (i > 0 && array[parent] < array[i]) {
            int temp = array[i];
            array[i] = array[parent];
            array[parent] = temp;
            //next node = parent index
            i = parent;
            //find next node's parent index
            if (i%2==0) {
                parent = (i-2)/2;
            } else {
                parent = (i-1)/2;
            }
        }
    }
    public static int[] maxHeapInsert(int[] array, int currentHeapSize, int key) {      
        int[] newArray = array;
        if(currentHeapSize==array.length) { //reaches maximum size
            newArray = new int[array.length+1];
            System.arraycopy(array, 0, newArray, 0, array.length);
            newArray[newArray.length-1] = Integer.MIN_VALUE;
        }
        currentHeapSize++;
        heapIncreaseKey(newArray, currentHeapSize-1, key);
        return newArray;
    }  
    public static void main(String[] args) {
        int[] arrayOri = {11, 4, 74, 55, 3, 17, 8, 46, 43, 33};
        //question 1
        int[] array = arrayOri.clone();
        System.out.println("1. Implementing max-heapify");
        System.out.println("Array before: "+Arrays.toString(array));
        buildMaxHeap(array);
        System.out.println("Array after heapify: "+Arrays.toString(array));
        //quesiton 2
        System.out.println("2. Implementing heap-sort");
        array = arrayOri.clone();
        System.out.println("Array before: "+Arrays.toString(array));
        heapSort(array);
        System.out.println("Array after heap sort: "+Arrays.toString(array));
        //question 3
        System.out.println("3. Implementing priority queue");
        array = arrayOri.clone();
        int heapSize = array.length;
        System.out.println("Array before: "+Arrays.toString(array));
        System.out.println("Building max heap...");
        buildMaxHeap(array);
        //extracting key (remove largest)
        System.out.println("Priority queue array: "+Arrays.toString(array));
        System.out.println("Extracting largest key from queue: "+heapExtractMax(array, array.length));
        heapSize--;
        System.out.println("Array after: "+Arrays.toString(array));
        //inserting key
        System.out.println("Inserting new key 44 into array...");
        array = maxHeapInsert(array, heapSize, 44);
        heapSize = array.length;
        System.out.println("Array after: "+Arrays.toString(array));
        //inserting key
        System.out.println("Inserting new key 30 into array...");
        array = maxHeapInsert(array, heapSize, 30);
        heapSize = array.length;
        System.out.println("Array after: "+Arrays.toString(array));
    }
}
