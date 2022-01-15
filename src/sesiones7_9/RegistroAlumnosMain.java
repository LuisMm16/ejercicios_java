package sesiones7_9;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;

public class RegistroAlumnosMain {

    public static void main(String[] args) {

        //***************************** 9. Programa *****************************
        //Se crea un registro de estudiantes con los cursos del ciclo

        HashMap<Integer,Estudiante> estudiantes = new HashMap<>();
        String tempCodigo;
        Integer tempCodigoInt;

        try {
            InputStream codigoEstudiantes = new FileInputStream("src/sesiones7_9/CodigoEstudiantes.txt");
            Scanner codigoEstudianteScan = new Scanner(codigoEstudiantes);

            //Crear el registro en base a los codigos de estudiante
            while(codigoEstudianteScan.hasNextLine()){

                tempCodigo = codigoEstudianteScan.nextLine();
                tempCodigoInt = Integer.valueOf(tempCodigo);
                estudiantes.put(tempCodigoInt, new Estudiante(tempCodigoInt));

                //Insertar los datos del estudiante
                System.out.println("Estudiante con codigo " + tempCodigo);
                System.out.print("Apellido: ");
                estudiantes.get(tempCodigoInt).apellidos = insertarDatos();
                System.out.print("Nombre: ");
                estudiantes.get(tempCodigoInt).nombres = insertarDatos();
                System.out.print("Carrera: ");
                estudiantes.get(tempCodigoInt).carrera = insertarDatos();
                System.out.print("Ciclo: ");
                estudiantes.get(tempCodigoInt).ciclo = insertarDatos();

                //Insertar los cursos que tiene
                System.out.print("Inserte el numero de cursos que tiene: ");
                estudiantes.get(tempCodigoInt).numeroCursos = Byte.parseByte(insertarDatos());

                //Guardar nombre de los cursos uno a uno
                for(byte i = 1; i<=estudiantes.get(tempCodigoInt).numeroCursos; i++){
                    System.out.print("Nombre del curso " + i + ": ");
                    estudiantes.get(tempCodigoInt).InsertarCursosActuales(insertarDatos());
                }

                System.out.println();

            }
            codigoEstudianteScan.close();
            codigoEstudiantes.close();

            PrintStream outFile = new PrintStream("src/sesiones7_9/InformacionEstudiantes.txt");
            outFile.println(estudiantes);

            System.out.println("Archivo generado!");

        }catch (FileNotFoundException e) {
            System.out.println("No se encontro el fichero");
        } catch (IOException e) {
            System.out.println("Error detectado: " + e.getMessage());
        }
    }

    public static String insertarDatos() throws IOException {
        String dato;
        InputStream entradaDatosConsola = System.in;
        Scanner entradaDatosScan = new Scanner(entradaDatosConsola);
        dato = entradaDatosScan.next();
        return dato;
    }
}
