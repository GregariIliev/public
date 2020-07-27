import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int count = 1;
        boolean flag = false;
        for (int rows = 1; rows <= number ; rows++) {
            for (int cols = 1; cols <= rows ; cols++) {
                if (count > number){
                    flag = true;
                    break;
                }
                System.out.print(count + " ");
                count++;
            }
            if (flag){
                break;
            }
            System.out.println();
        }
    }
}
