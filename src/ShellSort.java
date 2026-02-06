import java.util.Arrays;

public class ShellSort implements SortingAlgorithm {

    public int[] sorty(int[] input){



        for(int gap = input.length/2; gap > 0; gap/=2 ){
            for(int i = gap; i < input.length; i++){
                int temp = input[i];
                int j = i;

                while (j >= gap && input[j-gap] > temp) {

                    input[j] = input[j -gap];
                    j -= gap;
                }
                input[j] = temp;
            }
        }
        return input;
    }


    public static void main (String[] args){

        ShellSort sort = new ShellSort();

        int[] test = {3,2,4,1,6,4};

        System.out.println(Arrays.toString(sort.sorty(test)));

    }
}
