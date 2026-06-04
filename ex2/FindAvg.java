package ex2;

public class FindAvg implements Runnable{
    private int[] array;
    private int avg;

    FindAvg(int[] array){
        this.array = array;
    }

    int getAvg(){
        return avg;
    }

    @Override
    public void run() {
        int sum = 0;
        for(int el : array)
            sum+= el;
        avg = sum / array.length;
    }
}
