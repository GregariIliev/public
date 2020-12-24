package CarSalesman;

import java.util.List;

public class Engine {
    private String model;
    private int power;
    //optianal
    private int displacement;
    private String efficiency;

    public Engine(String model, int power){
        this.model = model;
        this.power = power;
    }

    public Engine(String model, int power, int displacement){
        this(model, power);
        this.displacement = displacement;
    }

    public Engine(String model, int power, String efficiency){
        this(model, power);
        this.efficiency = efficiency;
    }

    public Engine(String model, int power,int displacement, String efficiency){
        this(model, power);
        this.displacement = displacement;
        this.efficiency = efficiency;
    }

    public Engine(){

    }

    public String getModel(){
        return this.model;
    }

    public int getPower(){
        return this.power;
    }

    public String getDisplacement(){
        String displacement = "";
        if (this.displacement <= 0){
            displacement = "n/a";
        }else {
            displacement = String.valueOf(this.displacement);
        }
        return displacement;
    }

    public String getEfficiency(){
        String efficiency = "";
        if (this.efficiency == null){
            efficiency = "n/a";
        }else {
            efficiency = this.efficiency;
        }
        return efficiency;
    }

    public Engine getEngine(List<Engine> engineList, String model){

        Engine modelEngine = new Engine();
        for (int i = 0; i < engineList.size(); i++) {
            if (engineList.get(i).getModel().equals(model)){
                modelEngine = engineList.get(i);
            }
        }
        return modelEngine;
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
                "Power: %d%n" +
                "Displacement: %s%n" +
                "Efficiency: %s%n",getModel(), getPower(), getDisplacement(), getEfficiency());
    }
}
