package primer_ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Estudiante {


    private String codigo;
    private String nombre;
    private String correo;
    private String carrera;

    List<Cursos> cursos = new ArrayList<>();

    public Estudiante() {;
    }

    public Estudiante(String codigo, String nombre, String correo, String carrera, List<Cursos> cursos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.correo = correo;
        this.carrera = carrera;
        this.cursos = cursos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public List<Cursos> getCursos() {
        return cursos;
    }

    public void setCursos(List<Cursos> cursos) {
        this.cursos = cursos;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", carrera='" + carrera + '\'' +
                ", cursos=" + cursos +
                '}';
    }

    public void inscribir(Cursos cursos) {
        this.cursos.add(cursos);
    }

}
