package com.bootcamp;

public class Ejercicio3 {
    public static void main(String[] args) {
        String[] nombres = {"Ella","durmio","al","calor","de","las","masas"};
        StringBuilder nombresConcat = new StringBuilder();
        for(String nombre : nombres){
            nombresConcat.append(nombre).append(" ");
        }
        System.out.println(nombresConcat);
    }
}
