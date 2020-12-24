public class Validation {

    public static boolean validationName(String name){
        boolean isValid = true;
        if (name == null || name.trim().isEmpty()){
            isValid = false;
        }
        return isValid;
    }

    public static boolean validationMonetaryCurrency(double value){
        boolean isValid = true;
        if (value < 0){
            isValid = false;
        }
        return isValid;
    }

    public static boolean sufficientMoneyToBuy(Product product, double money){
        boolean isSufficient = true;
        if (product.getCost() > money){
            isSufficient = false;
        }
        return isSufficient;
    }
}
