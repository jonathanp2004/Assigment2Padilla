import java.util.Random;

import static java.lang.System.nanoTime;


public class Tester {

    private final SortingAlgorithm algorithm;

    public Tester (SortingAlgorithm sa){
        algorithm = sa;
    }

    public double singleTest(int size){

        Random gen = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {

            arr[i] = gen.nextInt(11);

        }
        long startTime = System.nanoTime();
        algorithm.sorty(arr);
        long endTime = System.nanoTime();

       long duration = endTime  - startTime;

       return duration/1000000.0;
    }


    public void test (int iterations , int size){

        double total = 0;


        for (int i = 0; i < iterations; i++) {
            double dura = singleTest(size);
            total = dura + total;
        }

        System.out.println("Average time to sort array :" + total/iterations);

    }



}
