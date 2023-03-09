import java.util.Arrays;
import java.util.Collections;

public class Bubble {
    public static void main( String args[] ) {
        int [] array = {10,5,3,1,24,12};
        Double[] array1 = {1.0,5.0,3.0,1.2,2.4,11.2};
        int len = array.length;
        Sort bubbleSort = new Sort();
        bubbleSort.bubbleSort(array,len);

        System.out.println("L Art Ab");
        bubbleSort.sortiereAbsteigend(array1);
        for(int i = 0; i<array1.length; ++i){
            System.out.print(array1[i] + " ");
        }
        System.out.println();
        System.out.println("L Art Auf");
        bubbleSort.sortiereAufsteigend(array1);
        for(int i = 0; i<array1.length; ++i){
            System.out.print(array1[i] + " ");
        }




        System.out.println();
        System.out.println("M Art");
        for(int i = 0; i<len; ++i){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("-------------------------");

        System.out.println("M Art");

        Integer[] ar = {1,3,5,12,67,32,0};
        Arrays.sort(ar, Collections.reverseOrder());
        for (int valus : ar){
            System.out.print(valus + " ");
        }

        System.out.println();

        System.out.println("-------------------------");

        System.out.println("M Art");
        int [] arrayR = {10,5,3,1,24,12};
        int lenn = arrayR.length;
        Sort bubbleSortR = new Sort();
        bubbleSortR.bubbleSortReverse(array,len);

        for(int i = 0; i<len; ++i){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        double[] data = { 9, 5, 1, 4, 3 };
        bubbleSort.insertionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
        System.out.println();



        int[] data1 = { 8, 7, 2, 1, 0, 9, 6 };
        System.out.println("Unsorted Array");
        System.out.println(Arrays.toString(data1));

        int size = data1.length;

        // call quicksort() on array data
        bubbleSort.quickSort(data1,0,size - 1);

        System.out.println("Sorted Array in Ascending Order ");
        System.out.println(Arrays.toString(data1));
    }
}
