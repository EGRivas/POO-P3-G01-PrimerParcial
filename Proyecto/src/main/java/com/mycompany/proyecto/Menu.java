package com.mycompany.proyecto;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu{
//Lista con los términos:
    private static ArrayList<Termino> terminos;
    private static ArrayList<Materia> materias;
//Métodos:
    public static void administrarTerminosAcademicos(){
        //listado de terminos academicos
        System.out.print("[");
        for (Termino c : terminos){
            System.out.println(c);
        }
        System.out.println("]");
        
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while(num != 4){
            System.out.println("Escoja la opción que desee\n 1. Ingresar Término\n 2. Editar Término\n 3. Configurar término para el juego\n 4. Salir\n Ingrese el número de su opción:");
            num = sc.nextInt();
            sc.nextLine();
            if (num == 1){
                System.out.println("Indique el año:");
                String a = sc.nextLine();
                System.out.println("Indique el periodo:");
                String p = sc.nextLine();
                Termino t = new Termino(a,p);
                int tAnio = Integer.parseInt(t.getAnio());
                
                for (Termino t1: terminos){
                    if (!t1.equals(t) && tAnio >= 2023){
                        terminos.add(t);
                    }
                }
            }
            else if (num == 2){
                System.out.println("Indique el año nuevo:");
                String a = sc.nextLine();
                System.out.println("Indique el periodo nuevo:");
                String p = sc.nextLine();
                System.out.println("Indique el año antiguo:");
                String a1 = sc.nextLine();
                System.out.println("Indique el periodo antiguo:");
                String p1 = sc.nextLine();
                for (Termino t1: terminos){
                    if (t1.getAnio().equals(a1) && t1.getPeriodo().equals(p1)){
                        t1.setAnio(a);
                        t1.setPeriodo(p);
                    }
                }
            }
            else{
                System.out.println("Indique el año para el juego:");
                String a = sc.nextLine();
                System.out.println("Indique el periodo para el juego:");
                String p = sc.nextLine();
                Juego.setTermino(a,p);
            }
        }
        sc.close();
    }
    public static void administrarMateriasParalelos(){
        //listado de materias y paralelos
        System.out.print("[");
        for (Materia c : materias){
            System.out.println(c);
        }
        System.out.println("]");
        
        
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (num!=5){
            System.out.println("Escoja la opción que desee\n 1. Ingresar Materia\n 2. Editar Materia\n 3.Agregar Paralelo\n 4. Eliminar Paralelo\n 5. Regresar\n Ingrese el número de su opción:");
            num = sc.nextInt();
            sc.nextLine();
            if (num == 1){
                System.out.println("Ingrese codigo de materia: ");
                String codigoM = sc.nextLine();
                System.out.println("Ingrese nombre: ");
                String nombreM = sc.nextLine();
                System.out.println("Ingrese cantidad de niveles: ");
                int nivelesM = sc.nextInt();
                sc.nextLine();
                
                Materia m = new Materia(codigoM,nombreM,nivelesM);
                materias.add(m);
                
            } else if (num == 2){
                System.out.println("Ingrese codigo de materia: ");
                String codigoM = sc.nextLine();
                for (Materia m : materias){
                    if (m.getCodigo().equals(codigoM)){
                        System.out.println("Materia a editar: "+m);
                        System.out.println("Ingrese nombre a cambiar: ");
                        String nombreM = sc.nextLine();
                        System.out.println("Ingrese cantidad de niveles a cambiar: ");
                        int nivelesM = sc.nextInt();
                        m.editarMateria(codigoM,nombreM);
                        m.editarMateria(nivelesM);
                    }
                }
            } else if (num == 3){
                System.out.println("Ingrese codigo de materia: ");
                String codigoM = sc.nextLine();
                
                /*System.out.println("Indique el año del termino:");
                String a = sc.nextLine();
                System.out.println("Indique el periodo del termino:");
                String p = sc.nextLine();
                Termino term = new Termino(a,p);
                */
                for (Materia m : materias){
                    if (m.getCodigo().equals(codigoM)){
                        System.out.println("Ingrese numero de paralelo: ");
                        String numeroP = sc.nextLine();
                        Paralelo pa = new Paralelo(numeroP);
                        m.aggParalelo(pa);
                        
                    }
                }
            } else{
                //opcion para eliminar paralelo
            }
        }
    }
    
    public static void administrarPreguntas(){
        int num = 0;
        Scanner sc = new Scanner(System.in);
        while (num != 4){
            System.out.println("Escoja la opción que desee\n 1. Administrar términos académicos\n 2. Administrar materias y paralelos\n 3. Administrar preguntas\n 4. Regresar\n Ingrese el número de su opción:");
            num = sc.nextInt();
            sc.nextLine();
            if (num==1){
                System.out.println("Ingrese codigo de materia: ");
                String codigoM = sc.nextLine();
                for (Materia m : materias){
                    if(m.getCodigo().equals(codigoM)){
                        ArrayList<Preguntas> lpreguntas = m.getPreguntas();
                        for(Preguntas p:lpreguntas){
                            System.out.println(p);
                        }
                    }
                }
            } else if (num==2){
                System.out.println("Ingrese codigo de materia: ");
                String codigoM = sc.nextLine();
                ArrayList<String> lresp = new ArrayList<String>();
                for (Materia m : materias){
                    if(m.getCodigo().equals(codigoM)){
                        System.out.println("Nivel maximo para esta materia: "+m.getCantidadNiveles());
                        System.out.println("Ingrese el enunciado de la pregunta: ");
                        String enun = sc.nextLine();
                        System.out.println("Ingrese un nivel entre el rango (1,"+m.getCantidadNiveles()+")");
                        int niv = sc.nextInt();
                        sc.nextLine();
                        while(niv<1 || niv>m.getCantidadNiveles()){
                            System.out.println("Ingrese un nivel entre el rango (1,"+m.getCantidadNiveles()+")");
                            niv = sc.nextInt();
                            sc.nextLine();
                        }
                        System.out.println("Ingrese respuesta correcta: ");
                        String respCorr = sc.nextLine();
                        
                        System.out.println("Ingrese posible respuesta 1: ");
                        String resp1 = sc.nextLine();
                        lresp.add(resp1);
                        System.out.println("Ingrese posible respuesta 2: ");
                        String resp2 = sc.nextLine();
                        lresp.add(resp2);
                        System.out.println("Ingrese posible respuesta 3: ");
                        String resp3 = sc.nextLine();
                        lresp.add(resp3);
                        
                        Preguntas preguntaNueva = new Preguntas(enun,niv,lresp,respCorr);
                        m.agregarPregunta(preguntaNueva);
                        
                        
                    }
                }
            } else{
                //eliminar pregunta
            }
        }
    }
    
    public static void configuracion(){
        int num = 0;
        Scanner sc = new Scanner(System.in);
        while (num != 4){
            System.out.println("Escoja la opción que desee\n 1. Administrar términos académicos\n 2. Administrar materias y paralelos\n 3. Administrar preguntas\n 4. Salir\n Ingrese el número de su opción:");
            num = sc.nextInt();
            sc.nextLine();
            if (num == 1){
                administrarTerminosAcademicos();
            }
            else if (num == 2){
                administrarMateriasParalelos();
            }
            else{
            }
        }
    }
    
    public static void menuInicial(){
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while(num != 4){
            System.out.println("Escoja la opción que desee\n 1. Configuración\n 2. Nuevo Juego\n 3. Reporte\n 4. Salir\n Ingrese el número de su opción:");
            num = sc.nextInt();
            sc.nextLine();
            if (num == 1){
                configuracion();
            }
            else if (num == 2){
                
            }
            else{
                
            }
        }
    }
}