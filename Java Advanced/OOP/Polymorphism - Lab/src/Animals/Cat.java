public class Cat extends Animal {
    private String name;
    private String food;

    public Cat(String name, String food){
        this.name = name;
        this.food = food;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    @Override
    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s%n" +
                "MEEOW", this.name, this.food);
    }
}
