package com.mycompany.proyecto;
import java.util.Scanner;

public class Menu{
//Lista con los términos:
    private static ArrayList<Termino> terminos;
//Métodoa:
    public static void administrarTerminosAcademicos(){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while(num != 4){
            System.out.println("Escoja la opción que desee\n 1. Ingresar Término\n 2. Editar Término\n 3. Configurar término para el juego\n 4. Salir\n Ingrese el número de su opción:")
            num = sc.nextInt();
            if (num = 1){
                System.out.println("Indique el año:");
                String a = sc.nextLine();
                System.out.println("Indique el periodo:");
                String p = sc.nextLine();
                Termino t = new Termino(a,p);
                for (Termino t1: terminos){
                    if ((t1.getAnio().equals(t.getAnio()) && t1.getPeriodo().equals(t.getPeriodo)) || t.getAnio<2023){
                        break;
                    }
                    else{
                        terminos.add(t)
                    }
                }
            }
            else if (num = 2){

            }
            else{

            }
        }
    }   
    public static void configuracion(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoja la opción que desee\n 1. Administrar términos académicos\n 2. Administrar materias y paralelos\n 3. Administrar preguntas\n 4. Salir\n Ingrese el número de su opción:")
        int num = sc.nextInt();
        if (num = 1){
            administrarTerminosAcademicos();
        }
        else if (num = 2){

        }
        else if (num = 3){

        }
        else{

        }
    }
    public static void menuInicial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escoja la opción que desee\n 1. Configuración\n 2. Nuevo Juego\n 3. Reporte\n 4. Salir\n Ingrese el número de su opción:")
        int num = sc.nextInt();
        if (num = 1){
            configuracion();
        }
        else if (num = 2){

        }
        else if (num = 3){

        }
        else{

        }
    }
}