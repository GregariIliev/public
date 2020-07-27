import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name = scan.nextLine();
        boolean fruit = name.equals("banana") || name.equals("kiwi")
                || name.equals("apple") || name.equals("chery")
                || name.equals("lemon") || name.equals("grapes");
        boolean vegetable = name.equals("tomato") || name.equals("cucumber")
                || name.equals("pepper") || name.equals("carrot");
        if (fruit){
            System.out.println("fruit");
        }else if (vegetable){
            System.out.println("vegetable");
        }else System.out.println("unknown");

    }
}
