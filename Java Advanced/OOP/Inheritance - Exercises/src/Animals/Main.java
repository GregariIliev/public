package animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            String input = scan.nextLine();
            if (input.equals("Beast!")) {
                break;
            }
            String[] inputData = scan.nextLine().split("\\s+");
            String animalName = inputData[0];
            int animalAge = Integer.parseInt(inputData[1]);
            String animalGender = inputData[2];

            if (validationAge(animalAge)) continue;

            if (input.equals("Cat")) {
                Cat cat = new Cat(animalName, animalAge, animalGender);
                System.out.println(cat.toString());

            } else if (input.equals("Dog")) {
                Dog dog = new Dog(animalName, animalAge, animalGender);
                System.out.println(dog.toString());

            } else if (input.equals("Frog")) {
                Frog frog = new Frog(animalName, animalAge, animalGender);
                System.out.println(frog.toString());

            } else if (input.equals("Kitten")) {
                Kitten kitten = new Kitten(animalName, animalAge);
                System.out.println(kitten.toString());

            } else if (input.equals("Tomcat")) {
                Tomcat tomcat = new Tomcat(animalName, animalAge);
                System.out.println(tomcat.toString());

            }
        }
    }

    private static boolean validationAge(int animalAge) {
        if (animalAge < 0) {
            System.out.println("Invalid input!");
            return true;
        }
        return false;
    }
}
