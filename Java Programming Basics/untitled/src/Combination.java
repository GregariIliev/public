import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());
        int count = 0;
        for (int a = 0; a <= number ; a++) {
            for (int b = 0; b <= 25 ; b++) {
                for (int c = 0; c <= 25 ; c++) {
                    int result = a + b + c;
                    if ( result == number){
                        count++;
                    }


                }

            }

        }
        System.out.println(count);
    }
}
