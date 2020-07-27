import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int time1 = Integer.parseInt(scan.nextLine());
        int time2 = Integer.parseInt(scan.nextLine());
        int time3 = Integer.parseInt(scan.nextLine());

        int allTime = time1+time2+time3;
        int minuteTime = allTime/60;
        int secTime = allTime%60;

        if (secTime<10){
            System.out.printf("%d:0%d",minuteTime ,secTime);
        }else System.out.printf("%d:%d",minuteTime ,secTime);

    }
}

