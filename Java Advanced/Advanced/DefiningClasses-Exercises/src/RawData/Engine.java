package RawData;

public class Engine {
    private int engineSpeed;
    private int enginePower;

    public Engine(int engineSpeed, int enginePower){
        this.engineSpeed = engineSpeed;
        this.enginePower = enginePower;
    }

    public int getEnginePower(){
        return this.enginePower;
    }

    public boolean flamableEngie(){
        return enginePower > 250;
    }
}
