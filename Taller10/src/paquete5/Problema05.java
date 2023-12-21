/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        String respuesta = "";
        String inicial;
        for (int f = 0; f < estudiantes.length; f++) {
            for (int c = 0; c < estudiantes[f].length; c++) {
                inicial = estudiantes[f][c].substring(0,1);
                if ((inicial.equals("S"))
                        || (inicial.equals("T"))
                        || (inicial.equals("P"))) {
                    respuesta = String.format("%s%s\n", respuesta,
                            estudiantes[f][c]);
                }
            }
        }
        System.out.printf("%s", respuesta);

    }

}
