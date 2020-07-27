import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Train {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String train = scan.nextLine();

        String[] trainWaggons = train.split(" ");

        List<Integer> waggons = new ArrayList<>();

        for (int i = 0; i < trainWaggons.length; i++) {
            int numb = Integer.parseInt(trainWaggons[i]);
            waggons.add(numb);
        }

        int limitNumberOfPassengers = Integer.parseInt(scan.nextLine());
        String command = scan.nextLine();
        while (!"end".equals(command)){
            String[] commands = command.split(" ");

            if ("Add".equals(commands[0])){
                int passengerToNewWaggon = Integer.parseInt(commands[1]);
                waggons.add(passengerToNewWaggon);
            }else {
                int passengers = Integer.parseInt(commands[0]);
                for (int i = 0; i < waggons.size(); i++) {
                    if (passengers + waggons.get(i) <= limitNumberOfPassengers){
                        int sum = passengers + waggons.get(i);
                        waggons.set(i , sum);
                        break;
                    }
                }
            }
            command = scan.nextLine();
        }
        for (int i = 0; i < waggons.size(); i++) {
            System.out.print(waggons.get(i) + " ");
        }
    }
}
