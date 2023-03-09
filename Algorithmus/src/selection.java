public class selection {
    public static void main(String a[]){
        int[] arr1 = {9,14,3,2,43,11,58,22};
        System.out.println("Before Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        Sort sort = new Sort();
        sort.selectionSort(arr1);//sorting array using selection sort

        System.out.println("After Selection Sort");
        for(int i:arr1){
            System.out.print(i+" ");
        }
        System.out.println();

        System.out.println("------------------");

        System.out.println();
        int[] arr = {9,14,3,2,43,11,58,22};
        System.out.println("Before Selection Sort");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();

        Sort sort1 = new Sort();
        sort1.selectionSortReverse(arr);//sorting array using selection sort

        System.out.println("After Selection Sort");
        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

