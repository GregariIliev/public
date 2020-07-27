import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String town = scan.nextLine();
        double sell = Double.parseDouble(scan.nextLine());

        boolean isTrue = town.equals("Sofia")
                || town.equals("Varna")
                || town.equals("Plovdiv");

        double result = 0;

        if (town.equals("Sofia")){
            if (sell >= 0 && sell <= 500){
                result = sell * 0.05;
            }else if (sell > 500 && sell <= 1000){
                result = sell * 0.07;
            }else if (sell > 1000 && sell <= 10000){
                result = sell * 0.08;
            }else if (sell > 10000){
                result = sell * 0.12;
            }
        }else if (town.equals("Varna")){
            if (sell >= 0 && sell <= 500){
                result = sell * 0.045;
            }else if (sell > 500 && sell <= 1000){
                result = sell * 0.075;
            }else if (sell > 1000 && sell <= 10000){
                result = sell * 0.10;
            }else if (sell > 10000){
                result = sell * 0.13;
            }
        }else if (town.equals("Plovdiv")){
            if (sell >= 0 && sell <= 500){
                result = sell * 0.055;
            }else if (sell > 500 && sell <= 1000){
                result = sell * 0.08;
            }else if (sell > 1000 && sell <= 10000){
                result = sell * 0.12;
            }else if (sell > 10000){
                result = sell * 0.145;
            }
        }


        if (isTrue && sell > 0){
            System.out.printf("%.2f",result);
        }else{
            System.out.println("error");
        }
    }
}
