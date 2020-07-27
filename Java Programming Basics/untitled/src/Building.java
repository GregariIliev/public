import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int etaji = Integer.parseInt(scan.nextLine());
        int stai = Integer.parseInt(scan.nextLine());

        for (int etaj = etaji; etaj > 0; etaj--) {
            for (int staq = 0; staq < stai ; staq++) {
                if (etaj == etaji ){
                    System.out.print("L" + etaj + staq + " ");
                }else if (etaj % 2 == 0){
                    System.out.print("O" + etaj + staq + " ");
                }else if (etaj % 2 == 1){
                    System.out.print("A" + etaj + staq + " ");
                }
            }
            System.out.println();
        }
    }
}
