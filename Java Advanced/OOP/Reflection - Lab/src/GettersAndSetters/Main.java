import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Main {
    public static class MethodComparator implements Comparator<Method>{
        @Override
        public int compare(Method o1, Method o2) {
            return o1.getName().compareTo(o2.getName());
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class<Reflection> reflectionClass = Reflection.class;

        Set<Method> getters = new TreeSet<>(new MethodComparator());
        Set<Method> setters = new TreeSet<>(new MethodComparator());

        Method[] methods = reflectionClass.getDeclaredMethods();

        for (Method method : methods) {
            if (method.getName().startsWith("get")){
                getters.add(method);

            }else if (method.getName().startsWith("set")){
                setters.add(method);
            }
        }

        System.out.println(
                getters.stream()
                .map(method -> String.format("%s will return class %s",method.getName(), method.getReturnType().getName()))
                .collect(Collectors.joining(System.lineSeparator()))
        );
        System.out.println(
                setters.stream()
                        .map(method -> String.format("%s and will set field of class %s",method.getName(), method.getParameterTypes()[0].getName() ))
                        .collect(Collectors.joining(System.lineSeparator()))
        );
    }
}
