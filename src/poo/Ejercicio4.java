package poo;

public class Ejercicio4 {
    public static void main(String[] args) {

        SmartDevice movil1 = new SmartPhone();
        movil1.sistemaOperativo = "iOS";
        movil1.marca = "Apple";

        SmartDevice movil2 = new SmartPhone("Android","Xiaomi",480.90,true,true,"5G");

        SmartDevice reloj1 = new SmartWatch();
        reloj1.marca = "Apple";
        reloj1.sistemaOperativo = "watchOS";

        SmartDevice reloj2 = new SmartWatch("Android", "Samsung", 180.79, true, true, "Cuero", true);

        System.out.println(movil1);
        System.out.println(movil2);
        System.out.println(reloj1);
        System.out.println(reloj2);

    }
}
