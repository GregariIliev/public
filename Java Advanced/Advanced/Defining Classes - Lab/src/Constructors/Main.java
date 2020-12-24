package Constructors;

import Constructors.Cars;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<Cars> carsLIst = putCarToList(scan, n);

        for (Cars cars : carsLIst) {
            System.out.println(cars.getInfo());
        }
    }

    private static List<Cars> putCarToList(Scanner scan, int n) {
        List<Cars> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] inputLine = scan.nextLine().split("\\s+");

            if (inputLine.length == 1) {
                String make = inputLine[0];

                Cars cars = new Cars(make);
                list.add(cars);

            } else if (inputLine.length == 3) {
                String make = inputLine[0];
                String model = inputLine[1];
                int horsepower = Integer.parseInt(inputLine[2]);

                Cars cars = new Cars(make, model, horsepower);

                list.add(cars);
            }
        }
        return list;
    }
}
