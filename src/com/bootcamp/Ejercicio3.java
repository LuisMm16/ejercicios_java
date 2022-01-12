package com.bootcamp;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] letraCancion = {"Ella","durmio","al","calor","de","las","masas"};
        StringBuilder letraCancionConcat = new StringBuilder();
        for(String letra : letraCancion){
            letraCancionConcat.append(letra).append(" ");
        }
        System.out.println(letraCancionConcat);
    }
}
