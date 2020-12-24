package Google;

public class Car {
    private String model;
    private int speed;

    public Car(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public static Car createCar(String[] tokens) {
        String model = tokens[2];
        int speed = Integer.parseInt(tokens[3]);

        return new Car(model, speed);
    }

    @Override
    public String toString(){
        return String.format("%s %d",this.model, this.speed);
    }
}