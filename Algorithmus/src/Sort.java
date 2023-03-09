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
}
