package org.sergioAyala.Composition;

import java.util.function.Function;

public class MathOperations2 {
    public static void main(String[] args) {
        Function<Integer, Integer> multiplyBy3 = x -> {
            System.out.println("multiplicando x: " + x + " por 3");
            return x * 3;
        };


        Function<Integer, Integer> add1MultriplyBy3 =
                //se crea una función intermedia por medio de compose, toma una función y luego hace la que se llamo
                //primero la lamda y luego la que se llamo
                multiplyBy3.compose(y -> {
                    System.out.println("le agregare 1 a " + y);
                    return y + 1;
                });

        Function<Integer,Integer> andSquare =
                //andThen, primero llama la función que está invocando, esa hará lo que tenga que hacer y luego de realizarlo
                //hará lo que continué dentro del llamado de andSquare
                add1MultriplyBy3.andThen(x ->{
                    System.out.println("estoy elevando " + x + " al cuadrado ");
                    return  x*x;
                });

        System.out.println(andSquare.apply(346));
    }


}
