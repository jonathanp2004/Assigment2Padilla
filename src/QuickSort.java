import java.util.Arrays;

public class QuickSort {


    //should rearrange so all i < pivot to left and pivot, and if i > pivot should be put on the left

    private int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];

                arr[i] = arr[j];

                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = pivot;
        arr[high] = temp;

        return i + 1;
    }

    public int[] sorty(int[] input){

        quickSort(input, 0, input.length-1);
        return input;
    }

    private void quickSort(int[] arr, int low, int high){

        if(low < high){

            int pivot = partition(arr, low, high);
            quickSort(arr,low, pivot -1);
            quickSort(arr, pivot +1, high);
        }

    }

    public static void main(String[] args){

    QuickSort quick = new QuickSort();


    int[] test = {8,4,5,9,3,2,1};

    System.out.println(Arrays.toString(quick.sorty(test)));


    }


}
