package com.mycompany.proyecto;
import java.util.ArrayList;

public class Juego{
//Atributos:
    private Termino termino;

//Constructor:
    public Juego(Termino t){
        termino = t;
    }
//Método:
    public void setTermino(String anio, String periodo){
        Termino.setAnio(anio);
        Termino.setPeriodo(periodo);
    }
}