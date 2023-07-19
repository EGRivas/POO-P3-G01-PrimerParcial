package com.mycompany.proyecto;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Menu{
//Lista con los términos:
    public static ArrayList<Termino> terminos = new ArrayList<>();
    private static ArrayList<Juego> juegos = new ArrayList<>();
    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    
//Métodos:
    
    public static void administrarTerminosAcademicos(){
        //listado de terminos academicos
        System.out.println(terminos);
        
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
                Termino t1 = new Termino(a,p);
                int tAnio = Integer.parseInt(t1.getAnio());
                
                for (int x = 0;x<terminos.size();x++){
                    if (!(terminos.get(x)).equals(t1) && tAnio >= 2023){
                        terminos.add(t1);
                        System.out.println(terminos);
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
            else if (num == 3){
                System.out.println("Indique el año para el juego:");
                String a = sc.nextLine();
                System.out.println("Indique el periodo para el juego:");
                String p = sc.nextLine();
                Termino t = new Termino(a,p);
                for (Termino t1: terminos){
                    if (t1.equals(t)){
                        Juego.setTermino(t);
                    }
                }
            }
            else {
                System.out.println("Regresando");
            }
        }
    }
    public static void administrarMateriasParalelos(){
        ArrayList<Materia> materias;
        ArrayList<Paralelo> paralelos;
        //listado de materias y paralelos
        System.out.println("Listado de materias y paralelos segun el termino");
        for (Termino t: terminos){
            System.out.println(t);
            materias = t.getMaterias();
            for(Materia m: materias){
                System.out.println(m);
            }
        }
        
        Scanner sc = new Scanner(System.in);
        int num = 0;
        while (num!=5){
            System.out.println("Escoja la opción que desee\n 1. Ingresar Materia\n 2. Editar Materia\n 3. Agregar Paralelo\n 4. Eliminar Paralelo\n 5. Regresar\n Ingrese el número de su opción:");
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
                        materias = t1.getMaterias();
                        materias.add(new Materia(codigoM,nombreM,nivelesM));
                        t.actuMaterias(materias);
                    }
                }                

                
            } else if (num == 2){
                System.out.println("Ingrese codigo de materia: ");
                String codigoM = sc.nextLine();
                System.out.println("Ingrese el año del termino donde quiere editar la materia: ");
                String anioT = sc.nextLine();
                System.out.println("Ingrese el periodo del termino donde quiere editar la materia: ");
                String perT = sc.nextLine();
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
                                t.actuMaterias(materias);
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
                        materias = t.getMaterias();
                        for (Materia m : materias){
                            if (m.getCodigo().equals(codigoM)){
                                System.out.println("Ingrese numero de paralelo: ");
                                String numeroP = sc.nextLine();
                                Paralelo pa = new Paralelo(numeroP);
                                m.aggParalelo(pa);
                                t.actuMaterias(materias);
                            }
                        }
                    }
                }
            } 
            else if (num == 4){
                System.out.println("Ingrese codigo de materia: ");
                String codigoM = sc.nextLine();
                System.out.println("Ingrese el año del termino donde quiere eliminar paralelo: ");
                String anioT = sc.nextLine();
                System.out.println("Ingrese el periodo del termino donde quiere eliminar paralelo: ");
                String perT = sc.nextLine();
                Termino t1 = new Termino(anioT,perT);
                for (Termino t: terminos){
                    if(t.equals(t1)){
                        materias = t.getMaterias();
                        for (Materia m : materias){
                            if (m.getCodigo().equals(codigoM)){
                                System.out.println("Ingrese numero de paralelo: ");
                                String numeroP = sc.nextLine();
                                paralelos = m.getParalelos();
                                for(Paralelo p:paralelos){
                                    if(numeroP.equals(p.getNumero())){
                                        int x = paralelos.indexOf(p);
                                        paralelos.remove(x);
                                        t.actuMaterias(materias);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            else{
                System.out.println("Regresando");
            }
        }
    }
    
    public static void administrarPreguntas(){
        ArrayList<Materia> materias;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        while (num != 4){
            System.out.println("Escoja la opción que desee\n 1. Visualizar preguntas\n 2. Agregar pregunta\n 3. Eliminar pregunta\n 4. Regresar\n Ingrese el número de su opción:");
            num = sc.nextInt();
            sc.nextLine();
            if (num == 1){
                System.out.println("Ingrese codigo de materia: ");
                String codigoM = sc.nextLine();
                System.out.println("Ingrese el año del termino donde quiere ver las preguntas: ");
                String anioT = sc.nextLine();
                System.out.println("Ingrese el periodo del termino donde quiere ver las preguntas: ");
                String perT = sc.nextLine();
                Termino t1 = new Termino(anioT,perT);
                for (Termino t: terminos){
                    if(t.equals(t1)){
                        materias = t.getMaterias();
                        for (Materia m : materias){
                            if(m.getCodigo().equals(codigoM)){
                                ArrayList<Preguntas> lpreguntas = m.getPreguntas();
                                for(Preguntas p:lpreguntas){
                                    System.out.println(p);
                             }
                          }
                        }
                    }
                }
            } else if (num==2){
                System.out.println("Ingrese codigo de materia: ");
                String codigoM = sc.nextLine();
                System.out.println("Ingrese el año del termino donde quiere agregar las preguntas: ");
                String anioT = sc.nextLine();
                System.out.println("Ingrese el periodo del termino donde quiere agregar las preguntas: ");
                String perT = sc.nextLine();
                Termino t1 = new Termino(anioT,perT);
                
                ArrayList<String> lresp = new ArrayList<String>();
                for (Termino t: terminos){
                    materias = t.getMaterias();
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
                        
                        t.actuMaterias(materias);
                    }
                }
              }
              
            } else if (num == 3){
                System.out.println("Ingrese codigo de materia: ");
                String codigoM = sc.nextLine();
                System.out.println("Ingrese el año del termino donde quiere eliminar preguntas: ");
                String anioT = sc.nextLine();
                System.out.println("Ingrese el periodo del termino donde quiere eliminar preguntas: ");
                String perT = sc.nextLine();
                Termino t1 = new Termino(anioT,perT);
                for (Termino t: terminos){
                    if(t.equals(t1)){
                        materias = t.getMaterias();
                        for (Materia m : materias){
                            if(m.getCodigo().equals(codigoM)){
                                ArrayList<Preguntas> lpreguntas = m.getPreguntas();
                                for(Preguntas p:lpreguntas){
                                    System.out.println(p);
                                }
                                System.out.println("Ingrese el enunciado de la pregunta a eliminar: ");
                                String e = sc.nextLine();
                                Preguntas enun = new Preguntas(e);
                                for(int x = 0; x < lpreguntas.size(); x++){
                                    if(enun.equals(lpreguntas.get(x))){
                                        lpreguntas.remove(x);
                                    } 
                                }
                          }
                        }
                    }
                }
            }
            else {
                System.out.println("Regresando");
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
            else if (num == 3){
                administrarPreguntas();
            }
            else{
                System.out.println("Regresando");
            }
        }
    }
    
    public static void menuInicial(){
        Materia materiaEsc = null;
        Paralelo paraleloEsc = null;
        Estudiante estudiante = null;
        ArrayList<Materia> materias;
        ArrayList<Paralelo> paralelos;
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
                System.out.println("Ingrese el código de la materia con el que quiere empezar el juego:");
                String m = sc.nextLine();
                System.out.println("Ingrese el número del paralelo con el quiere empezar el nuevo juego:");
                String p = sc.nextLine();
                Termino term = Juego.getTermino();
                materias = term.getMaterias();
                for(Materia m1: materias){
                    if(m1.getCodigo().equals(m)){
                        materiaEsc = m1;
                        paralelos = materiaEsc.getParalelos();
                        for(Paralelo p1 : paralelos){
                          if(p1.getNumero().equals(p)){
                              paraleloEsc = p1;
                            }
                        }
                    }
                }
                
                System.out.println("Ingrese el número de matrícula del participante");
                String matricula = sc.nextLine();
                estudiantes = paraleloEsc.getEstudiantes();
                for(Estudiante e: estudiantes){
                    if(e.getMatricula().equals(matricula)){
                        estudiante = e;
                        System.out.println(estudiante);
                    }
                } 
                Juego j = new Juego(materiaEsc, paraleloEsc, estudiante);
                j.empezarJuego();
                juegos.add(j);

            }
            else if (num == 3){
                System.out.println("Ingrese el codigo de la materia:");
                String codMat = sc.nextLine();
                System.out.println("Ingrese el numero del paralelo:");
                String numPar = sc.nextLine();
                System.out.println("Ingrese el año del termino:");
                String anTer = sc.nextLine();
                System.out.println("Ingrese el periodo del termino:");
                String perTer = sc.nextLine();
                for(Juego juego: juegos){
                    if(juego.getCodigoMateria().equals(codMat) && juego.getNumParalelo().equals(numPar) && juego.getTermino().getAnio().equals(anTer) && juego.getTermino().getPeriodo().equals(perTer)){
                    System.out.println("Fecha del juego: " + juego.getFecha());
                    System.out.println("Participante: " + juego.getParticipante());
                    System.out.println("Nivel máximmo alcanzado: " + juego.getNivelAlcanzado());
                    System.out.println("Cantidad preguntas utilizadas: " + juego.getCantidadPreguntasContestadas());
                    System.out.println("Número de comodines utilizados: " + juego.getComodinesUtilizados());
                    System.out.println("Premio: " + juego.getPremio());
                    }
                }
            }
            else{
                System.out.println("Saliendo");
            }
        }
        sc.close();
    }
}