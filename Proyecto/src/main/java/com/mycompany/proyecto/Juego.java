package com.mycompany.proyecto;
import java.util.ArrayList;
import java.util.Scanner;

public class Juego{
//Atributos:
    private static Termino termino;
    private Materia materia;
    private Paralelo paralelo;
    private ArrayList<Paralelo> paralelos;
    private static int NumPreNivel;
    private Estudiante participante;
    private static Estudiante comApoyo
    private ArrayList<Preguntas> preguntas;
    private static String fecha;
    private static int nivelAlcanzado;
    private static int cantidadPreguntasContestadas;
    private static int comodinesUtilizados;
    private static int premio;

    //agrego disponibilidad de comodines como variable de instancia

    private int[] discomodines = {1, 1, 1};

    private TipoComodin[] comodines = TipoComodin.values();



//Constructor:
    public Juego(Materia m, Paralelo p, Estudiante par){
        materia = m;
        paralelo = p;
        participante = par;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la fecha en formato DD-MM-AA:");
        fecha = sc.nextLine();
        int x = 0;
        int c = 0;
        while(x!=10){
            System.out.println("Ingrese el número de preguntas por nivel:");
            int num = sc.nextInt();
            preguntas = m.getPreguntas();
            int cantidadNiveles = m.getCantidadNiveles;
            int a = 0;
            int i = 1;

            while( i != cantidadNiveles) {
                int b = 0;
                for(Preguntas pre: preguntas){
                    a = pre.getNivel();

                    if(a == i){
                        b++1
                        if(num>b){
                            i = cantidadNiveles;
                        }

                    }

                }
                i = i+1;
                c = c+1;
            }
            if(c == cantidadNiveles){
                NumPreNivel = num;
                x = 10;
            }

        }
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


    public void empezarJuego(Materia m) {

        ArrayList<Preguntas> preguntasJuego = m.getPreguntas(); // Obtener las preguntas seleccionadas para el juego
        int numPreguntas = preguntasJuego.size();
        int preguntaActual = 0;

        while (preguntaActual < numPreguntas) {
            Pregunta pregunta = preguntasJuego.get(preguntaActual);
            mostrarPregunta(pregunta);

            // Obtener la respuesta ingresada por el participante
            System.out.print("Ingrese la letra de la respuesta (A, B, C o D), o * para usar un comodín: ");
            String respuestaIngresada = sc.nextLine().toUpperCase();

            // Verificar si se usará un comodín
            if (respuestaIngresada.equals("*")) {
                mostrarComodinesDisponibles(); // Mostrar comodines disponibles
                continue; // Volver a mostrar la misma pregunta
            }

            // Verificar la respuesta ingresada
            boolean respuestaCorrecta = pregunta.indicarRespuestaCorrecta(respuestaIngresada);
            if (!respuestaCorrecta) {
                System.out.println("Respuesta incorrecta. Fin del juego.");
                return; // Terminar el juego si la respuesta es incorrecta
            }

            preguntaActual++;
            cantidadPreguntasContestadas = preguntaActual;
        }

        // Si el estudiante ha llegado hasta aquí, ha respondido correctamente todas las preguntas
        System.out.println("¡Felicitaciones! Has respondido correctamente a todas las preguntas.");

        // Obtener el premio ingresado por el profesor
        System.out.print("Ingrese el premio que has ganado: ");
        String premio = sc.nextLine();

        System.out.println("¡Felicidades! Has ganado: " + premio);

        sc.close();
    }

    //revisar implementacion
    pubic void mostrarComodinesDisponibles(){
        for(int j; j < 3; j++){
            if(discomodines[j] == 1){
                System.out.println((j + 1) + comodines[j] + "");
            }

        }

        if(discomodines[0] == 0 && discomodines[1] == 0 && discomodines[2] == 0){
            System.out.println("Te has quedado sin comodines");
        }else{
            System.out.println("Ingrese 1, 2, o 3, para usar un comodin: ");
            int opcion = sc.nextInt();
            sc.nextLine();
            if(opcion == 1){

                if(discomodines[0] == 1){
                    comodinesUtilizados += 1;
                    discomodines[0] = 0;
                    System.out.println("Has usado tu comodin 1!");
                } else {
                    System.out.println("Comodin 1 ya fue utilizado anteriormente.");
                }
            } else if (opcion == 2) {
                if(discomodines[1] == 1){
                    comodinesUtilizados += 1;
                    discomodines[1] = 0;
                    System.out.println("Has usado tu comodin 2!");
                } else {
                    System.out.println("Comodin 2 ya fue utilizado anteriormente.");
                }
            } else if (opcion == 3) {
                if(discomodines[2] == 1){
                    comodinesUtilizados += 1;
                    discomodines[2] = 0;
                    System.out.println("Has usado tu comodin 3!");
                } else {
                    System.out.println("Comodin 3 ya fue utilizado anteriormente.");
                }
            } else {
                System.out.println("Opción inválida. Debes ingresar 1, 2 o 3 para usar un comodín.");
            }
        }

    }
//getters:
    public String getCodigoMateria(){
        return materia.getCodigo;
    }
    public String getNumParalelo(){
        return paralelo.getNumero;
    }
    public Termino getTermino(){
        return termino;
    }
    public String getFecha(){
        return fecha;
    }
    public Estudiante getParticipante(){
        return participante;
    }
    public int getNivelAlcanzado(){
        return nivelAlcanzado;
    }
    public int getCantidadPreguntasContestadas(){
        return cantidadPreguntasContestadas;
    }
    public int getComodinesUtilizados(){
        return comodinesUtilizados;
    }
    public int getPremio(){
        return premio;
    }

    public String reporte(){
        return "cantidad de preguntas contestadas: " + cantidadPreguntasContestadas + ", comodines utilizados: " + discomodines + ", Premio: " + premio;
    }
}

