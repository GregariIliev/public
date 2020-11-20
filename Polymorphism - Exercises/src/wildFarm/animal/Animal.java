package wildFarm.animal;

import wildFarm.food.Food;

import java.text.DecimalFormat;

public abstract class Animal {
    private String animalType;
    private String animalName;
    private Double animalWeight;
    private Integer foodEaten;

    protected Animal(String animalType, String animalName, Double animalWeight) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeight = animalWeight;
        this.foodEaten = 0;
    }

    public abstract void makeSound();

    public void eat(Food food) {
        this.foodEaten += food.getQuantity();
    }

    public String getAnimalType() {
        return animalType;
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("##.##");

        return String.format("%s[%s, %s, %d]"
                , this.animalType, this.animalName, decimalFormat.format(this.animalWeight), this.foodEaten);
    }
}
