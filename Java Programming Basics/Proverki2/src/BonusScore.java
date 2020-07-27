import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double points = Double.parseDouble(scan.nextLine());
        double pointsBonus = 0;
        double pointsBonus2 = 0;

        if (points <= 100) {
            pointsBonus = 5;
        } else if (points > 1000){
            pointsBonus = points * 0.1;
        } else {
            pointsBonus = points * 0.2;
        }
        if (points % 2 == 0){
            pointsBonus2 = 1;
        }
        if (points % 10 == 5){
            pointsBonus2 = pointsBonus2 + 2;
        }
        double allBonusPoints = pointsBonus+ pointsBonus2;
        double allPoints = points + allBonusPoints;
        System.out.println(allBonusPoints);
        System.out.println(allPoints);
    }
}
