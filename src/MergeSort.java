import java.util.Arrays;

public class MergeSort  implements SortingAlgorithm{


    public int[] sorty(int[] input){
      mergesort(input);
      return input;
    }

    private void mergesort(int[] input) {

        int length = input.length;
        if(length <= 1)
            return;

        int mid = length /2;
        int[] leftArr = new int[mid];
        int[] rightArr = new int[length - mid];

        int i =0;
        int j= 0;

        for (; i < length ; i++) {
            if(i < mid){
                leftArr[i] = input[i];
            }
            else{
                rightArr[j] = input[i];
                j++;
            }

        }
        mergesort(leftArr);
        mergesort(rightArr);
        merge(leftArr,rightArr,input);

    }

    private void merge(int[] leftArr, int[]rightArr, int[] arr){

        int leftSize = arr.length/2;
        int rightSize = arr.length - leftSize;

        int i = 0;
        int l = 0;
        int r = 0;

        while(l < leftSize && r < rightSize){
            if(leftArr[l] < rightArr[r]){
                arr[i] = leftArr[l];
                i++;
                l++;
            }
            else{

                arr[i] = rightArr[r];
                i++;
                r++;
            }
        }
        while (l < leftSize){
            arr[i] = leftArr[l];
            i++;
            l++;
        }
        while(r < rightSize){
            arr[i] = rightArr[r];
            i++;
            r++;
        }
    }


    public static void main(String[] args){

        MergeSort sort = new MergeSort();

        int[] test = {8,3,7,4,2,9};

        System.out.println(Arrays.toString(sort.sorty(test)));
    }
}
