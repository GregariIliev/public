package wildFarm.animal;

public abstract class Mammal extends Animal {
    private String livingRegion;

    protected Mammal(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight);
        this.livingRegion = livingRegion;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(super.toString());
        int index = stringBuilder.lastIndexOf(", ");
        stringBuilder.insert(index, ", " + this.livingRegion);
        return stringBuilder.toString();
    }
}
