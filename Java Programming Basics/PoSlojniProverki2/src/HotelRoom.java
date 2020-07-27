import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String month = scan.nextLine();
        int numberOfNights = Integer.parseInt(scan.nextLine());

        double studioPrice = 0.0;
        double apartmentPrice = 0.0;

        if (month.equals("May") || month.equals("October")){
            if(numberOfNights > 7 && numberOfNights <= 14){
                studioPrice = (numberOfNights * 50) * 0.95;
                apartmentPrice = numberOfNights * 65;
            }else if (numberOfNights > 14){
                studioPrice = (numberOfNights * 50) * 0.70;
                apartmentPrice = (numberOfNights * 65) * 0.90;
            }else if (numberOfNights <= 7){
                apartmentPrice = numberOfNights * 65;
                studioPrice = numberOfNights * 50;
            }
        }else if (month.equals("June") || month.equals("September")){
            if(numberOfNights > 14){
                studioPrice = (numberOfNights * 75.20) * 0.80;
                apartmentPrice = (numberOfNights * 68.70) * 0.90;
            }else if (numberOfNights <= 14){
                studioPrice = numberOfNights * 75.20;
                apartmentPrice = numberOfNights * 68.70;
            }
        }else if (month.equals("July") || month.equals("August")){
            studioPrice = numberOfNights * 76;
            if (numberOfNights > 14){
                apartmentPrice = (numberOfNights * 77) * 0.90;
            }else if (numberOfNights <= 14){
                apartmentPrice = numberOfNights * 77;
            }
        }
        System.out.printf("Apartment: %.2f lv.%n",apartmentPrice);
        System.out.printf("Studio: %.2f lv.",studioPrice);
    }
}
