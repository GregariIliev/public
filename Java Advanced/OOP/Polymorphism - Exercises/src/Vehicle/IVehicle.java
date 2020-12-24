package Vehicle;

public interface IVehicle {

    String drive(double value);

    void refuel(double value) throws IllegalAccessException;
}
