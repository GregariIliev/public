import java.util.Scanner;

public class OwnBussiness {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int high = Integer.parseInt(scan.nextLine());
        String numbOfComputers = scan.nextLine();

        int allFreeSpace = width * length * high;
        int allComputerSpace = 0;

        while (!numbOfComputers.equals("Done")){
            int numbOfComputersInteger = Integer.parseInt(numbOfComputers);
            allComputerSpace += numbOfComputersInteger;
            if (allComputerSpace > allFreeSpace){
                break;
            }
            numbOfComputers = scan.nextLine();
        }
        int freeSpaceLeft = allFreeSpace - allComputerSpace;

        if (allComputerSpace > allFreeSpace){
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(freeSpaceLeft));
        }else {
            System.out.printf("%d Cubic meters left.",freeSpaceLeft);
        }

    }
}
