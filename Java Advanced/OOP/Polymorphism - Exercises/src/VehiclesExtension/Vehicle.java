import java.text.DecimalFormat;
import java.util.function.Supplier;

public abstract class Vehicle implements IVehicle {
    private double fuel;
    private double consumption;
    private double tankCapacity;

    protected Vehicle(double fuel, double consumption, double tankCapacity) {
        setTankCapacity(tankCapacity);
        setFuel(fuel);
        setConsumption(consumption);
    }

    protected void setTankCapacity(double tankCapacity) {
        this.tankCapacity = tankCapacity;
    }

    protected void setFuel(double fuel) {
        validateFuel(fuel);
        this.fuel = fuel;
    }

    protected void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    private void validateFuel(double fuel) {
        if (fuel <= 0){
            throw new IllegalStateException("Fuel must be a positive number");
        }else if (fuel > this.tankCapacity){
            throw new IllegalStateException("Cannot fit fuel in tank");
        }
    }

    @Override
    public void refuel(double fuel) throws IllegalStateException {
        validateFuel(fuel);
        this.fuel += fuel;
    }

    @Override
    public String drive(double kilometers) {
        String output;

        double consumedFuel = this.consumption * kilometers;
        if (consumedFuel <= this.fuel) {
            this.fuel -= consumedFuel;
            output = String.format("%s travelled %s km", this.getClass().getSimpleName(), decimalFormat(kilometers));
        } else {
            output = String.format("%s needs refueling", this.getClass().getSimpleName());
        }

        return output;
    }

    protected <T> T doWhitIncreasedConsumption(double consumption, Supplier<T> supplier){
        this.consumption += consumption;
        try {
            return supplier.get();
        }catch (Exception e){
            throw new IllegalStateException();
        }finally {
            this.consumption -= consumption;
        }
    }

    private String decimalFormat(double value) {
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(value);
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f", this.getClass().getSimpleName(), this.fuel);
    }
}
