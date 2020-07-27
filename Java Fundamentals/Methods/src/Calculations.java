import java.util.Scanner;

public class Calculations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String command = scan.nextLine();
        int firstNum = Integer.parseInt(scan.nextLine());
        int secondNum = Integer.parseInt(scan.nextLine());

        add(command ,firstNum ,secondNum);
        subtract(command ,firstNum ,secondNum);
        multiply(command ,firstNum ,secondNum);
        divide(command ,firstNum ,secondNum);

    }

    private static void add(String command, int firstNum, int secondNum) {
        if (command.equals("add")){
            int result = firstNum + secondNum;
            System.out.println(result);
        }
    }

    private static void subtract(String command, int firstNum, int secondNum) {
        if (command.equals("subtract")){
            int result = firstNum - secondNum;
            System.out.println(result);
        }
    }

    private static void multiply(String command, int firstNum, int secondNum) {
        if (command.equals("multiply")){
            int result = firstNum * secondNum;
            System.out.println(result);
        }
    }

    private static void divide(String command, int firstNum, int secondNum) {
        if (command.equals("divide")){
            int result = firstNum / secondNum;
            System.out.println(result);
        }
    }
}
