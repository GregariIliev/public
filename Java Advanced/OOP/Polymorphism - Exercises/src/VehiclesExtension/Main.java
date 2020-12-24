import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Vehicle> vehicleMap = new LinkedHashMap<>();
        Bus bus;

        String[] carInfo = scan.nextLine().split("\\s+");
        String[] truckInfo = scan.nextLine().split("\\s+");
        String[] busInfo = scan.nextLine().split("\\s+");


        try {
            bus = new Bus(Double.parseDouble(busInfo[1]), Double.parseDouble(busInfo[2]), Double.parseDouble(busInfo[3]));
            vehicleMap.put("Car", new Car(Double.parseDouble(carInfo[1]), Double.parseDouble(carInfo[2]), Double.parseDouble(carInfo[3])));
            vehicleMap.put("Truck", new Truck(Double.parseDouble(truckInfo[1]), Double.parseDouble(truckInfo[2]), Double.parseDouble(truckInfo[3])));
            vehicleMap.put("Bus", bus);

        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            return;
        }

        int n = Integer.parseInt(scan.nextLine());

        while (n-- > 0) {
            String[] tokens = scan.nextLine().split("\\s+");
            String command = tokens[0];
            String vehicle = tokens[1];
            double value = Double.parseDouble(tokens[2]);

            if ("Drive".equals(command)){
                System.out.println(vehicleMap.get(vehicle).drive(value));
            }else if ("DriveEmpty".equals(command)){
                System.out.println(bus.driveEmpty(value));
            }else if ("Refuel".equals(command)){
                try {
                    vehicleMap.get(vehicle).refuel(value);
                }catch (IllegalStateException e){
                    System.out.println(e.getMessage());

                }
            }
        }

        for (Vehicle vehicle : vehicleMap.values()) {
            System.out.println(vehicle.toString());
        }
    }
}
