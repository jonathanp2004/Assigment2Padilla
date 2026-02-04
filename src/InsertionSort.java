import java.util.Arrays;

public class InsertionSort {

    public int[] sort(int[] input){

        for (int i = 1; i < input.length ; i++) {
            int temp = input[i];
            int j = i-1;
        while(j >= 0 && input[j] > temp){
            input[j+1] = input[j];
            j--;
        }
        input[j+1] = temp;
        }
        return input;
    }


    public static void main(String[] args){

        InsertionSort insertionSort = new InsertionSort();

        int[] test1 = {9,35,7,2,5};

        System.out.println(Arrays.toString(insertionSort.sort(test1)));

    }


}
