public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) throws IllegalAccessException {
        this.setName(name);
        this.setAge(age);
    }

    private void setName(String name) throws IllegalAccessException {
        if (name.length() >= 1 && !name.equals(" ")){
            this.name = name;
        }else {
            throw new IllegalAccessException("Name cannot be empty.");
        }
    }

    private void setAge(int age) throws IllegalAccessException {
        if (age >= 0 && age <= 15){
            this.age = age;
        }else {
            throw new IllegalAccessException("Age should be between 0 and 15.");
        }
    }

    private String getName() {
        return this.name;
    }

    private int getAge() {
        return this.age;
    }

    public double productPerDay(){
        return calculateProductPerDay();
    }

    private double calculateProductPerDay(){
        if (this.age < 6){
            return 2.00;

        }else if (this.age < 12){
            return 1.00;

        }
        return 0.75;
    }

    @Override
    public String toString(){
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",this.name, this.age, calculateProductPerDay());
    }
}
