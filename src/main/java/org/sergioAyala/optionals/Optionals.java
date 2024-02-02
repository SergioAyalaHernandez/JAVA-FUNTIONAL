package org.sergioAyala.optionals;

import java.util.*;

public class Optionals {

    public static void main(String[] args) {
        List<String> names = getNames();
        if (names != null){
            //Operar con nombres.

        }

        Optional<List<String>> optionalNames = getOptionalNames();
        if (optionalNames.isPresent()){

        }

        Optional<String> valuablePlayes = optionalValuablePlayer();

        String valuableName = valuablePlayes.orElseGet(() -> "No Player");
    }

    static List<String> getNames(){
        List<String> list = new LinkedList<>();
        return Collections.emptyList();

    }
    static String mostValuablePlayer(){
        //return "";
        return null;
    }

    static int mostExpensive(){
        return 0;
    }

    static Optional<List<String>> getOptionalNames(){
        List<String> namesList = new LinkedList<>();
        return Optional.of(namesList);
    }

    static Optional<String> optionalValuablePlayer(){

        //return Optional.ofNullable();
        try{
            //acceder a sb
            return Optional.of("Sergio");
        }catch (Exception e){
            e.printStackTrace();
        }
        return Optional.empty();
    }

}
