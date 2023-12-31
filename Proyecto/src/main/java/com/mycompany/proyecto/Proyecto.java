/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author Administrador
 */
public class Proyecto {
    public static void main(String[] args)
    {
        //hola
        ArrayList<Termino> listaTermino = new ArrayList<>();
        //Estos son los parametros a utilizar
        //Se crearon 3 preguntas para 3 niveles, del 1 al 3 en la materia POO del termino 2023 periodo 1
        //Paralelo 3 | POO | CCPG1052 | termino 2023-1
        
        //Creacion de estudiantes para la prueba
        ArrayList<Estudiante> lEstudiantesP03 = new ArrayList<>();
        Estudiante e1 = new Estudiante("AGUILAR TINOCO JEAN CARLOS","202108643","jcaguila@espol.edu.ec");
        Estudiante e2 = new Estudiante("AMORETTI SANCHEZ JUAN CARLOS","202111928","jamorett@espol.edu.ec");
        Estudiante e3 = new Estudiante("RIVAS PINCAY EMMANUEL GERARDO","202111589","egrivas@espol.edu.ec");
        Estudiante e4 = new Estudiante("BARBERAN GALLARDO MELISSA ESTEFANIA","202113056","melesbar@espol.edu.ec");
        Estudiante e5 = new Estudiante("ZARUMA GAME JOSHUA ANDRES","202208260","jazaruma@espol.edu.ec");
        lEstudiantesP03.add(e1);
        lEstudiantesP03.add(e2);
        lEstudiantesP03.add(e3);
        lEstudiantesP03.add(e4);
        lEstudiantesP03.add(e5);
        //cuando se pida una matricula del paralelo 3, se usa las escritas anteriormente
        
        //Paralelo 3 con los estudiantes ya creados, este sera el paralelo de prueba, solo se ingresa el numero
        Paralelo paralelo3 = new Paralelo("3",lEstudiantesP03);
        
        //las preguntas se acceden por medio del enunciado si es que se desea eliminarlas
        //preguntas nivel 1
        ArrayList<String> resp1 = new ArrayList<>();
        resp1.add("append()");
        resp1.add("clear()");
        resp1.add("contains()");
        
        ArrayList<String> resp2 = new ArrayList<>();
        resp2.add("Unidad basica que compone la secuencia logica de Python");
        resp2.add("Lista de arreglos que crean objetos");
        resp2.add("Unidad basica para especificar que hace el programa sin decirle el como");
        
        ArrayList<String> resp3 = new ArrayList<>();
        resp3.add("Un metodo que trabaja con inputs y outputs");
        resp3.add("Funcionalidad del programa a crear");
        resp3.add("Variable que solo aporta informacion");
        
        Preguntas p1 = new Preguntas("El metodo de un ArrayList para agregar elementos es",1,resp1,"add()");
        Preguntas p2 = new Preguntas("¿Que es una clase?",1,resp2,"Unidad basica que define propiedades de un objeto");
        Preguntas p3 = new Preguntas("¿Que es un objeto?",1,resp3,"Representacion abstracta de un concepto");
        
        //preguntas nivel 2
        ArrayList<String> resp4 = new ArrayList<>();
        resp4.add("En constructores");
        resp4.add("En variables de instancia");
        resp4.add("En herencia");
        
        ArrayList<String> resp5 = new ArrayList<>();
        resp5.add("Beat-Boxing");
        resp5.add("JazzBoxing");
        resp5.add("Unboxing");
        
        ArrayList<String> resp6 = new ArrayList<>();
        resp6.add("Agregacion");
        resp6.add("Agrupacion");
        resp6.add("Asociacion Reflexiva");
        
        Preguntas p4 = new Preguntas("¿En donde se puede dar una sobrecarga?",2,resp4,"En metodos y constructores");
        Preguntas p5 = new Preguntas("El paso de un dato primitivo a una clase Wrapper se denomina",2,resp5,"Boxing");
        Preguntas p6 = new Preguntas("Objetos parte asociados a solo un objeto todo, se crean y se destruyen con el",2,resp6,"Composicion");
        
        //preguntas nivel 3
        ArrayList<String> resp7 = new ArrayList<>();
        resp7.add("El tipo de retorno debe ser el mismo de la super clase");
        resp7.add("El nivel de acceso no puede ser más restrictivo que el método que se sobrescribe");
        resp7.add("No se puede sobrescribir un método marcado como final");
        
        ArrayList<String> resp8 = new ArrayList<>();
        resp8.add("Herencia");
        resp8.add("Abstraccion");
        resp8.add("Polimorfismo");
        
        ArrayList<String> resp9 = new ArrayList<>();
        resp9.add("Puede ser instanciada");
        resp9.add("No puede ser extendida");
        resp9.add("Debe incluir minimo un metodo abstracto");
        
        Preguntas p7 = new Preguntas("Las reglas de la sobreescritura son",3,resp7,"Todas las anteriores");
        Preguntas p8 = new Preguntas("¿Cual de estos no es un pilar de la Orientacion a Objetos?",3,resp8,"Embotellamiento");
        Preguntas p9 = new Preguntas("La clase abstracta",3,resp9,"Puede tener constructor");

        
        //Creacion Materia POO con el paralelo 3 y las preguntas ya hechas
        Materia POO = new Materia("CCPG1052","POO",3);
        POO.aggParalelo(paralelo3);
        POO.agregarPregunta(p1);
        POO.agregarPregunta(p2);
        POO.agregarPregunta(p3);
        POO.agregarPregunta(p4);
        POO.agregarPregunta(p5);
        POO.agregarPregunta(p6);
        POO.agregarPregunta(p7);
        POO.agregarPregunta(p8);
        POO.agregarPregunta(p9);
        
        Termino term1 = new Termino("2023","1");
        term1.actuMaterias(POO);
        Menu.terminos.add(term1);
        //setteando por defecto el termino actual 2023-1
        Juego.setTermino(term1);
        Menu.menuInicial();
    }
}
