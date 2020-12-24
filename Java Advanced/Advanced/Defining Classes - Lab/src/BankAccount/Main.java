package BankAccount;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<Integer, BankAccount> bankAccountMap = new HashMap<>();

        String input = scan.nextLine();
        while (!"End".equals(input)){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            if ("Create".equals(command)){
                BankAccount bankAccount = new BankAccount();
                int id = bankAccount.getId();

                bankAccountMap.putIfAbsent(id, bankAccount);
                System.out.printf("Account ID%d created%n",id);

            }else if ("Deposit".equals(command)){
                int id = Integer.parseInt(tokens[1]);
                double amount = Double.parseDouble(tokens[2]);

                if (bankAccountMap.containsKey(id)){
                    bankAccountMap.get(id).deposit(amount);
                    System.out.printf("Deposited %.0f to ID%d%n",amount ,id);
                }else {
                    System.out.println("Account does not exist");
                }

            }else if ("SetInterest".equals(command)){
                double interest = Double.parseDouble(tokens[1]);
                BankAccount.setInterestRate(interest);

            }else if ("GetInterest".equals(command)){
                int id = Integer.parseInt(tokens[1]);
                int years = Integer.parseInt(tokens[2]);

                if (bankAccountMap.containsKey(id)) {
                    double interest = bankAccountMap.get(id).getInterest(years);
                    System.out.printf("%.2f%n",interest);
                }else {
                    System.out.println("Account does not exist");
                }
            }

            input = scan.nextLine();
        }
    }
}
