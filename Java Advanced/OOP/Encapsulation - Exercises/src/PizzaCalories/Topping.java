public class Topping {
    private String toppingType;
    private double weight;


    public Topping(String toppingType, double weight) throws IllegalAccessException {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) throws IllegalAccessException {
        if (!Validation.validationToppingType(toppingType)){
            throw new IllegalAccessException("Cannot place " + toppingType + " on top of your pizza.");
        }
        this.toppingType = toppingType;
    }

    private void setWeight(double weight) throws IllegalAccessException {
        if (!Validation.validationWeightInBounds(weight)){
            throw new IllegalAccessException(this.toppingType + " weight should be in the range [1..50].");
        }
        this.weight = weight;
    }

    public double calculateCalories(){
        return weight * 2 * ToppingEnums.valueOf(toppingType.toUpperCase()).getModifiers();
    }
}
