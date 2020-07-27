import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String year = scan.nextLine();
        int holidaysOnYears = Integer.parseInt(scan.nextLine());
        int weekensVladiTravel = Integer.parseInt(scan.nextLine());

        double holidays = holidaysOnYears;

        double weekendsSofia = 48 - weekensVladiTravel;
        double vladiNotWork = weekendsSofia * 3/4;
        double vladiPlays = holidays * 2/3 + weekensVladiTravel + vladiNotWork;
        if (year.equals("leap")){
            vladiPlays = vladiPlays * 1.15;
            System.out.println(Math.ceil(vladiPlays));
        }
    }
}
