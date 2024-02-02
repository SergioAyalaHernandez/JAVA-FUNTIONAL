package org.sergioAyala.lambda;

import org.sergioAyala.referenceOperator.NombresUtils;

import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class Sintaxis {
    public static void main(String[] args) {
        List<String> cursos = NombresUtils.getList("java","funcional");
        cursos.forEach(curso -> System.out.println(curso));

        userZero(() -> 2);

        usarPredicato(String::isEmpty);

        usarBiFunction((x,y) -> x * y);

        usarBiFunction((x,y)->{
            System.out.println("x: "+x +", y: "+y);
            return x-y;
        });

        usarNada(()-> {
            System.out.println("Hola putos");
        });

        usarBiFunction((Integer x, Integer y) -> x* y);


    }

    static void userZero(ZeroArgumentos zeroArgumentos){

    }

    static void usarPredicato(Predicate<String> predicate){

    }

    static void usarBiFunction(BiFunction<Integer,Integer,Integer> biFunction){

    }

    static void usarNada(OperarNada operarNada){

    }

    @FunctionalInterface
    interface ZeroArgumentos{
        int get();
    }

    @FunctionalInterface
    interface OperarNada{
        void nada();
    }
}
