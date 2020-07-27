import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int gradus = Integer.parseInt(scan.nextLine());
        String time = scan.nextLine();

        String Outfit = "";
        String Shoes = "";
        if (time.equals("Morning")){
            if (10 <= gradus && gradus <= 18){
                Outfit = "Sweatshirt";
                Shoes = "Sneakers";
            }else if (18 < gradus && gradus <= 24){
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }else if (gradus >= 25){
                Outfit = "T-Shirt";
                Shoes = "Sandals";
            }
        }else if (time.equals("Afternoon")){
            if (10 <= gradus && gradus <= 18){
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }else if (18 < gradus && gradus <= 24){
                Outfit = "T-Shirt";
                Shoes = "Sandals";
            }else if (gradus >= 25){
                Outfit = "Swim Suit";
                Shoes = "Barefoot";
            }
        }else if (time.equals("Evening")){
            if (10 <= gradus && gradus <= 18){
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }else if (18 < gradus && gradus <= 24){
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }else if (gradus >= 25){
                Outfit = "Shirt";
                Shoes = "Moccasins";
            }
        }
        System.out.printf("It's %d degrees, get your %s and %s.",gradus , Outfit ,Shoes);
    }
}
