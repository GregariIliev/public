import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        String[] firstArr = new String[n];
        String[] secondArr = new String[n];
        for (int i = 0; i < n; i++) {
            String[] currentArr = scan.nextLine().split(" ");
            if (i % 2 == 0){
                for (int j = 0; j < 1; j++) {
                    firstArr[i] = currentArr[j];
                    secondArr[i] = currentArr[j + 1];
                }
            }else if (i % 2 == 1){
                for (int j = 0; j < 1; j++) {
                    firstArr[i] = currentArr[j + 1];
                    secondArr[i] = currentArr[j];
                }
            }

        }
        System.out.println(String.join(" ",firstArr));
        System.out.println(String.join(" ",secondArr));
    }
}
