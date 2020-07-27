import java.util.Scanner;

public class HeartDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] neighborhood = scan.nextLine().split("@");

        Integer[] intNeighborhood = new Integer[neighborhood.length];

        for (int i = 0; i < intNeighborhood.length; i++) {
            intNeighborhood[i] = Integer.parseInt(neighborhood[i]);
        }

        int currentHouse = 0;

        String commandJump = scan.nextLine();
        while (!"Love!".equals(commandJump)) {
            String[] commands = commandJump.split("\\s+");

            int jumpLength = Integer.parseInt(commands[1]);

            if (jumpLength > intNeighborhood.length - 1 || currentHouse + jumpLength > intNeighborhood.length - 1) {
                currentHouse = 0;
                if (intNeighborhood[currentHouse] <= 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", currentHouse);
                } else {
                    intNeighborhood[currentHouse] = intNeighborhood[currentHouse] - 2;
                    if (intNeighborhood[currentHouse] == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", currentHouse);
                    }
                }
            } else {
                //  intNeighborhood[jumpLength] = intNeighborhood[jumpLength] - 2;
                currentHouse = currentHouse + jumpLength;
                if (intNeighborhood[currentHouse] == 0) {
                    System.out.printf("Place %d already had Valentine's day.%n", currentHouse);
                } else {
                    intNeighborhood[currentHouse] = intNeighborhood[currentHouse] - 2;
                    if (intNeighborhood[currentHouse] == 0) {
                        System.out.printf("Place %d has Valentine's day.%n", currentHouse);
                    }
                }
            }

            commandJump = scan.nextLine();
        }

        System.out.printf("Cupid's last position was %d.%n", currentHouse);
        boolean cupidFailed = false;
        int failCountPlaces = 0;
        for (Integer house : intNeighborhood) {
            if (house > 0) {
                failCountPlaces++;
                cupidFailed = true;
            }
        }
        if (cupidFailed) {
            System.out.printf("Cupid has failed %d places.", failCountPlaces);
        } else {
            System.out.println("Mission was successful.");
        }

    }
}



