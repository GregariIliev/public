import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();


        if (passValidator(password)) {
            System.out.println("Password is valid");
        }
        if (!charactersRange(password)){
            System.out.println("Password must be between 6 and 10 characters");
        }
        if (!lettersAndDigits(password)){
            System.out.println("Password must consist only of letters and digits");
        }
        if (!leastTwoDigits(password)){
            System.out.println("Password must have at least 2 digits");
        }

    }

    private static boolean passValidator(String password) {
        boolean result = false;
        if (leastTwoDigits(password) && lettersAndDigits(password) && charactersRange(password)){
            result = true;
        }

        return result;
    }

    private static boolean leastTwoDigits(String password) {
        int count = 0;
        char symbol = 0;
        for (int i = 0; i < password.length(); i++) {
            symbol = password.charAt(i);
            if (symbol >= 48 && symbol <= 57) {
                count++;
            }
        }
        if (count >= 2) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean lettersAndDigits(String password) {
        char symbol = 0;
        boolean result = false;
        for (int j = 0; j < password.length(); j++) {
            symbol = password.charAt(j);

            if (symbol >= 48 && symbol <= 57) {
                result = true;
            } else if (symbol >= 65 && symbol <= 90) {
                result = true;
            } else if (symbol >= 97 && symbol <= 122) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }

    private static boolean charactersRange(String password) {

        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            count++;
        }
        if (count >= 6 && count <= 10) {
            return true;
        } else {
            return false;
        }
    }
}
