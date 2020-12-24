package GenericArrayCreator;

import java.lang.reflect.Array;

public class ArrayCreator {

    @SuppressWarnings("unchecked")
    public static <T> T[] create(int length, T item){
        T[] array = (T[])Array.newInstance(item.getClass(), length);

        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return (T[])array;
    }

    @SuppressWarnings("unchecked")
    public static <T> T[] create(Class<T> clazz, int length, T item){
        T[] array  = (T[])Array.newInstance(clazz, length);

        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return (T[])array;
    }
}
