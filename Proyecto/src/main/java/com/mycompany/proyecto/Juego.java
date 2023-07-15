package com.mycompany.proyecto;
import java.util.ArrayList;

public class Juego{
//Atributos:
    static Termino termino;

//Constructor:
    public Juego(Termino t){
        termino = t;
    }
//Método:
    public static void setTermino(String anio, String periodo){
        termino.setAnio(anio);
        termino.setPeriodo(periodo);
    }
}