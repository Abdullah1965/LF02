import java.util.Arrays;
import java.util.Collections;

public class Bubble {
    public static void main( String args[] ) {
        int [] array = {10,5,3,1,24,12};
        int len = array.length;
        Sort bubbleSort = new Sort();
        bubbleSort.bubbleSort(array,len);

        for(int i = 0; i<len; ++i){
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("-------------------------");

        System.out.println();
        Integer[] ar = {1,3,5,12,67,32,0};
        Arrays.sort(ar, Collections.reverseOrder());
        for (int valus : ar){
            System.out.print(valus + " ");
        }
        System.out.println();

        System.out.println("-------------------------");

        System.out.println();
        int [] arrayR = {10,5,3,1,24,12};
        int lenn = arrayR.length;
        Sort bubbleSortR = new Sort();
        bubbleSortR.bubbleSortReverse(array,len);

        for(int i = 0; i<len; ++i){
            System.out.print(array[i] + " ");
        }
    }
}
