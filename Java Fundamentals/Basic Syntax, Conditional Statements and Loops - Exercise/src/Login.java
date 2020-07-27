import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String user = scan.nextLine();
        String correctPass = "";
        for (int i = user.length() - 1; i >= 0; i--) {
            correctPass = correctPass + user.charAt(i);
        }
        for (int i = 1; i <= 4; i++) {
            String currentPass = scan.nextLine();
            if (currentPass.equals(correctPass)) {
                System.out.printf("User %s logged in.", user);
                break;
            } else if (i < 4){
                System.out.println("Incorrect password. Try again.");
            }else {
                System.out.printf("User %s blocked!",user);
            }
        }
    }
}

