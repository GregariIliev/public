import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());

        int cakeTotal = width * length;
        int cakePiece = 0;
        String command = scan.nextLine();
        while (!command.equals("STOP")){
            cakePiece = Integer.parseInt(command);
            cakeTotal -= cakePiece;
            if (cakeTotal <= 0){
                break;
            }

            command = scan.nextLine();
        }
        if (command.equals("STOP") && cakeTotal > 0){
            System.out.printf("%d pieces are left.",cakeTotal);
        }else {
            System.out.printf("No more cake left! You need %d pieces more.",Math.abs(cakeTotal));
        }
    }
}
