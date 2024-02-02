package org.sergioAyala.Inferencia;

import org.sergioAyala.referenceOperator.NombresUtils;

import java.util.List;
import java.util.function.Function;

public class Inferencia {
    public static void main(String[] args) {

        //Java se basa en la definición que es el dato que genera cómo el que emite de vuelta
        Function<Integer, String> funcionConvertidora =
                integer -> "al doble:" + (integer * 2);

        List<String> alumnos = NombresUtils.getList("Juan","Sergio","Luis");
        alumnos.forEach((String name) -> System.out.println(name));
        alumnos.forEach((name) -> System.out.println(name));
        alumnos.forEach(System.out::println);
    }
}
