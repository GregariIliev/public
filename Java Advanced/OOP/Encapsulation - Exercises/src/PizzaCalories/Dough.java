public class Dough {
    private String flourType;
    private String bakingTechnique;
    private double weight;

    public Dough(String flourType, String bakingTechnique, double weight) throws IllegalAccessException {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }

    private void setFlourType(String flourType) throws IllegalAccessException {
        if (!Validation.validationFlourType(flourType)){
            throw new IllegalAccessException("Invalid type of dough.");
        }
        this.flourType = flourType;
    }

    private void setBakingTechnique(String bakingTechnique) throws IllegalAccessException {
        if (!Validation.validationBakingTechnique(bakingTechnique)){
            throw new IllegalAccessException("Invalid type of dough.");
        }
        this.bakingTechnique = bakingTechnique;
    }

    private void setWeight(double weight) throws IllegalAccessException {
        if (!Validation.validationDoughWeightRange(weight)){
            throw new IllegalAccessException("Dough weight should be in the range [1..200].");
        }
        this.weight = weight;
    }

    public double calculateCalories(){

        double flourCalories = DoughEnums.valueOf(flourType.toUpperCase()).modifier;
        double techniqueCalories = DoughEnums.valueOf(bakingTechnique.toUpperCase()).modifier;

        return weight * 2 * flourCalories * techniqueCalories;
    }
}
