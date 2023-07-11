package com.mycompany.proyecto;
import java.util.ArrayList;

public class Paralelo {
    private String numero;
    private ArrayList<Estudiante> estudiantes;

    private Paralelo(String numero){
        this.numero = numero;
    }

    private Paralelo(String numero, ArrayList<Estudiante> estudiantes){
        this.numero = numero;
        this.estudiantes = estudiantes;
    }

    public String getNumero(){
        return numero;
    }

    public ArrayList<Estudiante> getEstudiantes(){
        return estudiantes;
    }

    public void setNumero(String numero){
        this.numero = numero;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes){
        this.estudiantes = estudiantes;
    }

    public void addEstudiante(Estudiante estudiante){
        estudiantes.add(estudiante);
    }
}
