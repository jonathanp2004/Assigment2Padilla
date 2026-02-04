import java.util.Arrays;

public class BubbleSort implements SortingAlgorithm{

    @Override
    public int[] sorty(int[] input){

        for(int i = 0; i < input.length - 1 ; i++) {
            for (int j = 0; j < input.length - 1; j++) {
                if(input[j] > input[j + 1]){

                   int temp = input[j];
                   input[j] = input[j+1];
                   input[j + 1] = temp;
                }
            }
        }
        return input;
    }
//trying this out

    public static void main(String[] args){
        BubbleSort sort = new BubbleSort();

        int[] arr = {8,7,5,3,2,1};

        System.out.println(Arrays.toString(sort.sorty(arr)));
    }
}
