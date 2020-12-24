import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private String name;
    private Dough dough;
    private List<Topping> toppings;

    public Pizza(String name, int numberOfToppings) throws IllegalAccessException {
        setName(name);
        setToppings(numberOfToppings);
    }

    private void setToppings(int numberOfToppings) throws IllegalAccessException {
        if (!Validation.validationToppingRange(numberOfToppings)){
            throw new IllegalAccessException("Number of toppings should be in range [0..10].");
        }
        this.toppings = new ArrayList<>(numberOfToppings);
    }

    private void setName(String name) throws IllegalAccessException {
        if (!Validation.validationName(name)){
            throw new IllegalAccessException("Pizza name should be between 1 and 15 symbols.");
        }
        this.name = name;
    }

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public String getName() {
        return this.name;
    }

    public void addTopping(Topping topping){
        if (this.toppings.size() < 10)
        this.toppings.add(topping);
    }

    public double getOverallCalories(){
        return this.dough.calculateCalories() + this.toppings.stream().mapToDouble(Topping::calculateCalories).sum();
    }
}
