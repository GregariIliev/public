package TrafficLights;

public class TrafficLight {
    private Light light;

    public TrafficLight(Light light){
        this.light = light;
    }

    public TrafficLight(){
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public Light getLight() {
        return light;
    }

    public void update(){
        if (this.light.equals(Light.RED)){
            this.light = Light.GREEN;

        }else if (this.light.equals(Light.GREEN)){
            this.light = Light.YELLOW;

        }else if (this.light.equals(Light.YELLOW)){
            this.light = Light.RED;

        }
    }

    public void printLight(){
        System.out.print(this.light + " ");
    }
}
