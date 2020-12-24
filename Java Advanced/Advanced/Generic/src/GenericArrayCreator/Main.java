package GenericArrayCreator;

public class Main {
    public static void main(String[] args) {


        Integer[] integers = ArrayCreator.create(12, 0);
        String[] strings = ArrayCreator.create(String.class, 12, "2");
    }
}
