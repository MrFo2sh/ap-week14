package ex2;

public class FindIndex implements Runnable{
    
    private int[] array;
    private int index = -1;
    private int element;

    FindIndex(int element, int[] array){
        this.array = array;
        this.element = element;
    }

    int getIndex(){
        return index;
    }

    @Override
    public void run() {
        for(int i = 0 ; i < array.length ; i ++){
            if(element == array[i]) {
                index = i;
                break;
            }
        }
    }
}
