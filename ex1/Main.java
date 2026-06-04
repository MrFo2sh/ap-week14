package ex1;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(5000000);
        Car c2 = new Car(5000000);
        Car c3 = new Car(5000000);

        Supervisor superV = new Supervisor(3);


        Inspector in1 = new Inspector("in1", c1, superV);
        Inspector in2 = new Inspector("in2", c2, superV);
        Inspector in3 = new Inspector("in3", c3, superV);


        in1.start();
        in2.start();
        in3.start();

    }
}
