package com.mycompany.proyecto;
import java.util.ArrayList;

public class Juego{
//Atributos:
    private static Termino termino;
    private ArrayList<Paralelo> paralelos;


//Constructor:
    public Juego(){

    }
//Método:
    public static void setTermino(String anio, String periodo){
        termino.setAnio(anio);
        termino.setPeriodo(periodo);
    }

    public Estudiante ayudante(String matriculaEstudiante){
        ArrayList<Materia> materias = termino.getMaterias();
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
        ArrayList<Materia> materias = termino.getMaterias();
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
    public void empezarJuego(){
        // * empieza el juego *

    }


}