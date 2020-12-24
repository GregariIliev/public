import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        Set<Citizen> citizenSet = new HashSet<>();
        Set<Rebel> rebelSet = new HashSet<>();

        while (n-- > 0){
            String[] input = scan.nextLine().split("\\s+");

            if (input.length == 4){
                Citizen citizen = new Citizen(input[0], Integer.parseInt(input[1]), input[2], input[3]);
                citizenSet.add(citizen);
            }else if (input.length == 3){
                Rebel rebel = new Rebel(input[0], Integer.parseInt(input[1]), input[2]);
                rebelSet.add(rebel);
            }
        }

        int allFood = 0;
        String inputNameBuyer = scan.nextLine();
        while (!"End".equals(inputNameBuyer)){

            for (Citizen citizen : citizenSet) {
                if (citizen.getName().equals(inputNameBuyer)){
                    citizen.buyFood();
                    allFood += 10;
                }
            }
            for (Rebel rebel : rebelSet) {
                if (rebel.getName().equals(inputNameBuyer)){
                    rebel.buyFood();
                    allFood += 5;
                }
            }

            inputNameBuyer = scan.nextLine();
        }

        System.out.println(allFood);
    }
}