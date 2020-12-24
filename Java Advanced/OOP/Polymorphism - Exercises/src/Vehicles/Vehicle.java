import java.text.DecimalFormat;

public abstract class Vehicle implements IVehicle {
    private double fuel;
    private double consumption;
    private double kilometers;

    public double getFuel() {
        return this.fuel;
    }

    public double getConsumption() {
        return this.consumption;
    }

    protected void setFuel(double fuel){
        this.fuel += fuel;
    }

    protected void setConsumption(double consumption){
        this.consumption = consumption;
    }

    protected String decimalFormat(double value){
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        return decimalFormat.format(value);
    }

    @Override
    public void refuel(double fuel) {
        this.fuel += fuel;
    }

    @Override
    public String drive(double kilometers) {
        String output;

        double consumedFuel = this.consumption * kilometers;
        if (consumedFuel <= this.fuel){
            this.fuel -= consumedFuel;
            this.kilometers += kilometers;
            output = String.format("%s travelled %s km",this.getClass().getName(), decimalFormat(kilometers));
        }else {
            output = String.format("%s needs refueling",this.getClass().getName());
        }

        return output;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",this.getClass().getName(), this.fuel);
    }
}
