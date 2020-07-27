import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double moneyInMachine = 0;
        String text = scan.nextLine();
        while (!text.equals("Start")) {
            double coin = Double.parseDouble(text);
            if (coin == 0.1 || coin == 0.2 || coin == 0.5 || coin == 1 || coin == 2) {
                moneyInMachine += coin;
            } else {
                System.out.printf("Cannot accept %.2f%n", coin);
            }
            text = (scan.nextLine());
        }
        text = scan.nextLine();
        while (!text.equals("End")){
            if (text.equals("Nuts")){
                if (moneyInMachine >= 2.0){
                    moneyInMachine -= 2.0;
                    System.out.println("Purchased Nuts");
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }else if (text.equals("Water")){
                if (moneyInMachine >= 0.7){
                    moneyInMachine -= 0.7;
                    System.out.println("Purchased Water");
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }else if (text.equals("Crisps")){
                if (moneyInMachine >= 1.5){
                    moneyInMachine -= 1.5;
                    System.out.println("Purchased Crisps");
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }else if (text.equals("Soda")){
                if (moneyInMachine >= 0.8){
                    moneyInMachine -= 0.8;
                    System.out.println("Purchased Soda");
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }else if (text.equals("Coke")){
                if (moneyInMachine >= 1.0){
                    moneyInMachine -= 1.0;
                    System.out.println("Purchased Coke");
                }else {
                    System.out.println("Sorry, not enough money");
                }
            }else {
                System.out.println("Invalid product");
            }
            text = scan.nextLine();
        }
        if (moneyInMachine >= 0){
            System.out.printf("Change: %.02f",moneyInMachine);
        }
    }
}

