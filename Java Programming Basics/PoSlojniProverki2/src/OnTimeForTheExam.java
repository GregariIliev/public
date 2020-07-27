import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int examHour = Integer.parseInt(scan.nextLine());
        int examMinutes = Integer.parseInt(scan.nextLine());
        int arriveHour = Integer.parseInt(scan.nextLine());
        int arriveMinutes = Integer.parseInt(scan.nextLine());

        if (examHour == arriveHour && examMinutes == arriveMinutes || examHour == (arriveHour + 1) && examMinutes <= (arriveMinutes + 30)){
            System.out.println("On time");
        }else if (examHour != arriveHour){
            System.out.println("Late");
        }else if (examHour == arriveHour && examMinutes > (arriveMinutes )){

        }
    }
}
