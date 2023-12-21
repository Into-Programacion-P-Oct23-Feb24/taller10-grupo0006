/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] arreglo = {{9, 10, 7, 8}, {10, 5, 7, 9}, {7, 9.4, 10, 9}};
        String[] estudiantes = {"Jerry Ponce", "Gabriela Lewis", "Davbid Bell"};
        double[] promedio = new double[3];
        double suma = 0;

        for (int f = 0; f < arreglo.length; f++) {
            for (int c = 0; c < arreglo[f].length; c++) {
                suma = suma + arreglo[f][c];
            }
            promedio[f] = suma / 4;
            suma = suma * 0;
        }
        for (int f = 0; f < arreglo.length; f++) {
            System.out.printf("Estudiante %s tiene un promedio de %.1f\n",
                    estudiantes[f],
                    promedio[f]);
        }
        /*En este mediante las posiciones de filasm y columnas dadas en el arreglo
        se va acumulando la suma de los valores de dicha posicion que el arreglo 
        indique luego se hace un promedio dividiendo la suma para 4 luego hacemos 
        otro ciclo para con este ir preentando un mensaje de los estudiantes y su 
        respectivo promedio
        
        */
    }
}
