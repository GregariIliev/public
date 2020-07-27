import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numbDay = Integer.parseInt(scan.nextLine());

        String[] week = new String[] {
                "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
        };
        if (numbDay > 0 && numbDay <= 7){
            System.out.println(week[numbDay - 1]);
        }else {
            System.out.println("Invalid day!");
        }
    }
}
