package ex2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[5000000];
        for(int i = 0 ; i < array.length ; i ++)
            array[i] = i ;



        FindAvg avg = new FindAvg(array);
        FindMax max = new FindMax(array);
        FindIndex index = new FindIndex(4999999,array);


        ExecutorService executor = Executors.newFixedThreadPool(2);


        executor.execute(avg);
        executor.execute(max);
        executor.execute(index);

        executor.shutdown();


        while(!executor.isTerminated());


        System.out.println("avg: "+avg.getAvg());
        System.out.println("max: "+max.getMax());
        System.out.println("index: "+index.getIndex());

        
    }
}
