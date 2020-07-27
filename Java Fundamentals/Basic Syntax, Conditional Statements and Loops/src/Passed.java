import java.util.Scanner;

public class Passed {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double evaluation = Double.parseDouble(scan.nextLine());

        if(evaluation >= 3.00){
            System.out.println("Passed!");
        }
    }
}
