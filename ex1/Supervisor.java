package ex1;

public class Supervisor {
    private int numOfCars;
    private int numOfFullCars = 0;


    Supervisor(int numOfCars){
        this.numOfCars = numOfCars;
    }

    synchronized void notifyCarIsFull(){
        numOfFullCars++;
        if(numOfCars == numOfFullCars)
            System.out.println("Train is full!");
    }
}
