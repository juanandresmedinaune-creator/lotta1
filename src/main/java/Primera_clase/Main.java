package Primera_clase;

public class Main {

    public static void main(String[] args) {

        Empleado emp1 = new Empleado(
                "Juan",
                "Masculino",
                25,
                20000,
                40
        );

        Estudiante est1 = new Estudiante(
                "Maria",
                "Femenino",
                20,
                "Ingeniería de Sistemas",
                5
        );

        System.out.println(emp1);
        System.out.println("---------------------");
        System.out.println(est1);
    }
}
