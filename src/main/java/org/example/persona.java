package org.example;

public class persona {

    // ATRIBUTOS

    private String nombre;
    private String genero;
    private int edad;

    // CONSTRUCTORES


    public persona() {
    }

    public persona(String nombre, String genero, int edad) {
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
    }

    //GETTER Y SETTER


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString() {
        return "persona{" +
                "nombre='" + nombre + '\'' +
                ", genero='" + genero + '\'' +
                ", edad=" + edad +
                '}';
    }


    public int CalcularPasos(){
        return 0;
    }

    public double calcularSalario(){
        return 0.0;
    }




}
