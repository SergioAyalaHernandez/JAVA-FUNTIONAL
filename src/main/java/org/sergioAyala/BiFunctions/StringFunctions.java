package org.sergioAyala.BiFunctions;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

public class StringFunctions {

    public static void main(String[] args) {

        //agregar un texto y lo devolverá con comillas
        System.out.println("__________________ UnaryOperator______________________");
        UnaryOperator<String> quote = text -> "\"" + text + "\"";
        UnaryOperator<String> addMark = text -> text + "!";
        System.out.println(quote.apply("Hola Estudiante"));
        System.out.println(addMark.apply("Hola Estudiante"));

        // una forma donde se puede usar Bi function
        System.out.println("_----------------BiFunction--------------------_");
        BiFunction<Integer, Integer, Integer> multiplicacion = (x, y) -> x * y;
        System.out.println(multiplicacion.apply(5, 4));

        BiFunction<String, Integer, String> leftPad =
                //
                (text, number) -> String.format("%" + number + "s", text);

        System.out.println(leftPad.apply("Java", 10));


    }

}
