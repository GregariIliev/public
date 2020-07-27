import java.util.Scanner;

public class CinemaTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String film = scan.nextLine();

        int student = 0;
        int standard = 0;
        int kid = 0;
        boolean flag = false;
        while (!film.equals("Finish")) {
            int freeSits = Integer.parseInt(scan.nextLine());
            int allSits = 0;
            for (double i = freeSits; i > 0; i--) {
                String billets = scan.nextLine();
                if (billets.equals("End")) {
                    break;
                }
                allSits++;
                if (billets.equals("student")) {
                    student++;
                } else if (billets.equals("standard")) {
                    standard++;
                } else if (billets.equals("kid")) {
                    kid++;
                }
            }
            double porcentSits = allSits * 1.0 / freeSits * 100;
            System.out.printf("%s - %.2f%% full.%n", film, porcentSits);
            film = scan.nextLine();
        }
        int totalTickets = standard + student + kid;
        double studentPorcent = student * 1.0 / totalTickets * 100;
        double standardPorcent = standard * 1.0 / totalTickets * 100;
        double kidPorcent = kid * 1.0 / totalTickets * 100;
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentPorcent);
        System.out.printf("%.2f%% standard tickets.%n", standardPorcent);
        System.out.printf("%.2f%% kids tickets.%n", kidPorcent);
    }
}
