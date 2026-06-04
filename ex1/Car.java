package ex1;

public class Car{
    private int maxNumOfPassengers;
    private int numOfPassengers = 0;


    Car(int maxNumOfPassengers){
        this.maxNumOfPassengers = maxNumOfPassengers;
    }


    void addPassenger(){
        numOfPassengers++;
    }

    boolean isFull(){return maxNumOfPassengers == numOfPassengers;}
}