package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //crear persona desde el constructor vacio

        persona p1 = new persona();

        p1.setNombre("juan");
        p1.setEdad(26);
        p1.setGenero("Masculino");

        //crear persona usando contructor con patrametros

        persona p2 = new persona("Julian", "femenino", 23);

        //SYSTEM OUT

        System.out.println(p1.toString());
        System.out.println(p2.toString());



    }
}