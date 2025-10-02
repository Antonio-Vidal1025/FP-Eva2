/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_switch;

import java.util.Scanner;

/**
 *
 * @author igrid
 */
public class EVA2_2_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner captu = new Scanner(System.in);
    int opc;
    System.out.println("1. Consultar Saldo... ");
    System.out.println("2. Retirar monto... ");
    System.out.println("3. Depositar monto... ");
    System.out.println("Selcciona una opinion del menú.");
    opc = captu.nextInt();
    switch(opc) {
        case 1:
            System.out.println("Elegiste imprimir saldo!");
            break; //rompe o detiene la intrucción
        case 2: 
            System.out.println("Elegiste retirar saldo!");
            break; //fin del switch
        case 3:
            System.out.println("Elegiste depositar saldo!");
            break; //fin del switch
        default: //Opcional
            System.out.println("Opción incorrecta!");
    }
    }
    }
    
