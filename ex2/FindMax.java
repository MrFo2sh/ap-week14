package ex2;

public class FindMax implements Runnable{
    private int[] array;
    private int max;

    FindMax(int[] array){
        this.array = array;
    }

    int getMax(){
        return max;
    }

    @Override
    public void run() {
        max = array[0];
        for(int el: array) 
            if(max < el) max = el;
    }
}
