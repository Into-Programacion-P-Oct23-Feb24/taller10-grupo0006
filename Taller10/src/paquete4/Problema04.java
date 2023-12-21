/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema04 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[][] datos = new double[2][2];
        int contador = 0;
        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos[f].length; c++) {
                System.out.println("Ingrese valor");
                double numero = entrada.nextDouble();
                if (numero > 1000 && numero < 1199) {
                    datos[f][c] = numero;
                } else {
                    numero = 10;
                    datos[f][c] = numero;
                    contador = contador + 1;
                }

            }
        }
        for (int f = 0; f < datos.length; f++) {
            for (int c = 0; c < datos[f].length; c++) {
                System.out.printf("%.1f\n", datos[f][c]);
            }
        }
        System.out.printf("numeros fuera de rango: %d", contador);

    }

}
