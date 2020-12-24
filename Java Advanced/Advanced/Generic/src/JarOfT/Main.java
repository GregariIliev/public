package JarOfT;

public class Main {
    public static void main(String[] args) {

        Jar<Integer> jar = new Jar<>();

        jar.add(123);
        jar.add(123);
        jar.add(22);

        jar.remove();
    }
}