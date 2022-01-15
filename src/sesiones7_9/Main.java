package sesiones7_9;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        // Imprimir el texto al reves en terminal
        String texto = "Hola mundo";
        String reverseTexto = reverseString(texto);
        System.out.println("El texto al reves es: " + reverseTexto);

        //***************************** 1. Array unidimensional *****************************

        String[] nombres = new String[]{"Lucho", "Marta", "Paco", "Ester"};
        for(String nombre : nombres){
            System.out.println(nombre);
        }

        //***************************** 2. Array bidimensional *****************************

        Integer[][] numeros2D = new Integer[3][5];
        numeros2D[0][0] = 13;
        numeros2D[1][2] = 21;
        numeros2D[2][4] = 45;

        for(int i = 0; i<numeros2D.length ; i++) {
            for (int j = 0; j < numeros2D[i].length; j++) {
                System.out.println("La posicion es [" + i + "][" + j + "] y el valor es " + numeros2D[i][j]);
            }
        }

        //***************************** 3. Vector *****************************
        Vector<String> autos = new Vector<>();
        autos.add("Lambo");
        autos.add("Honda");
        autos.add("Ferrari");
        autos.add("Toyota");
        autos.add("Mazda");
        System.out.println("El vector inicial es: " + autos);
        autos.remove(2);
        autos.remove(1);
        System.out.println("El resultado final es: " + autos);

        /*4. El problema es el costo computacional de tener que realizar la creacion de un nuevo vector
         con una nueva capacidad y copiar los elementos del vector anterior al nuevo cada vez que la capacidad
        sea superada. Por defecto irá incrementando su capacidad por el doble cada vez que se supere el
        maximo, pero al conocer que se tiene 1000 elementos es mejor utilizar el constructor especificando
        la capacidad inicial*/

        //***************************** 5. ArrayList *****************************
        ArrayList<String> frutasArrayList = new ArrayList<>(4);
        frutasArrayList.add("Manzana");
        frutasArrayList.add("Platano");
        frutasArrayList.add("Pera");
        frutasArrayList.add("Mandarina");

        LinkedList<String> frutasLinkedList = new LinkedList<>(frutasArrayList);

        for(int i = 0; i<frutasLinkedList.size(); i++){
            System.out.println("El valor en la ArrayList: " + frutasArrayList.get(i) + ". ");
            System.out.println("El valor en la LinkedList: " + frutasLinkedList.get(i) + ".");
        }

        //******************** 6. ArrayList *****************************

        ArrayList<Integer> numeros = new ArrayList<>(10);
        for(int i = 0; i<10; i++){
            numeros.add(i+1);
        }
        System.out.println("Los valores del array final son:" );

        for(int i = numeros.size() - 1; i>=0 ; i--){
            if (numeros.get(i) % 2 == 0){
                numeros.remove(i);
            }else{
                System.out.println(numeros.get(i));
            }
        }
        //System.out.println("El array final es: " + numeros);


        //***************************** 7. Division por cero *****************************

        try{
            System.out.println("El resultado es: " + DividePorCero(41,0));
        }catch(ArithmeticException e){
            System.out.println("Esto no puede hacerse");
        }finally{
            System.out.println("Demo de codigo");
        }

        //***************************** 8. InputStream y OutputStream *****************************

        String dirFileIn = "src/sesiones7_9/Crimen_letra.txt";
        String dirFileOut = "src/sesiones7_9/Copia.txt";

        try{
            InputStream fileIn = new FileInputStream(dirFileIn);
            PrintStream fileOut = new PrintStream(dirFileOut);

            CopiarFichero(fileIn,fileOut);

            fileIn.close();
            fileOut.close();

            System.out.println("Fichero copiado!");

        } catch(FileNotFoundException e){
            System.out.println("No se encontro el fichero");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }


    public static String reverseString(String texto){
        StringBuilder reverseTexto = new StringBuilder();
        for (int i = 0; i < texto.length(); i++){
            reverseTexto.append(texto.charAt(texto.length() - 1 - i));
        }
        return reverseTexto.toString();
    }

    public static double DividePorCero(int num1, int num2) throws ArithmeticException{
        double resultado;
        try{
            int temp = num1 / num2; /*solo para tener error con la division por cero.
                                    Si se considera double no se produce Exception.*/
            resultado =(double)num1/num2;
            return resultado;
        }catch(ArithmeticException e) {
            throw new ArithmeticException();
        }
    }


    public static void CopiarFichero(InputStream fileIn, PrintStream fileOut) throws IOException {
        byte[] datos = fileIn.readAllBytes();
        fileOut.write(datos);
    }

}
