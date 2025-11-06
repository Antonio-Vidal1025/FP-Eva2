/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_28_primo;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class EVA2_28_PRIMO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner captu = new Scanner (System.in);
    int val;
    boolean esPrimo = true;
    System.out.println("Introduce un valor: ");
    val = captu.nextInt();
    
    for (int i = 2; i < val; i++)   {
        //dividir (exacta)
        int residuo = val % i;
        if (residuo == 0)   {//YA NO ES PRIMO
            esPrimo = false; //una division exacta y ya no es primo 
            break;
        }
        }
    if(esPrimo)
        System.out.println("El valor " + val + " ES PRIMO.");
    else
        System.out.println("El valor " + val + " NO ES PRIMO.");
    }
    }
