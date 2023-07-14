/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author Administrador
 */
public class Termino {
    //variables de instancia
    private String anio;
    private String periodo;
    private ArrayList<Materia> materias;

    //constructor
    public Termino(String anio, String periodo){
        this.anio = anio;
        this.periodo = periodo;
    }
    //getters
    public String getAnio(){
        return anio;
    }
    public String getPeriodo(){
        return periodo;
    }
    //setters
    public void setAnio(String anio){
        this.anio = anio;
    }
    public void setPeriodo(String periodo){
        this.periodo = periodo;
    }
}
