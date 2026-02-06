import java.util.Arrays;

public class SelectionSort  implements SortingAlgorithm{


    public int[] sorty(int[] input){
        for (int i = 0; i < input.length-1; i++) {
            int min = input[i];
            int index = i;
            for (int j = i + 1; j < input.length ; j++) {
                if(input[j] < min){
                    min = input[j];
                    index = j;
                }
            }
            swap(input, i, index);// my logic that you need to swap
        }
        return input;
    }

    private void swap(int[] arr,int i, int index) {

        int temp = arr[i]; // save the value of our i

        arr[i] = arr[index];// set the value of i to the value of our min index

        arr[index] = temp; // set the value of our

    }


    public static void main(String[] args){

        SelectionSort selectionSort = new SelectionSort();

        int[] testarray = {2,3, 6,7, 2,3,4};

        System.out.print(Arrays.toString(selectionSort.sorty(testarray)));
    }
}
