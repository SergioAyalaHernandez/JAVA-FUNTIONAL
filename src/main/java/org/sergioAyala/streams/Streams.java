package org.sergioAyala.streams;

import org.sergioAyala.referenceOperator.NombresUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Streams {
    public static void main(String[] args) {
        List<String> courseList = NombresUtils.getList("JAVA!", "FrOntend", "Backend", "FullStack");
        for (String course : courseList) {
            String newCourseList = course.toLowerCase().replace("!", "!!");
            System.out.println("Sergio courses : " + newCourseList);
        }

        Stream<String> coursesStream = Stream.of("JAVA!", "FrOntend", "Backend", "FullStack");

        //convertir de uno a otro
        //map, de aceurdo a una función, devuelve el valor nuevo del resultante de esa función
        //Stream<Integer> courseLength = coursesStream.map(course -> course.length());

        //max, toma una función que determina dos valores y devuelve cuál es el mayor
        //Optional<Integer> longest = courseLength.max((x, y) -> y - x);

        Stream<String> emphasisCourses = coursesStream.map(course -> course + "!!!");
        Stream<String> justJavaCourses = emphasisCourses.filter(course -> course.contains("JAVA"));

        justJavaCourses.forEach(System.out::println);

        Stream<String> couseStremCopy = courseList.stream();
        addOperator(
                couseStremCopy.map(course -> course + "!!++!!")
                        .filter(course -> course.contains("JAVA"))
        ).forEach(System.out::println);


    }
    static <T> Stream <T> addOperator(Stream<T> stream){
        //similar a map, solo que recibe el dato y devuelve el dato
        //nos permite ver el dato, sin alterarlo
        return stream.peek(data -> System.out.println("dato: "+ data));
    }
}
