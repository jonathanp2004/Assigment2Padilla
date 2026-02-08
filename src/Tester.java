import java.util.Random;

import static java.lang.System.nanoTime;


public class Tester {

    private final SortingAlgorithm algorithm;

    public Tester (SortingAlgorithm sa){
        algorithm = sa;
    }

    public double singleTest(int size, boolean useKSorted){
        int[] arr = new int[size];
        if(useKSorted){
            {
                Performance.generateKSorted(arr);
            }
            }else {
            Random gen = new Random();
            for (int i = 0; i < arr.length; i++) {
                arr[i] = gen.nextInt();

            }

        }
        long startTime = System.nanoTime();
        algorithm.sorty(arr);
        long endTime = System.nanoTime();

        long duration = endTime - startTime;

        return duration / 1000000.0;

    }


    public double test (int iterations , int size, boolean useKSorted) {

        double total = 0;


        for (int i = 0; i < iterations; i++) {
            double dura = singleTest(size, useKSorted);
            total = dura + total;
        }

        return total / iterations;

        }
    }


