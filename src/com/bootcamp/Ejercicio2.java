package com.bootcamp;

public class Ejercicio2 {
    public static void main(String[] args) {

        double precio = 4.8;
        double precioModificado = precioConIVA(precio);
        System.out.println("El precio con IVA es: " + precioModificado);
    }

    static double precioConIVA(double precio){
        return 121.0/100*precio;
    }
}
