package com.mycompany.proyecto;
import java.util.ArrayList;

public class Juego{
//Atributos:
    private static Termino termino;
    private ArrayList<Paralelo> paralelos;

    //agrego disponibilidad de comodines como variable de instancia

    private int[] discomodines = {1, 1, 1};

    TipoComodin[] comodines = TipoComodin.values();



//Constructor:
    public Juego(){

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
                System.out.println(comodines[j]);
            }

        }
    }

}