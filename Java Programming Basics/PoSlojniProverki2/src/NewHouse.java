import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String flower = scan.nextLine();
        int flowerNumb = Integer.parseInt(scan.nextLine());
        int money = Integer.parseInt(scan.nextLine());

        double price = 0;
        String flower2 = "";

        if (flower.equals("Roses")){
            flower2 = "Roses";
            if (flowerNumb > 80){
                price = flowerNumb * 5;
                price = price * 0.90;
            }else {
                price = flowerNumb * 5;
            }
        }else if (flower.equals("Dahlias")){
            flower2 = "Dahlias";
            if (flowerNumb > 90){
                price = flowerNumb * 3.80;
                price = price * 0.85;
            }else {
                price = flowerNumb * 3.80;
            }
        }else if (flower.equals("Tulips")){
            flower2 = "Tulips";
            if (flowerNumb > 80){
                price = flowerNumb * 2.80;
                price = price * 0.85;
            }else {
                price = flowerNumb * 2.80;
            }
        }else if (flower.equals("Narcissus")){
            flower2 = "Narcissus";
            if (flowerNumb < 120){
                price = flowerNumb * 3;
                price = price * 1.15;
            }else {
                price = flowerNumb * 3;
            }
        }else if (flower.equals("Gladiolus")){
            flower2 = "Gladiolus";
            if (flowerNumb < 80){
                price = flowerNumb * 2.50;
                price = price * 1.20;
            }else {
                price = flowerNumb * 2.50;
            }
        }
        double moneyLeft = price - money;
        if (money >= price){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.",flowerNumb ,flower2 ,Math.abs(moneyLeft));
        }else System.out.printf("Not enough money, you need %.2f leva more.",Math.abs(moneyLeft));
    }
}
