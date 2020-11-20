package Vehicle;

public class Car extends Vehicle  {
    private static final double ADDITIONAL_CONSUMPTION = 0.9;

    public Car(double fuel, double consumption, double tankCapacity) {
        super(fuel, consumption + ADDITIONAL_CONSUMPTION, tankCapacity);
    }

}
