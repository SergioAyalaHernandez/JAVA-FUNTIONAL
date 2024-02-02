package org.sergioAyala.PredicateFunctions;

import java.util.function.Function;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        //Function recibe un tipo y devuelve también un tipo

        Function<Integer, Integer> squere = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x * x;
            }
        };

        System.out.println(squere.apply(5));
        System.out.println(squere.apply(25));

        Function<Integer, Boolean> isOdd = x -> x % 2 == 1;


        //Predicate, evalua y devuelve un boolean

        Predicate<Integer> isEven = x -> x % 2 == 0;

        System.out.println(isEven.test(10));
        System.out.println(isEven.test(3));

        Predicate<Student> isApproved = student -> student.getCalificacion() > 6.0;

        Student sergio = new Student(5.9);

        System.out.println(isApproved.test(sergio));

    }
    static class Student{
        private double calificacion;

        public Student(double calificacion) {
            this.calificacion = calificacion;
        }

        public double getCalificacion() {
            return calificacion;
        }
    }
}