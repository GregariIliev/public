public class Person {
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public boolean moreThan30(){
        boolean isTrue = false;
        if (this.age > 30){
            isTrue = true;
        }
        return isTrue;
    }
    public void print(){
        System.out.printf("%s - %d%n",name , age);
    }
}
