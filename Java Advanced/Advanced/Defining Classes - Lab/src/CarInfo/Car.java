package CarInfo;

public class Car {
    private String make;
    private String model;
    private int horsepower;

    public Car(){

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
