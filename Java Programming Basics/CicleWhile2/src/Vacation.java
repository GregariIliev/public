import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyForTravel = Double.parseDouble(scan.nextLine());
        double moneyHave = Double.parseDouble(scan.nextLine());

        int days = 0;
        int consevutiveDays = 0;

        while (moneyHave < moneyForTravel){
            String spendSave = scan.nextLine();
            double moneySpendSave = Double.parseDouble(scan.nextLine());
            if (spendSave.equals("spend")){
                moneyHave = moneyHave - moneySpendSave;
                if (moneyHave < 0){
                    moneyHave = 0;
                }
                consevutiveDays ++;
                days ++;
                if (consevutiveDays == 5){
                    break;
                }
            }else if (spendSave.equals("save")){
                moneyHave = moneyHave + moneySpendSave;
                consevutiveDays = 0;
                days ++;

            }

        }
        if (consevutiveDays == 5){
            System.out.println("You can't save the money.");
            System.out.printf("%d",days);
        }else if (moneyHave >= moneyForTravel){
            System.out.printf("You saved the money for %d days.",days);
        }
        
    }
}
