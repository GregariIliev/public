import java.util.Scanner;

public class SmallesOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

                int firstNumb = Integer.parseInt(scan.nextLine());
                int secondNumb = Integer.parseInt(scan.nextLine());
                int thirdNumb = Integer.parseInt(scan.nextLine());

                System.out.println(smallOfThreeNumb(firstNumb, secondNumb, thirdNumb));
            }

            private static int smallOfThreeNumb(int firstNumb, int secondNumb, int thirdNumb) {
                int result = 0;
                if (secondNumb < thirdNumb && secondNumb < firstNumb){
                    result = secondNumb;
                }else if (thirdNumb < firstNumb && thirdNumb < secondNumb){
                    result = thirdNumb;
                }else {
                    result = firstNumb;
                }
                return result;
            }
        }