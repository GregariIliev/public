import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        List<Pet> petList = new ArrayList<>();
        List<Citizen> citizenList = new ArrayList<>();

        while (!"End".equals(input)){
            String[] inputData = input.split("\\s+");

            if (inputData[0].equals("Pet")){
                Pet pet = new Pet(inputData[1], inputData[2]);
                petList.add(pet);
            }else if (inputData[0].equals("Citizen")){
                Citizen citizen = new Citizen(inputData[1], Integer.parseInt(inputData[2]), inputData[3], inputData[4]);
                citizenList.add(citizen);
            }

            input = scan.nextLine();
        }

        boolean coincidence = false;
        String year = scan.nextLine();
        for (Citizen citizen : citizenList) {
            String[] split = citizen.getBirthDate().split("\\/");
            String date = split[2];
            if (year.equals(date)){
                System.out.println(citizen.getBirthDate());
                coincidence = true;
            }
        }
        for (Pet pet : petList) {
            String[] split = pet.getBirthDate().split("\\/");
            String date = split[2];
            if (year.equals(date)){
                System.out.println(pet.getBirthDate());
                coincidence = true;
            }
        }
        if (!coincidence){
            System.out.println("<no output>");
        }
    }
}