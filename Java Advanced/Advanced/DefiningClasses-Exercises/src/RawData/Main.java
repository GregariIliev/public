package RawData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<Car> carList = new ArrayList<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
            Car car = createdNewCar(scan);
            carList.add(car);
        }

        String command = scan.nextLine();

        if ("fragile".equals(command)) {
            for (Car currentCar : carList) {
                String cargoType = currentCar.getCargo().getCargoType();
                boolean lowPressuresTires = currentCar.getTires().lowPressureTires();

                if ("fragile".equals(cargoType) && lowPressuresTires) {
                    System.out.println(currentCar.getModel());
                }
            }
        }else if ("flamable".equals(command)){
            for (Car currentCar : carList) {
                String cargoType = currentCar.getCargo().getCargoType();
                boolean flamableEngine = currentCar.getEngine().flamableEngie();

                if ("flamable".equals(cargoType) && flamableEngine) {
                    System.out.println(currentCar.getModel());
                }
            }
        }

    }


    private static Car createdNewCar (Scanner scan){
        String[] inputLine = scan.nextLine().split("\\s+");

        String model = inputLine[0];
        int engineSpeed = Integer.parseInt(inputLine[1]);
        int enginePower = Integer.parseInt(inputLine[2]);
        int cargoWeight = Integer.parseInt(inputLine[3]);
        String cargoType = inputLine[4];

        double tire1Pressure = Double.parseDouble(inputLine[5]);
        int tire1Age = Integer.parseInt(inputLine[6]);
        double tire2Pressure = Double.parseDouble(inputLine[7]);
        int tire2Age = Integer.parseInt(inputLine[8]);
        double tire3Pressure = Double.parseDouble(inputLine[9]);
        int tire3Age = Integer.parseInt(inputLine[10]);
        double tire4Pressure = Double.parseDouble(inputLine[11]);
        int tire4Age = Integer.parseInt(inputLine[12]);

        Engine engine = new Engine(engineSpeed, enginePower);
        Cargo cargo = new Cargo(cargoWeight, cargoType);
        Tires tires = new Tires(tire1Pressure, tire1Age, tire2Pressure,
                tire2Age, tire3Pressure, tire3Age, tire4Pressure, tire4Age);

        return new Car(model, engine, cargo, tires);
    }
}