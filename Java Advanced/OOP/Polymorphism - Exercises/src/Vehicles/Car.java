public class Car extends Vehicle {
    public Car(double fuel, double consumption) {
        setFuel(fuel);
        setConsumption(consumption);
    }

    @Override
    protected void setFuel(double fuel) {
        super.setFuel(fuel);
    }

    @Override
    protected void setConsumption(double consumption) {
        super.setConsumption(consumption + 0.9);
    }
}
