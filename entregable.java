/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
vento de curso
Descripción
Se quiere diseñar un programa que haga cálculos sobre las notas de N alumnos que asisten a un curso. El profesor de dicho curso ha realizado M exámenes, que definirán la nota final de cada alumno.

Realizar un programa que genere un array de N alumnos x M notas por alumno que tenga las siguientes características:

1.       El programa deberá preguntar por el número total de alumnos de la clase, y luego por el número total de exámenes que se han realizado durante el curso.
                ( pregunta sobre el numero total de alumnos  y se guarde en filas y numero total de examenes en columnas - array bidimencional) 
                (debo guardar el valor en variables)

2.       Posteriormente, pedirá que se introduzcan las notas de cada alumno, para cada examen.

3.       Luego mostrará un menú con las siguientes opciones:

a.       Listar alumnos y sus notas.

b.       Calcular la media de cada alumno.

c.       Calcular la media total de la clase.

d.       Salir (*).

(*) En la cuarta opción es cuando único se finalizará la ejecución del programa. Si se seleccionan una de las otras tres opciones se repetirá el menú tantas veces como crea conveniente el usuario.

Debes entregar una memoria en PDF llamada UF1_A2_NombreApellidos.pdf con capturas del código y de la salida que genere el programa, donde se elijan las 4 opciones, y se vea que funcionan.
 */

package com.mycompany.practicajava;

/**
 *
 * @author FranciscoSantiagoSac
 */

import java.util.Scanner;

public class PracticaJava {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce la cantidad de Alumnos");
        int cantidadAlumnos = sc.nextInt();
      
       System.out.print("Introduce la cantidad de examenes");
        int cantidadExamenes = sc.nextInt();
        
        int[][] alumnosExamenes = new int[cantidadAlumnos][cantidadExamenes];
        
        for ( int i = 0; i < cantidadAlumnos;i++){
         
            
            for(int j = 0; j < cantidadExamenes;j++){
                
                   System.out.print("Ingresa la nota del alumno" + ( i + 1) + "en el examen" + (j+1) );
                   notasExamenes[i][j]  =Scanner.nextDouble();
            }
        
        }
        
        
        