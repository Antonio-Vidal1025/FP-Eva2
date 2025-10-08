/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_tabla_mult;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class EVA2_12_TABLA_MULT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
        int ini, fin, resi;
        System.out.println("Tabla a imprimir: ");
        ini = captu.nextInt();
        for (int i = 1; i <= 10; i++) { 
        int mult = ini * i;
        System.out.println(ini + " x " + i +" = " + mult);
                }
        
    }
    
}
