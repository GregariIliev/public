public class Truck extends Vehicle {
    public Truck(double fuel, double consumption) {
        setFuel(fuel);
        setConsumption(consumption);
    }

    @Override
    protected void setFuel(double fuel) {
        super.setFuel(fuel);
    }

    @Override
    protected void setConsumption(double consumption) {
        super.setConsumption(consumption + 1.6);
    }

    @Override
    public void refuel(double fuel) {
        super.refuel(fuel * 0.95);
    }
}
