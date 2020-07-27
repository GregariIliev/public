import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String destination = scan.nextLine();
        double allMoneySave = 0;
        while (!destination.equals("End")){
            double minBudget = Double.parseDouble(scan.nextLine());
            while (allMoneySave <= minBudget){
                double moneySave = Double.parseDouble(scan.nextLine());
                allMoneySave = allMoneySave + moneySave;
                if (allMoneySave >= minBudget){
                    System.out.printf("Going to %s!%n",destination);
                    allMoneySave = 0;
                    break;
                }
            }
            destination = scan.nextLine();
            if(destination.equals("End")){
                break;
            }
        }
    }
}

