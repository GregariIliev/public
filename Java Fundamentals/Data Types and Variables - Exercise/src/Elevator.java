import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int numbPersons = Integer.parseInt(scan.nextLine());
        int capacityElevator = Integer.parseInt(scan.nextLine());

        int count = 0;
        count = numbPersons / capacityElevator;
        numbPersons = numbPersons % capacityElevator;
        if (numbPersons > 0){
            count++;
        }

        System.out.println(count);

    }
}
