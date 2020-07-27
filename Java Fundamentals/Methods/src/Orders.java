import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String product = scan.nextLine();
        int quantity = Integer.parseInt(scan.nextLine());

        productsTotalPrice(product , quantity);
    }

    private static void productsTotalPrice(String product, int quantity) {
        double result = 0.0;
        if (product.equals("coffee")){
            result = quantity * 1.50;
        }else if (product.equals("water")){
            result = quantity * 1.00;
        }else if (product.equals("coke")){
            result = quantity * 1.40;
        }else if (product.equals("snacks")){
            result = quantity * 2.00;
        }
        System.out.printf("%.2f",result);
    }
}
