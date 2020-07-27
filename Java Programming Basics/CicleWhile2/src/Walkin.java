import java.util.Scanner;

public class Walkin {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        int walking = 0;
        int wlakingSum = 0;
        int walkingMore = 0;
        while (!text.equals("Going home")){
            walking = Integer.parseInt(text);
            wlakingSum +=walking;
            if (wlakingSum >= 10000){
                break;
            }
            text = scan.nextLine();
        }
        if(text.equals("Going home")){
            walkingMore = Integer.parseInt(scan.nextLine());
            wlakingSum += walkingMore;
            if (wlakingSum >= 10000){
                System.out.println("Goal reached! Good job!");
            }else {
                wlakingSum = 10000 - wlakingSum;
                System.out.printf("%d more steps to reach goal.",wlakingSum);
            }
        }else if (wlakingSum >= 10000){
            System.out.printf("Goal reached! Good job!");
        }
    }
}
