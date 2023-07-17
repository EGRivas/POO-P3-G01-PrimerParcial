/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.proyecto;

/**
 *
 * @author Administrador
 */
public class Proyecto {

    private ArrayList<Termino> listaTermino;

    public static void main(String[] args)
    {   //por favor terminar:
        listaTermino = configuracion.cargarListadoTerminos();
        Materia m1 = new Materia("MATG1054","Matematicas Superiores", 5);
        Materia m2 = new Materia("MCTG1012","Diseño de elementos de máquina", 6);
        Materia m3 = new Materia("MATG1049","Cálculo de una variable", 4);
        ArrayList<Materia> listaMateria = new ArrayList<Materia>();
        listaMateria.add(m1);
        listaMateria.add(m2);
        listaMateria.add(m3);
        Preguntas p1 = new Pregunta("Jean Aguilar", "202108643","jcaguila@espol.edu.ec");
        Preguntas p1 = new Pregunta("Jean Aguilar", "202108643","jcaguila@espol.edu.ec");
        Preguntas p1 = new Pregunta("Jean Aguilar", "202108643","jcaguila@espol.edu.ec");
        Preguntas p1 = new Pregunta("Jean Aguilar", "202108643","jcaguila@espol.edu.ec");
        Preguntas p1 = new Pregunta("Jean Aguilar", "202108643","jcaguila@espol.edu.ec");
        Preguntas p1 = new Pregunta("Jean Aguilar", "202108643","jcaguila@espol.edu.ec");
        Preguntas p1 = new Pregunta("Jean Aguilar", "202108643","jcaguila@espol.edu.ec");
        Preguntas p1 = new Pregunta("Jean Aguilar", "202108643","jcaguila@espol.edu.ec");
        Preguntas p1 = new Pregunta("Jean Aguilar", "202108643","jcaguila@espol.edu.ec");
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
        listaEstudiantes.add(e1);
        listaEstudiantes.add(e2);
        listaEstudiantes.add(e3);
        listaEstudiantes.add(e1);
        listaEstudiantes.add(e2);
        listaEstudiantes.add(e3);
        listaEstudiantes.add(e1);
        listaEstudiantes.add(e2);
        listaEstudiantes.add(e3);
        Materia m4 = new Materia("MATG1054","Matematicas Superiores", 7);
        Materia m5 = new Materia("MCTG1012","Diseño de elementos de máquina", 8);
        Materia m6 = new Materia("CCPG1052","POO", 3);
        ArrayList<Materia> listaMateria1 = new ArrayList<Materia>();
        listaMateria1.add(m4);
        listaMateria1.add(m5);
        listaMateria1.add(m6);

        Materia m7 = new Materia("MATG1054","Matematicas Superiores", 9);
        Materia m8 = new Materia("MCTG1012","Diseño de elementos de máquina", 15);
        Materia m9 = new Materia("MATG1049","Cálculo de una variable", 10);
        ArrayList<Materia> listaMateria2 = new ArrayList<Materia>();
        listaMateria2.add(m7);
        listaMateria2.add(m8);
        listaMateria2.add(m9);

        listaTermino.get(0).setMateria(listaMateria);
        listaTermino.get(1).setMateria(listaMateria1);
        listaTermino.get(2).setMateria(listaMateria2);
        Estudiante e1 = newEstudiante("Jean Aguilar", "202108643","jcaguila@espol.edu.ec");
        Estudiante e2 = new Estudiante("Juan Amoretti","202111928","jamorett@espol.edu.ec");
        Estudiante e3 = new Estudiante("Emmanuel Rivas","202142328","Emrivs@espol.edu.ec");
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
        listaEstudiantes.add(e1);
        listaEstudiantes.add(e2);
        listaEstudiantes.add(e3);
        Paralelo p1 = new Paralelo("1");
        Paralelo p2 = new Paralelo("2");
        Paralelo p3 = new Materia("3");
        ArrayList<Paralelo> listaParalelo = new ArrayList<Paralelo>();
        p1.setEstudiantes(listaEstudiantes);
        p2.setEstudiantes(listaEstudiantes);
        p3.setEstudiantes(listaEstudiantes);
        listaParalelo.add(p1);
        listaParalelo.add(p2);
        listaParalelo.add(p3);


        listaTermino.get(0).get(0).setParalelo(listaParalelo);
        listaTermino.get(0).get(1).setParalelo(listaParalelo);
        listaTermino.get(0).get(2).setParalelo(listaParalelo);
        listaTermino.get(1).get(0).setParalelo(listaParalelo);
        listaTermino.get(1).get(1).setParalelo(listaParalelo);
        listaTermino.get(1).get(2).setParalelo(listaParalelo);
        listaTermino.get(2).get(0).setParalelo(listaParalelo);
        listaTermino.get(2).get(1).setParalelo(listaParalelo);
        listaTermino.get(2).get(2).setParalelo(listaParalelo);



        //de donde llegaste ni pregunteeeeeeeeeeeeee, lo unico que se que quiero con ustedddd
    }
}
