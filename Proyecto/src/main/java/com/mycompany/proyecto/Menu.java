package com.mycompany.proyecto;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu{
//Lista con los términos:
    private static ArrayList<Termino> terminos;
    private static ArrayList<Materia> materias;
    private static ArrayList<Paralelo> paralelos;
    private static ArrayList<Preguntas> preguntas;
    private static Juego juego;
    private static ArrayList<Juego> juegos;
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
                setTermino(a,p);
            }
        }
        sc.close();
    }
    public static void administrarMateriasParalelos(){
        //listado de materias y paralelos
        for (Termino t: terminos){
            materias = new ArrayList<Materia>();
            materias.addAll(t.getMaterias());
        }
        for (Materia m: materias){
            paralelos = new ArrayList<Paralelo>();
            paralelos.addAll(m.getParalelos);
        }
        System.out.println("MATERIAS:");
        System.out.print("[");
        for (Materia c : materias){
            System.out.println(c);
        }
        System.out.println("]");
        System.out.println("PARALELOS:");
        System.out.print("[");
        for (Paralelo g : paralelos){
            System.out.println(g);
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
                System.out.println("Ingrese el año del termino donde quiere agregar la materia: ");
                String anioT = sc.nextLine();
                System.out.println("Ingrese el periodo del termino donde quiere agregar la materia: ");
                String perT = sc.nextLine();
                Termino t1 = new Termino(anioT,perT);
                for (Termino t: terminos){
                    if(t.equals(t1)){
                        materias = t1.getMateria();
                        materias.add(new Materia(codigoM,nombreM,nivelesM));
                    }
                }                

                
            } else if (num == 2){
                System.out.println("Ingrese codigo de materia: ");
                String codigoM = sc.nextLine();
                System.out.println("Ingrese el año del termino donde quiere editar la materia: ");
                String anioT = sc.nextLine();
                System.out.println("Ingrese el periodo del termino donde quiere editar la materia: ");
                String perT = sc.nextLine();
                String codigoM = sc.nextLine();
                Termino t1 = new Termino(anioT,perT);
                for (Termino t: terminos){
                    if(t.equals(t1)){
                        materias = t1.getMaterias();
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
                    }
                }
            } else if (num == 3){
                System.out.println("Ingrese codigo de materia: ");
                String codigoM = sc.nextLine();
                System.out.println("Ingrese el año del termino donde quiere agregar paralelo: ");
                String anioT = sc.nextLine();
                System.out.println("Ingrese el periodo del termino donde quiere agregar paralelo: ");
                String perT = sc.nextLine();
                Termino t1 = new Termino(anioT,perT);
                for (Termino t: terminos){
                    if(t.equals(t1)){
                        materias = t1.getMaterias();
                        for (Materia m : materias){
                            if (m.getCodigo().equals(codigoM)){
                                System.out.println("Ingrese numero de paralelo: ");
                                String numeroP = sc.nextLine();
                                Paralelo pa = new Paralelo(numeroP);
                                m.aggParalelo(pa);

                            }
                        }
                    }
                }
            } 
            else{
                System.out.println("Ingrese codigo de materia: ");
                String codigoM = sc.nextLine();
                System.out.println("Ingrese el año del termino donde quiere eliminar paralelo: ");
                String anioT = sc.nextLine();
                System.out.println("Ingrese el periodo del termino donde quiere eliminar paralelo: ");
                String perT = sc.nextLine();
                System.out.println("PARALELOS:");
                System.out.print("[");
                for (Paralelo g : paralelos){
                    System.out.println(g);
                }
                System.out.println("]"); 
                Termino t1 = new Termino(anioT,perT);
                for (Termino t: terminos){
                    if(t.equals(t1)){
                        materias = t1.getMaterias();
                        for (Materia m : materias){
                            if (m.getCodigo().equals(codigoM)){
                                System.out.println("Ingrese numero de paralelo: ");
                                String numeroP = sc.nextLine();
                                paralelos = m.getParalelos();
                                for(Paralelo p:paralelos){
                                    if(numeroP.equals(p.getNumero())){
                                        int x = paralelos.indexOf(p);
                                        paralelos.remove(x);
                                    }
                                }

                            }
                        }
                    }
                }
            }
        }
        sc.close();
    }
    
    public static void administrarPreguntas(){
        int num = 0;
        Scanner sc = new Scanner(System.in);
        while (num != 4){
            System.out.println("Escoja la opción que desee\n 1. Administrar términos académicos\n 2. Administrar materias y paralelos\n 3. Administrar preguntas\n 4. Regresar\n Ingrese el número de su opción:");
            num = sc.nextInt();
            sc.nextLine();
        for (Termino t: terminos){
            materias = new ArrayList<Materia>();
            materias.addAll(t.getMaterias());
        }
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
                System.out.println("Ingrese el enunciado de la pregunta a eliminar:")
                String e = sc.nextLine();
                for(Materia m:materias){
                    preguntas = m.getPreguntas();
                    for (Pregutnas p : preguntas){
                        if(e.equals(p.getEnunciado)){
                            int h = preguntas.indexOf(p);
                            preguntas.remove(h);
                        }
                    }
                }



            }
        }
        sc.close();
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
                administrarPreguntas();
            }
        }
        sc.close()
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
                for (Termino t: terminos){
                    materias = new ArrayList<Materia>();
                    materias.addAll(t.getMaterias());
                }
                for (Materia m: materias){
                    paralelos = new ArrayList<Paralelo>();
                    paralelos.addAll(m.getParalelos);
                }
                System.out.println("Ingrese el código de la materia con el que quiere empezar el juego:");
                String m = sc.nextLine();
                System.out.println("Ingrese el número del paralelo con el quiere empezar el nuevo juego:");
                String p = sc.nextLine();
                for(Materia m1: materias){
                    if(m1.getCodigo().equals(m)){
                        Materia materia = m1;
                    }
                }
                for(Paralelo p1 : paralelos){
                    if(p1.getNumero().equals(p)){
                        Paralelo paralelo = p1;
                    }
                }
                

            }
            else{
                
            }
        }
        sc.close();
    }
}