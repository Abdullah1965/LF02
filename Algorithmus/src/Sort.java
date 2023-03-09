public class Sort implements ISortierAlgorithmus{
    @Override
    public void bubbleSort(int[] sort_arr, int len) {

            for (int i=0;i<len-1;++i){
                for(int j=0;j<len-i-1; ++j){
                    if(sort_arr[j+1]<sort_arr[j]){
                        int swap = sort_arr[j];
                        sort_arr[j] = sort_arr[j+1];
                        sort_arr[j+1] = swap;
                    }
                }
            }
    }
    @Override
    public void bubbleSortReverse(int[] sort_arr, int len) {

        for (int i=0;i<len-1;++i){
            for(int j=0;j<len-i-1; ++j){
                if(sort_arr[j]<sort_arr[j+1]){
                    int swap = sort_arr[j];
                    sort_arr[j] = sort_arr[j+1];
                    sort_arr[j+1] = swap;
                }
            }
        }
    }

    @Override
    public void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }
    @Override
    public void selectionSortReverse(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++){
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if ( arr[index]<arr[j]){
                    index = j;//searching for lowest index
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    @Override
    public void sortiereAbsteigend(Double[] liste) {
        for (int i=0;i<liste.length-1;++i){
            for(int j=0;j<liste.length-i-1; ++j){
                if(liste[j+1]<liste[j]){
                    Double swap = liste[j];
                    liste[j] = liste[j+1];
                    liste[j+1] = swap;
                }
            }
        }
    }

    @Override
    public void sortiereAufsteigend(Double[] liste) {

        for (int i=0;i<liste.length-1;++i){
            for(int j=0;j<liste.length-i-1; ++j){
                if(liste[j]<liste[j+1]){
                    Double swap = liste[j];
                    liste[j] = liste[j+1];
                    liste[j+1] = swap;
                }
            }
        }
    }

    @Override
    public void insertionSort(double[] array) {
        double size = array.length;

        for (int step = 1; step < size; step++) {
            double key = array[step];
            int j = step - 1;

            // Compare key with each element on the left of it until an element smaller than
            // it is found.
            // For descending order, change key<array[j] to key>array[j].
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }

            // Place key at after the element just smaller than it.
            array[j + 1] = key;
        }
    }

    @Override
    public void quickSort(int[] array, int low, int high) {
        if (low < high) {

            // find pivot element such that
            // elements smaller than pivot are on the left
            // elements greater than pivot are on the right
            int pi = partition(array, low, high);

            // recursive call on the left of pivot
            quickSort(array, low, pi - 1);

            // recursive call on the right of pivot
            quickSort(array, pi + 1, high);
        }
    }
    static int partition(int array[], int low, int high) {

        // choose the rightmost element as pivot
        int pivot = array[high];

        // pointer for greater element
        int i = (low - 1);

        // traverse through all elements
        // compare each element with pivot
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {

                // if element smaller than pivot is found
                // swap it with the greater element pointed by i
                i++;

                // swapping element at i with element at j
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }

        }

        // swapt the pivot element with the greater element specified by i
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        // return the position from where partition is done
        return (i + 1);
    }
}
