import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double input = Double.parseDouble(scan.nextLine());

        grade(input);

        System.out.println(grade(input));
    }

    private static String grade(double input) {
        String evaluation = "";
        if (input >= 2 && input < 3){
            evaluation = "Fail";
        }else if (input >= 3 && input < 3.50){
            evaluation = "Poor";
        }else if (input >= 3.50 && input < 4.50){
            evaluation = "Good";
        }else if (input >= 4.50 && input < 5.50){
            evaluation = "Very good";
        }else if (input >= 5.50 && input <= 6){
            evaluation = "Excellent";
        }
        return evaluation;
    }
}
