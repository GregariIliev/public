public class Truck extends Vehicle {
    private static final double ADDITIONAL_CONSUMPTION = 1.6;

    public Truck(double fuel, double consumption, double tankCapacity) {
        super(fuel, consumption + ADDITIONAL_CONSUMPTION, tankCapacity);
    }


    @Override
    public void refuel(double fuel) {
        super.refuel(fuel * 0.95);
    }
}
