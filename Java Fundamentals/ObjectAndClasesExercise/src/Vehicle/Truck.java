package Vehicle;

public class Truck {
    private String typeVehicle = "Truck";
    private String model;
    private String color;
    private int horsePower;

    public Truck(String model, String color, int horsePower){
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public String getModel() {
        return this.model;
    }

    @Override
    public String toString(){
        return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d%n",typeVehicle ,model, color, horsePower);
    }
}
