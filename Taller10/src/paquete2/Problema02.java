/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double[][] arreglo = new double[2][5];
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double suma = 0;
        String respuesta = "";
        double numero;

        for (int f = 0; f < arreglo.length; f++) {
            for (int c = 0; c < arreglo[f].length; c++) {
                System.out.println("Ingrese valor de la venta");
                numero = entrada.nextDouble();
                suma = suma + numero;
            }
            respuesta = String.format("%sVendedor(a) %s\n", respuesta,
                    vendedores[f]);
        }
        /*System.out.printf("%s\nHa realizado un total de %.1f", respuesta,
                suma);*/
        for (int f = 0; f < arreglo.length; f++) {
                System.out.printf("Vendedor (a) %s\n",vendedores[f]);
        }
        System.out.printf("Ha realizado un total de %.1f en ventas",suma);
    }
    /*
    */
    
}
