import java.util.Scanner;

public class Ski {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int day = Integer.parseInt(scan.nextLine());
        String room = scan.nextLine();
        String evaluation = scan.nextLine();

        double price = 0;

        if (room.equals("room for one person")){
            if (day < 10){
                price = (day - 1) * 18;
            }else if (day >= 10 && day <= 15){
                price = (day - 1) * 18;
            }else  if (day > 15){
                price = (day - 1) * 18;
            }
        }else if (room.equals("apartment")){
            if (day < 10){
                price = (day - 1) * 25;
                price = price * 0.70;
            }else if (day >= 10 && day <= 15){
                price = (day - 1) * 25* 0.65;
            }else  if (day > 15){
                price = (day - 1) * 25 * 0.50;
            }
        }else if (room.equals("president apartment")){
            if (day < 10){
                price = (day - 1) * 35 * 0.90;
            }else if (day >= 10 && day <= 15){
                price = (day - 1) * 35 * 0.85;
            }else  if (day > 15){
                price = (day - 1) * 35 * 0.80;
            }
        }
        if (evaluation.equals("positive")){
            price = price + (price * 0.25);
        }else if (evaluation.equals("negative")){
            price = price - (price * 0.10);
        }
        System.out.printf("%.2f",price);
    }
}
