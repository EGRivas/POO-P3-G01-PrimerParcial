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
    public Preguntas(String e){
        enunciado = e; //para verificar que una pregunta sea igual a otra en el metodo de remover preguntas
    }

//Métodos:
    public boolean indicarRespuestaCorrecta(String r){
        return r.equals(respuestaCorrecta);
    }
    public TipoComodin getComodin(){
        return comodin;
    }
    public String getEnunciado(){
        return enunciado;
    }
    public int getNivel(){
        return nivel;
    }
    public ArrayList<String> listaRespuestas(){
        ArrayList<String> lresp = listaRespuestas;
        lresp.add(respuestaCorrecta);
        return lresp;
    }
//Metodo toString
    public String toString(){
        return "enunciado: "+enunciado+"\nnivel: "+nivel;
    }
    
    //Metodo equals
    public boolean equals(Object o){
        if (o == this) return true;
        if (o != null && getClass() == o.getClass()){
            Preguntas p = (Preguntas) o;
            return enunciado.equals(p.getEnunciado());
        } else {
            return false;
        }
    }
}
