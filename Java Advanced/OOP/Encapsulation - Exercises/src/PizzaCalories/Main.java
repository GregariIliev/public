import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] pizzaInput = scan.nextLine().split("\\s+");
        String[] doughInput = scan.nextLine().split("\\s+");

        Pizza pizza = null;
        Dough dough = null;

        try {
            pizza = new Pizza(pizzaInput[1], Integer.parseInt(pizzaInput[2]));
            dough = new Dough(doughInput[1], doughInput[2], Double.parseDouble(doughInput[3]));
            pizza.setDough(dough);

        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
            return;
        }

        String inputToppings = scan.nextLine();
        while (!"END".equals(inputToppings)){
            String[] toppingData = inputToppings.split("\\s+");

            Topping topping = null;
            try {
                topping = new Topping(toppingData[1], Double.parseDouble(toppingData[2]));
                pizza.addTopping(topping);

            } catch (IllegalAccessException e) {
                System.out.println(e.getMessage());
                return;
            }

            inputToppings = scan.nextLine();
        }

        System.out.println(pizza.getName() + " - " + pizza.getOverallCalories());
    }
}
