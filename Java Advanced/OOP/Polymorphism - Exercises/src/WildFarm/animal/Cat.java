package wildFarm.animal;

public class Cat extends Felime {
    private String catBreed;
    public Cat(String animalType, String animalName, Double animalWeight, String livingRegion, String catBreed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.catBreed = catBreed;
    }


    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        int index = stringBuilder.indexOf(", ");
        stringBuilder.insert(index, ", " + this.catBreed);
        return stringBuilder.toString();
    }
}
