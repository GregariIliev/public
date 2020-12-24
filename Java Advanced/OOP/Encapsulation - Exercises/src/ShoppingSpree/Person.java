import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) throws IllegalAccessException {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) throws IllegalAccessException {
        if (!Validation.validationName(name)){
            throw new IllegalAccessException("Name cannot be empty");
        }
        this.name = name;
    }

    private void setMoney(double money) throws IllegalAccessException {
        if (!Validation.validationMonetaryCurrency(money)){
            throw new IllegalAccessException("Money cannot be negative");
        }
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void buyProduct(Product product) throws IllegalAccessException {
        if (!Validation.sufficientMoneyToBuy(product, this.money)){
            throw new IllegalAccessException(this.name + " can't afford " + product.getName());
        }else {
            this.products.add(product);
            this.money -= product.getCost();
        }
    }

    public List<Product> getProducts() {
        return products;
    }
}
