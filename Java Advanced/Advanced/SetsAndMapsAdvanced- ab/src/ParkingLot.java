import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class ParkingLot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        Set<String> cars = new LinkedHashSet<>();

        while (!"END".equals(input)){
            String command = input.split(", ")[0];
            String serialNumber = input.split(", ")[1];

            if ("IN".equals(command)){
                cars.add(serialNumber);
            }else if ("OUT".equals(command)){
                cars.remove(serialNumber);
            }

            input = scan.nextLine();
        }
        if (cars.isEmpty()){
            System.out.println("Parking Lot is Empty");
        }else {
            for (String car : cars) {
                System.out.println(car);
            }
        }
    }
}
