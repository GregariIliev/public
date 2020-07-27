import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int width = Integer.parseInt(scan.nextLine());
        int length = Integer.parseInt(scan.nextLine());
        int hight = Integer.parseInt(scan.nextLine());

        String  cartons = scan.nextLine();
        int cartonsKubMeters = 0;
        int allKubMeters = width * length * hight;
        while (!cartons.equals("Done")){
            int cartonsNumb = Integer.parseInt(cartons);
            cartonsKubMeters = cartonsKubMeters + cartonsNumb;
            if (allKubMeters < cartonsKubMeters){
                break;
            }
            cartons = scan.nextLine();
        }
        int result = allKubMeters - cartonsKubMeters;
        if (cartons.equals("Done")){
            if (allKubMeters > cartonsKubMeters){
                System.out.printf("%d Cubic meters left.",result);
            }
        }else {
            System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(result));
        }


    }
}
