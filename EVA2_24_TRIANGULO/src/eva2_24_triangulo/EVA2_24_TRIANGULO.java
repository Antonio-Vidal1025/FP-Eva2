/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_triangulo;

import java.util.Scanner;

/**
 *
 * @author igrid
 */
public class EVA2_24_TRIANGULO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu= new Scanner (System.in);
        int val;
        System.out.println("Introduce un valor: ");
        val = captu.nextInt();
        for(int i = 1; i <= val; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
    }
    
}
}