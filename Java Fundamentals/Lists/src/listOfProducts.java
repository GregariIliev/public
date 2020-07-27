import java.util.*;

public class listOfProducts {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int n = Integer.parseInt(scan.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String text = scan.nextLine();
            products.add(text);
        }
        Collections.sort(products);

        for (int i = 0; i < products.size(); i++) {
            System.out.printf("%d.%s%n",i + 1, products.get(i));
        }
    }
}
