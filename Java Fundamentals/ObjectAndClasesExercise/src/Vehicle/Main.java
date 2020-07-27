package Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Vehicle.Car> carList = new ArrayList<>();
        List<Vehicle.Truck> truckList = new ArrayList<>();

        int carTotalHorsePower = 0;
        int truckTotalHorsePower = 0;

        String input = scan.nextLine();
        while (!"End".equals(input)) {
            String[] arrInput = input.split("\\s+");
            String typeVehicle = arrInput[0];
            String model = arrInput[1];
            String color = arrInput[2];
            int horsePower = Integer.parseInt(arrInput[3]);

            if ("car".equals(typeVehicle)) {
                Vehicle.Car car = new Vehicle.Car(model, color, horsePower);
                carTotalHorsePower += car.getHorsePower();
                carList.add(car);
            } else if ("truck".equals(typeVehicle)) {
                Vehicle.Truck truck = new Vehicle.Truck(model, color, horsePower);
                truckTotalHorsePower += truck.getHorsePower();
                truckList.add(truck);
            }
            input = scan.nextLine();
        }
        input = scan.nextLine();
        while (!"Close the Catalogue".equals(input)) {
            boolean found = false;

            for (int i = 0; i < carList.size(); i++) {
                if (carList.get(i).getModel().equals(input)){
                    System.out.print(carList.get(i).toString());
                    found = true;
                }
            }
            if (!found){
                for (int i = 0; i < truckList.size(); i++) {
                    if (truckList.get(i).getModel().equals(input)){
                        System.out.print(truckList.get(i).toString());
                    }
                }
            }
            input = scan.nextLine();
        }
        double averageCarHorsePower = 0;
        double averageTruckHorsePower = 0;
        if (!carList.isEmpty()){
            averageCarHorsePower = 1.0 * carTotalHorsePower / carList.size();
        }
        if (!truckList.isEmpty()){
            averageTruckHorsePower = 1.0 * truckTotalHorsePower / truckList.size();
        }

        System.out.printf("Cars have average horsepower of: %.2f.%n",averageCarHorsePower);
        System.out.printf("Trucks have average horsepower of: %.2f.",averageTruckHorsePower);
    }
}

