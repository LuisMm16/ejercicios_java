package sesiones7_9;

import java.util.ArrayList;

public class Estudiante {
    Integer codigoEstudiante;
    String nombres;
    String apellidos;
    String carrera;
    String ciclo;
    byte numeroCursos;
    ArrayList<String> cursosActuales = new ArrayList<>();

    public Estudiante() {
    }

    public Estudiante(Integer codigoEstudiante){
        this.codigoEstudiante = codigoEstudiante;
    }

    public Estudiante(String nombres, String apellidos){
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public Estudiante(String nombres, String apellidos, String carrera, String ciclo) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.carrera = carrera;
        this.ciclo = ciclo;
    }

    public void InsertarCursosActuales(String nombreCurso){
        this.cursosActuales.add(nombreCurso);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", carrera='" + carrera + '\'' +
                ", ciclo='" + ciclo + '\'' +
                ", numeroCursos=" + numeroCursos +
                ", cursosActuales=" + cursosActuales +
                '}' + "\n";
    }
}
