package CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      int n = Integer.parseInt(scan.nextLine());

        List<Car> carsLIst = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] inputLine = scan.nextLine().split("\\s+");

            String make = inputLine[0];
            String model = inputLine[1];
            int horsepower = Integer.parseInt(inputLine[2]);

            Car cars = new Car();
            cars.setMake(make);
            cars.setModel(model);
            cars.setHorsepower(horsepower);

            carsLIst.add(cars);
        }

        for (Car cars : carsLIst) {
            System.out.println(cars.getInfo());
        }
    }
}
