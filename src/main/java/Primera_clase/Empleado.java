package Primera_clase;

public class Empleado extends Persona {

    private double salarioBase;
    private int horasTrabajadas;

    public Empleado(String nombre, String genero, int edad,
                    double salarioBase, int horasTrabajadas) {

        super(nombre, genero, edad);
        this.salarioBase = salarioBase;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * horasTrabajadas;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + getNombre() + '\'' +
                ", genero='" + getGenero() + '\'' +
                ", edad=" + getEdad() +
                ", salarioTotal=" + calcularSalario() +
                '}';
    }
}
