import java.util.Scanner;

public class Graduation2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();
        double finEvaluation = 0;
        int count = 1;
        while (count <= 12){
            double evaluation = Double.parseDouble(scan.nextLine());
            if (evaluation < 4){
                evaluation = Double.parseDouble(scan.nextLine());
                if (evaluation < 4){
                    break;
                }
            }
            finEvaluation = finEvaluation + evaluation;
            count++;
        }
        finEvaluation = finEvaluation / 12;
        if (count < 12){
            System.out.printf("%s has been excluded at %d grade",name ,count);
        }else {
            System.out.printf("%s graduated. Average grade: %.2f",name ,finEvaluation);
        }
    }
}
