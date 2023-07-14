package com.mycompany.proyecto;
import java.util.ArrayList;

public class Materia{
    private String codigo;
    private String nombre;
    private int cantidadNiveles;
    private ArrayList<Paralelo> paralelos;
    private ArrayList<Pregunta> preguntas;

    public Materia(String codigo, String nombre, int cantidadNiveles, ArrayList<Paralelo> paralelos){
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidadNiveles = cantidadNiveles;
        this.paralelos = paralelos;
    }

    public void editarMateria(String codigo, String nombre){
        this.codigo = codigo;
        this.nombre = nombre;
    }
    public void editarMateria(int cantidadNiveles){
        this.cantidadNiveles = cantidadNiveles;
    }

    public void editarMateria(ArrayList<Paralelo> paralelos){
        this.paralelos = paralelos;
    }
    public void agregarPregunta(Pregunta pregunta){
        preguntas.add(pregunta);
    }
    public void eliminarPregunta(Pregunta pregunta){
        int x preguntas.indexof(pregunta);
        preguntas.remove(x);
    }



}
