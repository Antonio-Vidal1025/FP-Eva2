/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_arreglos_string;

import java.util.Scanner;

/**
 *
 * @author igrid
 */
public class EVA2_6_ARREGLOS_STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner captu = new Scanner(System.in);
        int dia;
    String diasSemana[] = ("Domingo", "Lunes", "Martes", 
                                "Miercoles", "Viernes", "Sabado");
        System.out.println("Introduce el día en número (0 - 6): ");
        dia = captu.nextInt();
        System.out.println("EL día es " +diasSemana[dia]);
    }
    
}
