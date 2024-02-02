package org.sergioAyala.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TypeStream {
    public static void main(String[] args) {
        IntStream infiniteStream = IntStream.iterate(0,x -> x+1);
        List<Integer> numberList = infiniteStream.limit(10000000)
                .parallel() //Stream ejecuta todo dentro todos los procesadores
                .filter(x -> x % 2==0)
                .boxed() //se convierte en un String de datos
                .collect(Collectors.toList());

    }

}
