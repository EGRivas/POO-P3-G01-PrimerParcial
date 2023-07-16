package com.mycompany.proyecto;
import java.util.ArrayList;

public class Preguntas{

//Atributos:
    private String enunciado;
    private int nivel;
    private ArrayList<String> listaRespuestas;
    private String respuestaCorrecta;
    private TipoComodin comodin;

//Constructor:
    public Preguntas(String e, int n, ArrayList<String> lRespuestas, String rCorrecta){
        enunciado = e;
        nivel = n;
        listaRespuestas = lRespuestas;
        respuestaCorrecta = rCorrecta;
    }

//Métodos:
    public String IndicarRespuestaCorrecta(){
        return respuestaCorrecta;
    }
    public TipoComodin getComodin(){
        return comodin;
    }
//Metodo toString
    public String toString(){
        return "enunciado: "+enunciado+"\nnivel: "+nivel;
    }
}
