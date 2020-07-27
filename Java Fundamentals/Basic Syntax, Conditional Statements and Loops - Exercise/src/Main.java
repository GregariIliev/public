import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double budgetIvanCho = Double.parseDouble(scan.nextLine());
        int students = Integer.parseInt(scan.nextLine());
        double priceLightingSabre = Double.parseDouble(scan.nextLine());
        double priceRobes = Double.parseDouble(scan.nextLine());
        double priceBelts = Double.parseDouble(scan.nextLine());

        double allRobesPrice = students * priceRobes;
        int freeBelts = students / 6;
        double allBeltsPrice = priceBelts * (students - freeBelts);
        double allLightSabresPrice = (priceLightingSabre * Math.ceil(students * 1.1));

        double moneyValue = allBeltsPrice + allLightSabresPrice + allRobesPrice;
        double moneyNeeded = moneyValue - budgetIvanCho;
        if (budgetIvanCho >= moneyValue){
            System.out.printf("The money is enough - it would cost %.2flv.",moneyValue);
        }else {
            System.out.printf("Ivan Cho will need %.2flv more.",moneyNeeded);
        }
    }
}
