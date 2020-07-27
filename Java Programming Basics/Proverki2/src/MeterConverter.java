import java.util.Scanner;

public class MeterConverter {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double numb = Double.parseDouble(scan.nextLine());
        String edinica1 = scan.nextLine();
        String edinica2 = scan.nextLine();

        double result = 0;

        if(edinica1.equals("m")){
            result = numb * 1;
            if (edinica2.equals("m")){
                result = result * 1;
            }else if(edinica2.equals("cm")){
                result = result * 100;
            }else if (edinica2.equals("mm")){
                result = result * 1000;
            }
        }
        if (edinica1.equals("cm")){
            result = numb * 1;
            if (edinica2.equals("m")){
                result = result * 0.01;
            }else if (edinica2.equals("cm")){
                result = result * 1;
            }else if (edinica2.equals("mm")){
                result = result * 10;
            }
        }
        if (edinica1.equals("mm")){
            result = numb * 1;
            if (edinica2.equals("cm")){
                result = result * 0.1;
            }else if (edinica2.equals("m")){
                result = result * 0.001;
            }else if (edinica2.equals("mm")){
                result = result * 1;
            }
        }
        System.out.printf("%.3f",result);
    }
}
