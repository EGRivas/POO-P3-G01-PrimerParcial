package com.mycompany.proyecto;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Juego{
//Atributos:
    private static Termino termino;
    private Materia materia;
    private Paralelo paralelo;
    private ArrayList<Paralelo> paralelos;
    private int NumPreNivel;
    private Estudiante participante;
    private Estudiante comApoyo;
    private ArrayList<Preguntas> preguntas;
    private String fecha;
    private int nivelAlcanzado;
    private int cantidadPreguntasContestadas;
    private int comodinesUtilizados;
    private int premio;

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
        preguntas = m.getPreguntas(); //se obtienen las preguntas segun la materia ingresada
        //para validar el numero de preguntas por nivel
        
        boolean valido = false;
        while(valido == false){
            int c = 0; //contador externo
            System.out.println("Ingrese el número de preguntas por nivel:");
            int num = sc.nextInt(); //numero de preguntas por nivel
            sc.nextLine();
            //se hace una lista de enteros con el numero de niveles que hay en cada pregunta
            ArrayList<Integer> niveles = new ArrayList<>(); 
            for (Preguntas preg: preguntas){
                niveles.add(preg.getNivel()); //agregando el numero de nivel de la pregunta a la lista "niveles"
            }
            int maxNivel = Collections.max(niveles); //el nivel maximo encontrado en las preguntas
            for (int x = 1;x<=maxNivel;x++){ //primer lazo for que itera del 1 al nivelMaximo con un contador interno
                int c1 = 0;
                for(int n : niveles){ //se recorre la lista de niveles
                    if(n==x){ //se compara que el nivel sea igual a la iteracion del lazo for (el nivel analizado)
                       c1++; //se ira aumentando este contador interno hasta que se lea toda la lista
                    }//En la primera iteracion (x=1), si hay 3 preguntas de nivel 1, este contador da como resultado 3
                }
                if(c1>=num){//se aumenta el contador externo si el interno supera o es igual a num
                    c++;//es decir, siendo num = 3
                    //si hay 4 preguntas en el nivel 1, 4>=3 es true, por lo que queda validado el nivel 1
                }//si hay 2 preguntas en el nivel 2, 2>=3 es false, por lo que el nivel 2 no es validado y c no aumenta
            }
            if(c==maxNivel){//se valida que todos los niveles hayan aumentado, por lo que el maximo debe ser igual a c
                valido = true;
            }
        }
    }
//Método:
    public static void setTermino(Termino t){
        termino = t;
    }

    public Estudiante ayudante(String matriculaEstudiante){
        for(Estudiante e: paralelo.getEstudiantes()) {
            if (e.getMatricula().equals(matriculaEstudiante)) {
                return e;
            }
        } return null;
    }


    public Estudiante participante(String matriculaEstudiante){
        for(Estudiante e: paralelo.getEstudiantes()) {
            if (e.getMatricula().equals(matriculaEstudiante)) {
                return e;
            }
        } return null;
    }

    
    public void empezarJuego() {
        Scanner sc = new Scanner(System.in);
        
        int numPreguntas = preguntas.size();
        int preguntaActual = 0;

        while (preguntaActual < numPreguntas) {
            Preguntas pregunta = preguntas.get(preguntaActual);
            // Verificar si el nivel de la pregunta es menor o igual al nivel alcanzado
            ArrayList<String> lresp = pregunta.listaRespuestas();
            System.out.println(pregunta.getEnunciado());
            System.out.println(lresp);
            // Obtener la respuesta ingresada por el participante
            System.out.print("Ingrese la letra de la respuesta (1, 2, 3 o 4), o 0 para usar un comodín: ");
            int numResp = sc.nextInt();
            // Verificar si se usará un comodín
            if (numResp == 0) {
                mostrarComodinesDisponibles(); // Mostrar comodines disponibles
                continue; // Volver a mostrar la misma pregunta
            }
            String respuestaIngresada = lresp.get(numResp-1);
            // Verificar la respuesta ingresada
            boolean respuestaCorrecta = pregunta.indicarRespuestaCorrecta(respuestaIngresada);
            if (!respuestaCorrecta) {
                System.out.println("Respuesta incorrecta. Fin del juego.");
                return; // Terminar el juego si la respuesta es incorrecta
            }
            preguntaActual++;
            cantidadPreguntasContestadas++;
            nivelAlcanzado = pregunta.getNivel();
            // La pregunta supera el nivel alcanzado, se salta a la siguiente pregunta
            preguntaActual++;
            
            /*if (pregunta.getNivel() <= nivelAlcanzado) {
                ArrayList<String> lresp = pregunta.listaRespuestas();
                System.out.println(pregunta.getEnunciado());
                System.out.println(lresp);
                
                
                // Obtener la respuesta ingresada por el participante
                System.out.print("Ingrese la letra de la respuesta (1, 2, 3 o 4), o 0 para usar un comodín: ");
                int numResp = sc.nextInt();
                String respuestaIngresada = lresp.get(numResp-1);
                // Verificar si se usará un comodín
                if (numResp == 0) {
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
                cantidadPreguntasContestadas++;
                nivelAlcanzado = cantidadPreguntasContestadas / NumPreNivel;
            } else {
                // La pregunta supera el nivel alcanzado, se salta a la siguiente pregunta
                preguntaActual++;
            }*/
        }

        // Si el estudiante ha llegado hasta aquí, ha respondido correctamente todas las preguntas
        System.out.println("¡Felicitaciones! Has respondido correctamente a todas las preguntas.");

        // Obtener el premio ingresado por el profesor
        System.out.print("Ingrese el premio que has ganado: ");
        premio = sc.nextInt();
        sc.nextLine();

        System.out.println("¡Felicidades! Has ganado: " + premio);
    }


    //revisar implementacion
    public void mostrarComodinesDisponibles(){
        Scanner sc = new Scanner(System.in);
        for(int j=0; j < 3; j++){
            if(discomodines[j] == 1){
                System.out.println(comodines[j] + "");
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
        return materia.getCodigo();
    }
    public String getNumParalelo(){
        return paralelo.getNumero();
    }
    public static Termino getTermino(){
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


}

