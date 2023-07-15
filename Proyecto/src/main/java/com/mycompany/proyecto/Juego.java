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
        for (Materia m: materias){
            for(Paralelo p0: m.getParalelos()){
                for(Estudiante e: p0.getEstudiantes()) {
                    if (e.getMatricula().equals(matriculaEstudiante)) {
                        return e;
                    }

                }
            }

        }
        return null;
    }


    public Estudiante participante(String matriculaEstudiante){
        Arraylist<Materia> materias = termino.getMaterias();
        for (Materia m: materias){
            for(Paralelo p0: m.getParalelos()){
                for(Estudiante e: p0.getEstudiantes()) {
                    if (e.getMatricula().equals(matriculaEstudiante)) {
                        return e;
                    }

                }
            }

        }
        return null;
    }


}