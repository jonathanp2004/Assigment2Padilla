import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Performance {


    public static void generateKSorted(int[] my_array){
        Random gen = new Random();

        for (int i = 0; i < my_array.length ; i++) {
            my_array[i] = gen.nextInt();
        }
            int gap = 10;
            for(int i = gap; i < my_array.length; i++){
                int temp = my_array[i];
                int j = i;

                while (j >= gap && my_array[j-gap] > temp) {

                    my_array[j] = my_array[j -gap];
                    j -= gap;
                }
                my_array[j] = temp;
            }

    }



    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("report.txt");

            SortingAlgorithm[] algorithms = {
                    new BubbleSort(),
                    new InsertionSort(),
                    new ShellSort(),
                    new SelectionSort(),
                    new QuickSort(),
                    new MergeSort()};

            int[] sizes = {100, 500, 1000, 2000, 5000, 10000, 20000, 75000, 150000};

            for (SortingAlgorithm algorithm : algorithms) {
                writer.write("SortingAlgorithm -" + algorithm.getClass().getSimpleName()+ "\n");
                for (int size : sizes) {

                    Tester testing = new Tester(algorithm);
                    writer.write("Sorted " + size + " in " + testing.test(20, size,true) + "ms (avg)\n");
                    writer.write("");

                }
            }
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}