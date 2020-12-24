package Vehicle;

public class Bus extends Vehicle {
    private static final double ADDITIONAL_CONSUMPTION = 1.4;

    protected Bus(double fuel, double consumption, double tankCapacity) {
        super(fuel, consumption, tankCapacity);
    }

    @Override
    public String drive(double kilometers) {
       return driveWhitPassengers(kilometers);
    }

    public String driveEmpty(double kilometers){
        return super.drive(kilometers);
    }

    private String driveWhitPassengers(double kilometers){
        return super.doWhitIncreasedConsumption(ADDITIONAL_CONSUMPTION, () -> super.drive(kilometers));
    }

}
