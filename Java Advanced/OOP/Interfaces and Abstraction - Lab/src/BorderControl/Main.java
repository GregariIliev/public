import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        List<Identifiable> identifiableList = new ArrayList<>();

        while (!"End".equals(input)){
            String[] inputData = input.split("\\s+");

            if (inputData.length == 2){
                Robot robot = new Robot(inputData[0], inputData[1]);
                identifiableList.add(robot);
            }else if (inputData.length == 3){
                Citizen citizen = new Citizen(inputData[0], Integer.parseInt(inputData[1]), inputData[2]);
                identifiableList.add(citizen);
            }
            input = scan.nextLine();
        }

        input = scan.nextLine();

        for (Identifiable identifiable : identifiableList) {
            if (identifiable.getId().endsWith(input)){
                System.out.println(identifiable.getId());
            }
        }
    }
}
