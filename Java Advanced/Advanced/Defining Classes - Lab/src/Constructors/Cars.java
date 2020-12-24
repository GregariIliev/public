package Constructors;

public class Cars {
    private String make = "unknown";
    private String model = "unknown";
    private int horsepower = -1;

    public Cars(String make, String model, int horsepower){
        this.make = make;
        this.model = model;
        this.horsepower = horsepower;
    }
    public Cars(String make){
        this.make = make;
    }

    public String getInfo(){
        return String.format("The car is: %s %s - %d HP.",this.getMake(), this.getModel(), this.getHorsepower());
    }

    public  String getMake(){
        return this.make;
    }

    public  String getModel(){
        return this.model;
    }

    public  int getHorsepower(){
        return this.horsepower;
    }

    public void setMake(String make){
        this.make = make;
    }

    public  void setModel(String model){
        this.model = model;
    }

    public void setHorsepower(int horsepower){
        this.horsepower = horsepower;
    }


}
