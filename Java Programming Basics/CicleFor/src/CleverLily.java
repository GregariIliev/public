import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int age = Integer.parseInt(scan.nextLine());
        double machinePrice = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());

        int bonusMoney = 0;
        int money = 0;
        int toysQuant = 0;

        for (int i = 1 ; i <= age ; i++){
            if (i % 2 == 0){
                bonusMoney = bonusMoney + 10;
                money = money + bonusMoney - 1;
            }else {
                toysQuant = toysQuant + 1;
            }
        }

        double toysFinalPrice = toyPrice * toysQuant;
        double allMoney = toysFinalPrice + money;
        double moneyLeft = machinePrice - allMoney;
        if (machinePrice <= allMoney){
            System.out.printf("Yes! %.2f",Math.abs(moneyLeft));
        }else {
            System.out.printf("No! %.2f",Math.abs(moneyLeft));
        }

    }
}
