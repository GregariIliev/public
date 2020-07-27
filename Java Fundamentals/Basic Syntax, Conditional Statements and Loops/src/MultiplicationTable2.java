import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numb = Integer.parseInt(scan.nextLine());
        int numb2 = Integer.parseInt(scan.nextLine());

        if (numb2 < 10){
            for (int i = numb2; i <= 10 ; i++) {
                System.out.printf("%d X %d = %d%n",numb ,i , numb * i);
            }
        }else {
            System.out.printf("%d X %d = %d",numb ,numb2 ,numb * numb2);
        }


    }
}
