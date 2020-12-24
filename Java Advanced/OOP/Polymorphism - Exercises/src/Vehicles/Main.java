import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] carInfo = scan.nextLine().split("\\s+");
        String[] truckInfo = scan.nextLine().split("\\s+");

        Vehicle car = new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]));
        Vehicle truck = new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]));

        int n = Integer.parseInt(scan.nextLine());

        while (n-- > 0){
            String[] tokens = scan.nextLine().split("\\s+");
            String command = tokens[0];
            String vehicle = tokens[1];
            double value = Double.parseDouble(tokens[2]);

            if (command.equals("Drive") && vehicle.equals("Car")){
                System.out.println(car.drive(value));

            }else if (command.equals("Drive") && vehicle.equals("Truck")){
                System.out.println(truck.drive(value));

            }else if (command.equals("Refuel") && vehicle.equals("Car")){
                car.refuel(value);

            }else if (command.equals("Refuel") && vehicle.equals("Truck")){
                truck.refuel(value);

            }
        }

        System.out.println(car.toString());
        System.out.println(truck.toString());
    }
}
