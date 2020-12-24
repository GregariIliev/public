import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.text.DateFormat;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static class MethodComparator implements Comparator<Method> {
        @Override
        public int compare(Method o1, Method o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Reflection> reflectionClass = Reflection.class;
        // Set<Method> setters = new TreeSet<>(new MethodComparator());


        Set<Field> fields = new TreeSet<>(Comparator.comparing(Field::getModifiers));
        Field[] declaredFields = reflectionClass.getDeclaredFields();
        fields.addAll(Arrays.asList(declaredFields));

        Set<Method> methods = new TreeSet<>(new MethodComparator());
        Method[] methodsArr = reflectionClass.getDeclaredMethods();
        methods.addAll(Arrays.asList(methodsArr));


        for (Field declaredField : fields) {
            if (!Modifier.isPrivate(declaredField.getModifiers())) {
                System.out.printf("%s must be private!%n", declaredField.getName());
            }
        }

        for (Method method : methods) {
            if (!Modifier.isPublic(method.getModifiers()) && method.getName().startsWith("get")) {
                System.out.printf("%s have to be public!%n", method.getName());
            }
        }
        for (Method method : methods) {
            if (!Modifier.isPrivate(method.getModifiers()) && method.getName().startsWith("set")) {
                System.out.printf("%s have to be private!%n", method.getName());
            }
        }
    }
}
