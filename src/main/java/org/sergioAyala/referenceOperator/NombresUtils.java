package org.sergioAyala.referenceOperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class NombresUtils {

    public static void main(String[] args) {
        List<String> profesores = getList("nicolas", "Juan", "Zulema");

        Consumer<String> printer = text -> System.out.println(text);
        profesores.forEach(printer);
        System.out.println("-________-________----_________-________");
        profesores.forEach(System.out::println);
    }
    public static <T> List<T> getList(T... elements){
        return Arrays.asList(elements);
    }
}
