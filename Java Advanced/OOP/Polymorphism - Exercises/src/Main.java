import wildFarm.animal.*;
import wildFarm.food.Food;
import wildFarm.food.Meat;
import wildFarm.food.Vegetable;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        List<Animal> animalList = new ArrayList<>();

        while (true) {
            String inputAnimal = scan.nextLine();
            if (inputAnimal.equals("End")) {
                break;
            }

            String[] animalTokens = inputAnimal.split("\\s+");
            String[] foodTokens = scan.nextLine().split("\\s+");

            Animal animal = createAnimal(animalTokens);;
            Food food = createdFood(foodTokens);

            animalList.add(animal);
            animal.makeSound();
            try {
                animal.eat(food);
            }catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
        for (Animal animal : animalList) {
            System.out.println(animal.toString());
        }
    }

    private static Food createdFood(String[] foodTokens) {
        Food food = null;
        String foodType = foodTokens[0];
        if (foodType.equals("Vegetable")) {
            food = new Vegetable(Integer.parseInt(foodTokens[1]));
        } else if (foodType.equals("Meat")) {
            food = new Meat(Integer.parseInt(foodTokens[1]));
        }
        return food;
    }

    private static Animal createAnimal(String[] animalTokens) {
        Animal animal = null;
        String animalType = animalTokens[0];
        if (animalType.equals("Cat")){
            animal = new Cat(animalTokens[0], animalTokens[1], Double.parseDouble(animalTokens[2]), animalTokens[3], animalTokens[4]);
        }else if (animalType.equals("Tiger")){
            animal = new Tiger(animalTokens[0], animalTokens[1], Double.parseDouble(animalTokens[2]), animalTokens[3]);
        }else if (animalType.equals("Zebra")){
            animal = new Zebra(animalTokens[0], animalTokens[1], Double.parseDouble(animalTokens[2]), animalTokens[3]);
        }else if (animalType.equals("Mouse")){
            animal = new Mouse(animalTokens[0], animalTokens[1], Double.parseDouble(animalTokens[2]), animalTokens[3]);
        }
        return animal;
    }
}
