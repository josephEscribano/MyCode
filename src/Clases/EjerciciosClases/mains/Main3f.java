package Clases.EjerciciosClases.mains;

import Clases.EjerciciosClases.Clases.Ejercicio3f;


import java.util.Random;
import java.util.Scanner;


public class Main3f {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        String nombreAlumno;
        int nMatricula;
        double suma = 0;
        double MediaAsignaturas = 0;
        int max = 0;
        double maxMedia = 0;
        int aux = 0;
        int contadorBaseDeDatos = 0;
        int contadorSistemas = 0;
        int contadorLenguajes = 0;
        int contadorEntornos = 0;
        int contadorProgramacion = 0;
        Ejercicio3f alumnos[] = new Ejercicio3f[10];
        int Matriculados[] = new int[5];
        int Nsuspensos[] = new int[5];
        double MediaAlumnos[] = new double[10];
        int ordenados[] = new int[10];



        // rellenar array de alumnos
        for(int i = 0; i < alumnos.length; i++){
            System.out.println("Dime el nombre del alumno");
            nombreAlumno = sc.nextLine();

            System.out.println("Dime el numero de matrícula");
            nMatricula = sc.nextInt();
            sc.nextLine();

            alumnos[i] = new Ejercicio3f(nombreAlumno,nMatricula);

        }

        //rellenar el array calificaciones y apartado c)
        for (int i = 0; i < alumnos.length;i++){
            for (int j = 0; j < 5; j++){
                alumnos[i].getCalificaciones()[j] = rand.nextInt(10);
                // apartado c)
                if (alumnos[i].getCalificaciones()[j] < 5){
                    if (j == 0){
                        contadorBaseDeDatos++;
                    }else if(j == 1){
                        contadorSistemas++;
                    }else if(j == 2){
                        contadorLenguajes++;
                    }else if(j == 3){
                        contadorEntornos++;
                    }else if(j == 4){
                        contadorProgramacion++;
                    }
                }
            }
        }

        // apartado c) rellenar el array de suspensos.
        // rellenamos el array de suspensos
        for (int i = 0; i < Nsuspensos.length; i++){
            if (i == 0){
                Nsuspensos[i] = contadorBaseDeDatos;
            }else if (i == 1){
                Nsuspensos[i] = contadorSistemas;
            }else if (i == 2){
                Nsuspensos[i] = contadorLenguajes;
            }else if (i == 3){
                Nsuspensos[i] = contadorEntornos;
            }else if (i == 4){
                Nsuspensos[i] = contadorProgramacion;
            }
        }

        // muestra la asignatura con mas suspensos
        for (int i = 0; i  < Nsuspensos.length;i++){
            if (max < Nsuspensos[i]){
                max = Nsuspensos[i];
                aux = i;
            }
            if(i == Nsuspensos.length - 1){
                if (aux == 0){
                    System.out.println("La asignatura con mas suspensos es Base de datos con " + contadorBaseDeDatos + " suspensos");
                }else if(aux == 1){
                    System.out.println("La asignatura con mas suspensos es Sistemas informáticos con " + contadorSistemas + " suspensos");
                }else if (aux == 2){
                    System.out.println("La asignatura con mas suspensos es Lenguaje de marcas con " + contadorLenguajes + " suspensos");
                }else if(aux == 3){
                    System.out.println("La asignatura con mas suspensos es Entornos de desarrollo con " + contadorEntornos + " suspensos");
                }else if (aux == 4){
                    System.out.println("La asignatura con mas suspensos es Programación con " + contadorProgramacion + " suspensos");
                }
                contadorBaseDeDatos = 0;
                contadorSistemas = 0;
                contadorLenguajes = 0;
                contadorEntornos = 0;
                contadorProgramacion = 0;
                max = 0;
            }
        }

        // muestra el array alumnos
        for (int i = 0; i < alumnos.length;i++){
            System.out.println(alumnos[i]);
        }

        // Nota media de cada asignatura apartado b)
        // Duda***En este apartado querria haberlo hecho con un metodo pero no encontraba la manera de hacerlo, porque necesitaba valores del Main.
        for (int i = 0; i < 5;i++){
            for (int j = 0; j < 10;j++){
                suma = suma + alumnos[j].getCalificaciones()[i];
                MediaAsignaturas = suma / alumnos.length;

            }
            if (i == 0){
                System.out.println("En la asignatura de Base de datos la media es de " + MediaAsignaturas);
            }else if(i == 1){
                System.out.println("En la asignatura de Sistemas informáticos la media es de " + MediaAsignaturas);
            }else if (i == 2){
                System.out.println("En la asignatura de Lenguaje de Marcas la media es de " + MediaAsignaturas);
            }else if(i == 3){
                System.out.println("En la asignatura de Entornos de Desarrollo la media es de " + MediaAsignaturas);
            }else if (i == 4){
                System.out.println("En la asignatura de Programación la media es de " + MediaAsignaturas);
            }

        }

        // apartado d)

        for (int i  = 0; i < alumnos.length; i++){
            if (maxMedia < alumnos[i].MediaAlumno()){
                maxMedia = alumnos[i].MediaAlumno();
                aux = i;
            }
            if (i == alumnos.length - 1){
                System.out.println("El alumno con mejor nota media es " + alumnos[aux].getNombre() + " con numero de matricula " + alumnos[aux].getN_matricula());
                maxMedia = 0;
            }
        }

        // apartado f)
        for (int i = 0; i < MediaAlumnos.length;i++){
            MediaAlumnos[i] = alumnos[i].MediaAlumno();
            System.out.println(MediaAlumnos[i]);
        }


        // El array Mediaalumnos y el array de alumnos estan ordenados, es decir, la nota media del primer alumno pertenece a la primera posicion del array mediaAlumnos.
        for (int i = 0; i  < alumnos.length; i++){
            for (int  j = 0; j < alumnos.length; j++){
                if (maxMedia < MediaAlumnos[j]){
                    maxMedia = MediaAlumnos[j];
                    aux = j;
                }

            }
            ordenados[i] = alumnos[aux].getN_matricula();
            MediaAlumnos[aux] = 0;
            System.out.println(" El alumno con nombre " + alumnos[aux].getNombre() +" y numero de matricula " + ordenados[i] + " tiene una nota media de " + maxMedia);
            maxMedia = 0;
        }


        // apartado e)

        for (int i = 0; i < alumnos.length; i++){
            for (int j = 0; j < 5; j++){
                if (alumnos[i].getCalificaciones()[j] != 0 ){
                    if (j == 0){
                        contadorBaseDeDatos++;
                    }else if(j == 1){
                        contadorSistemas++;
                    }else if (j == 2){
                        contadorLenguajes++;
                    }else if (j == 3){
                        contadorEntornos++;
                    }else if (j == 4){
                        contadorProgramacion++;
                    }
                }
            }
        }

        //rellena el array de matriculados
        for (int i = 0; i  < Matriculados.length; i++){
            if (i == 0){
                Matriculados[i] = contadorBaseDeDatos;
            }else if(i  == 1){
                Matriculados[i] = contadorSistemas;
            }else if(i == 2){
                Matriculados[i] = contadorLenguajes;
            }else if(i == 3){
                Matriculados[i] = contadorEntornos;
            }else if(i == 4){
                Matriculados[i] = contadorProgramacion;
            }
        }

        // muestra la asignatura con mas matriculados
        for(int i = 0; i < Matriculados.length; i++){
            if (max < Matriculados[i]){
                max = Matriculados[i];
                aux = i;
            }

            if (i == Matriculados.length - 1){
                if (aux == 0){
                    System.out.println("La asignatura con mas alumnos matriculados es Base de datos con " + contadorBaseDeDatos + " matriculados");
                }else if(aux == 1){
                    System.out.println("La asignatura con mas alumnos matriculados es Sistemas informáticos con " + contadorSistemas + " matriculados");
                }else if (aux == 2){
                    System.out.println("La asignatura con mas alumnos matriculados es Lenguaje de marcas con " + contadorLenguajes + " suspensos");
                }else if(aux == 3){
                    System.out.println("La asignatura con mas alumnos matriculados es Entornos de desarrollo con " + contadorEntornos + " matriculados");
                }else if (aux == 4){
                    System.out.println("La asignatura con mas alumnos matriculados es Programación con " + contadorProgramacion + " matriculados");
                }
            }
        }


















    }

}

