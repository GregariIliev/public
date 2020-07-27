import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int personsNumb = Integer.parseInt(scan.nextLine());
        String group = scan.nextLine();
        String day = scan.nextLine();
        double price = 0;

        if (day.equals("Friday")){
            if (group.equals("Students")){
                price = personsNumb * 8.45;
            }else if (group.equals("Business")){
                if (personsNumb >= 100){
                    personsNumb = personsNumb - 10;
                    price = personsNumb * 10.90;
                }
                price = personsNumb * 10.90;
            }else if (group.equals("Regular")){
                price = personsNumb * 15;
            }
        }else if (day.equals("Saturday")){
            if (group.equals("Students")){
                price = personsNumb * 9.80;
            }else if (group.equals("Business")){
                if (personsNumb >= 100){
                    personsNumb = personsNumb - 10;
                    price = personsNumb * 15.60;
                }
                price = personsNumb * 15.60;
            }else if (group.equals("Regular")){
                price = personsNumb * 20;
            }
        }else if (day.equals("Sunday")){
            if (group.equals("Students")){
                price = personsNumb * 10.46;
            }else if (group.equals("Business")){
                if (personsNumb >= 100){
                    personsNumb = personsNumb - 10;
                    price = personsNumb * 16;
                }
                price = personsNumb * 16;
            }else if (group.equals("Regular")){
                price = personsNumb * 22.50;
            }
        }
        if (personsNumb >= 30 && group.equals("Students")){
            price = price * 0.85;
        }else if (personsNumb >= 10 && personsNumb <= 20 && group.equals("Regular")){
            price = price * 0.95;
        }
        System.out.printf("Total price: %.2f",price);
    }
}
