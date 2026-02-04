import java.util.Arrays;

public class BubbleSort implements SortingAlgorithm{

    private int[] bubbleSort(int[] arr){

        for(int i = 0; i < arr.length - 1 ; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if(arr[j] > arr[j + 1]){

                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
//trying this out

    public static void main(String[] args){
        BubbleSort sort = new BubbleSort();

        int[] arr = {8,7,5,3,2,1};

        System.out.println(Arrays.toString(sort.bubbleSort(arr)));
    }
}
