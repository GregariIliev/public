package CarSalesman;

import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    //optional
    private int weight;
    private String color;


    public Car(String model, Engine engine){
        this.model = model;
        this.engine = engine;
    }

    public Car(String model, Engine engine, int weight){
        this(model, engine);
        this.weight = weight;
    }

    public Car(String model, Engine engine, String color){
        this(model, engine);
        this.color = color;
    }

    public Car(String model, Engine engine, int weight, String color){
        this(model, engine);
        this.weight = weight;
        this.color = color;
    }

    public String parseToString(Engine engine){
        return engine.toString();
    }

    public String getModel(){
        return this.model;
    }

    public Engine getEngine(){
        return this.engine;
    }

    public String getWeight(){
        String weight = "";
        if (this.weight <= 0){
            weight = "n/a";
        }else {
            weight = String.valueOf(this.weight);
        }
        return weight;
    }

    public String getColor(){
        String color = "";
        if (this.color == null){
            color = "n/a";
        }else {
            color = this.color;
        }
        return color;
    }
    //<CarModel>:
    //<EngineModel>:
    //Power: <EnginePower>
    //Displacement: <EngineDisplacement>
    //Efficiency: <EngineEfficiency>
    //Weight: <CarWeight>
    //Color: <CarColor>

    public String toString(){
      return String.format("%s:%n" +
              "%s" +
              "Weight: %s%n" +
              "Color: %s",getModel(), getEngine().toString(), getWeight(), getColor());
    }

}
