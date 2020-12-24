package CarSalesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Engine> engineList = fillEngineToList(scan, n);

        int m = Integer.parseInt(scan.nextLine());

        List<Car> carList = fillCarToList(scan, m, engineList);

        //<CarModel>:
        //<EngineModel>:
        //Power: <EnginePower>
        //Displacement: <EngineDisplacement>
        //Efficiency: <EngineEfficiency>
        //Weight: <CarWeight>
        //Color: <CarColor>

        for (Car car : carList) {
            System.out.println(car.toString());
        }


    }

    private static List<Car> fillCarToList(Scanner scan, int m, List<Engine> engineList) {
        List<Car> carList = new ArrayList<>();
        Car car;
        for (int i = 0; i < m; i++) {
            String[] tokensCar = scan.nextLine().split("\\s+");
            String model = tokensCar[0];
            String engineModel = tokensCar[1];

            Engine engine = new Engine();
            engine = engine.getEngine(engineList, engineModel);

            if (tokensCar.length == 2){
                car = new Car(model, engine);
            }else if (tokensCar.length == 3){
                try {
                    int weight = Integer.parseInt(tokensCar[2]);
                    car = new Car(model, engine, weight);

                }catch (NumberFormatException e){
                    String color = tokensCar[2];
                    car = new Car(model, engine, color);
                }
            }else {
                int weight = Integer.parseInt(tokensCar[2]);
                String color = tokensCar[3];

                car = new Car(model, engine, weight, color);
            }
            carList.add(car);
        }
        return carList;
    }

    private static List<Engine> fillEngineToList(Scanner scan, int n) {
        List<Engine> engineList = new ArrayList<>();
        Engine engine;
        for (int i = 0; i < n; i++) {
            String[] tokensEngine = scan.nextLine().split("\\s+");

            String model = tokensEngine[0];
            int power = Integer.parseInt(tokensEngine[1]);

            if (tokensEngine.length == 2){
                engine = new Engine(model, power);

            }else if (tokensEngine.length == 3){
                try {
                    int displacement = Integer.parseInt(tokensEngine[2]);
                    engine = new Engine(model, power, displacement);
                }catch (NumberFormatException e){
                    String efficiency = tokensEngine[2];
                    engine = new Engine(model, power, efficiency);
                }
            }else {
                int displacement = Integer.parseInt(tokensEngine[2]);
                String efficiency = tokensEngine[3];

                engine = new Engine(model, power, displacement, efficiency);
            }
            engineList.add(engine);
        }
        return engineList;
    }

}
