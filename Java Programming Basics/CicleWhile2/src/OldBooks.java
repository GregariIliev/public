import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String bookSearch = scan.nextLine();
        int biblioCapacity = Integer.parseInt(scan.nextLine());

        String book = scan.nextLine();
        int count = 0;
        while (!bookSearch.equals(book)){
            count +=1;
            if (count == biblioCapacity){
                break;
            }
            book = scan.nextLine();
        }
        if (book.equals(bookSearch)){
            System.out.printf("You checked %d books and found it.",count);
        }else {
            System.out.println("The book you search is not here!");
            System.out.printf("You checked %d books.",count);
        }
    }
}
