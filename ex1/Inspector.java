package ex1;

public class Inspector extends Thread{
    private String name;
    private Car car;
    private Supervisor superV;

    Inspector(String name, Car car, Supervisor superV){
        this.car = car;
        this.name = name;
        this.superV = superV;
    }

    @Override
    public void run() {
       while(!car.isFull())
            car.addPassenger();
        System.out.println(name+ "'s car is full!");
        //notify supervisor
        superV.notifyCarIsFull();
    }
}
