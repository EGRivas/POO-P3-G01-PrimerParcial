/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto;

/**
 *
 * @author Administrador
 */
public class Estudiante {
    //variables de instancia
    private String nombre;
    private String matricula;
    private String correoInst;
    //constructor
    public Estudiante(String nombre, String matricula, String correoInst){
        this.nombre = nombre;
        this.matricula = matricula;
        this.correoInst = correoInst;
    }
    //getters
    public String getNombre(){
        return nombre;
    }
    public String getMatricula(){
        return matricula;
    }
    public String getCorreoInst(){
        return correoInst;
    }
}
