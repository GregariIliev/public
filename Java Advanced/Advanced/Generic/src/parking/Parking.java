package parking;

import java.util.ArrayList;
import java.util.List;

public class Parking {
    private String type;
    private int capacity;
    private List<Car> data;

    public Parking(String type, int capacity){
        this.type = type;
        this.capacity = capacity;
        this.data = new ArrayList<>();
    }

    public void add(Car car){
        if (this.data.size() < this.capacity){
            this.data.add(car);
        }
    }

    public boolean remove(String manufacturer, String model){
        boolean isRemoved = false;

        for (int i = 0; i < this.data.size(); i++) {
            Car car = this.data.get(i);
            String currentManufacturer = car.getManufacturer();
            String currentModel = car.getModel();

            if (currentManufacturer.equals(manufacturer) && currentModel.equals(model)){
                this.data.remove(car);
                isRemoved = true;
            }
        }
        return isRemoved;
    }

    public Car getLatestCar(){

        Car latestCar = null;

        if (this.data.size() > 1){
            Car firstCar = this.data.get(0);
            for (int i = 1; i < this.data.size(); i++) {
                Car currentCar = this.data.get(i);

                if (firstCar.getYear() < currentCar.getYear()){
                    latestCar = currentCar;
                }else {
                    latestCar = firstCar;
                }
            }
        }else if (this.data.size() == 1){
            latestCar = this.data.get(0);
        }
        return latestCar;
    }

    public Car getCar(String manufacturer, String model){
        Car car = null;

        for (int i = 0; i < this.data.size(); i++) {
            Car currentCar = this.data.get(i);
            String currentManufacturer = currentCar.getManufacturer();
            String currentModel = currentCar.getModel();

            if (currentManufacturer.equals(manufacturer) && currentModel.equals(model)){
                car = currentCar;
            }
        }
        return car;
    }

    public int getCount(){
        return this.data.size();
    }

    public String getStatistics(){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(String.format("The cars are parked in %s:%n",this.type));

        for (int i = 0; i < this.data.size(); i++) {
            Car car = this.data.get(i);
            stringBuilder.append(car.toString());
            stringBuilder.append(System.lineSeparator());
        }

        return stringBuilder.toString();
    }
}
