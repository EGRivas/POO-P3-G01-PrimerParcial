package com.mycompany.proyecto;
import java.util.ArrayList;

public class Pregunta{

//Atributos:
    private String enunciado;
    private int nivel;
    private ArrayList<String> listaRespuestas;
    private String respuestaCorrecta;
    private TipoComodin comodin;

//Constructor:
    public Pregunta(String e,int n,String rCorrecta, ArrayList<String> resp){
        enunciado = e;
        nivel = n;
        listaRespuestas = resp;
        respuestaCorrecta = rCorrecta;
    }

//Métodos:
    public String IndicarRespuestaCorrecta(){
        return respuestaCorrecta;
    }
}