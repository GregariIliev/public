package greedyTimes;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long capacity = Long.parseLong(scanner.nextLine());
        String[] inputData = scanner.nextLine().split("\\s+");

        Bag bag = new Bag(capacity);
        for (int i = 0; i < inputData.length; ++i) {
            String item = inputData[i++];
            long quantity = Long.parseLong(inputData[i]);

            String type;
            if (item.length() == 3)
                type = "Cash";
            else if (item.toLowerCase().endsWith("gem"))
                type = "Gem";
            else if (item.toLowerCase().equals("gold"))
                type = "Gold";
            else
                continue;

            if (bag.checkSize(quantity))
                continue;

            switch (type) {
                case "Cash": bag.addCash(item, quantity); break;
                case "Gem": bag.addGems(item, quantity); break;
                case "Gold": bag.addGold(quantity); break;
            }
        }

        for (BagItem item : bag.getContent())
            System.out.print(item);
    }

}
