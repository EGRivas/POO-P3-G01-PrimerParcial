package com.mycompany.proyecto;
import java.util.ArrayList;

public class Juego{
//Atributos:
    static Termino termino;
    Arraylist<Paralelo> paralelos;

//Constructor:
    public Juego(Termino t){
        termino = t;
    }
//Método:
    public static void setTermino(String anio, String periodo){
        termino.setAnio(anio);
        termino.setPeriodo(periodo);
    }

    public Estudiante ayudante(String matriculaEstudiante){
        Arraylist<Materia> materias = termino.getMaterias();
        ArrayList<Estudiante> estudiantes;
        for (Materia m: materias){
            paralelos.add(m.getParalelos());
        }
        for(Paralelo p: paralelos){
            estudiantes.add(p.getEstudiantes());
        }

        for(Estudiante e: estudiantes){
            if(e.getMatricula().equals(matriculaEstudiante)){
                return e;
            }
        }
        return null;
    }

    public Estudiante participante(String matriculaEstudiante){
        Arraylist<Materia> materias = termino.getMaterias();
        ArrayList<Estudiante> estudiantes;
        for (Materia m: materias){
            paralelos.add(m.getParalelos());
        }
        for(Paralelo p: paralelos){
            estudiantes.add(p.getEstudiantes());
        }

        for(Estudiante e: estudiantes){
            if(e.getMatricula().equals(matriculaEstudiante)){
                return e;
            }
        }
        return null;
    }
}