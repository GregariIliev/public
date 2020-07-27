import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String type = scan.nextLine();
        String first = scan.nextLine();
        String second = scan.nextLine();

        if ("int".equals(type)){
            int firstNumb = Integer.parseInt(first);
            int secondNumb = Integer.parseInt(second);
            System.out.println(getMax(firstNumb, secondNumb));
        }else if ("char".equals(type)){
            char firstCh = first.charAt(0);
            char secondCh = second.charAt(0);
            System.out.println(getMax(firstCh, secondCh));
        }else if ("string".equals(type)){
            System.out.println(getMax(first, second));
        }
    }

    private static int getMax(int firstNumb, int secondNumb) {
        if (firstNumb > secondNumb){
            return firstNumb;
        }
        return secondNumb;
    }

    private  static char getMax(char firstCh, char secondCh){
        if (firstCh > secondCh){
            return firstCh;
        }
        return secondCh;
    }

    private static String getMax(String first, String second) {
        if (first.compareTo(second) >= 0){
            return first;
        }
        return second;
    }
}
