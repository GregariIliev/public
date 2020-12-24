package jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Galaxy galaxy = new Galaxy(readCoordinates(scanner.nextLine()));
        Evil evil = new Evil();
        Ivo ivo = new Ivo();

        long totalStarsCollected = 0;

        String command = scanner.nextLine();
        while (!command.equals("Let the Force be with you")) {
            int[] ivoCoordinates = readCoordinates(command);
            int[] evilCoordinates = readCoordinates(scanner.nextLine());

            evil.setNewCoordinates(evilCoordinates);
            evil.destroyStars(galaxy);

            ivo.setNewCoordinates(ivoCoordinates);
            totalStarsCollected += ivo.collectStars(galaxy);

            command = scanner.nextLine();
        }

        System.out.println(totalStarsCollected);


    }

    private static int[] readCoordinates(String command) {
        return Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
    }


}
