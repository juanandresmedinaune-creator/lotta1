package Primera_clase;

public class Estudiante extends Persona {

    private String carrera;
    private int semestre;

    public Estudiante(String nombre, String genero, int edad,
                      String carrera, int semestre) {

        super(nombre, genero, edad);
        this.carrera = carrera;
        this.semestre = semestre;
    }

    @Override
    public int CalcularPasos() {
        return semestre * 1000;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + getNombre() + '\'' +
                ", genero='" + getGenero() + '\'' +
                ", edad=" + getEdad() +
                ", carrera='" + carrera + '\'' +
                ", semestre=" + semestre +
                ", pasos=" + CalcularPasos() +
                '}';
    }
}

