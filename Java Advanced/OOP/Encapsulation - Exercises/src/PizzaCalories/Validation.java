public class Validation {

    public static boolean validationName(String name) {
        boolean isValid = true;
        if (name == null || name.trim().isEmpty() || name.length() > 15 || name.length() < 1) {
            isValid = false;
        }
        return isValid;
    }

    public static boolean validationFlourType(String flourType) {
        boolean isValid = true;
        if (!flourType.equals("White") && !flourType.equals("Wholegrain")) {
            isValid = false;
        }
        return isValid;
    }

    public static boolean validationBakingTechnique(String bakingTechnique) {
        boolean isValid = true;
        if (!bakingTechnique.equals("Crispy") && !bakingTechnique.equals("Chewy") && !bakingTechnique.equals("Homemade")) {
            isValid = false;
        }
        return isValid;
    }

    public static boolean validationDoughWeightRange(double weight) {
        boolean inRange = true;
        if (weight < 1 || weight > 200) {
            inRange = false;
        }
        return inRange;
    }

    public static boolean validationToppingType(String type) {
        boolean isValid = true;

        if (!type.equals("Meat") && !type.equals("Veggies") && !type.equals("Cheese") && !type.equals("Sauce")) {
            isValid = false;
        }
        return isValid;
    }

    public static boolean validationWeightInBounds(double weight) {
        boolean inBounds = true;
        if (weight < 1 || weight > 50) {
            inBounds = false;
        }
        return inBounds;
    }

    public static boolean validationToppingRange(int numberOfTopping) {
        boolean inRange = true;
        if (numberOfTopping < 0 || numberOfTopping > 10) {
            inRange = false;
        }
        return inRange;
    }
}