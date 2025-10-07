/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class EVA2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // IMPRIMIR LOS NUMEROS DEL1 - 20;
        for (int i = 1; i <= 20; i++)
        System.out.println(i + "-");
        
        //+= suma, -= resta, *= multiplicación, /= divide
        System.out.println("");//IMPRIMIR LOS NUMEROS PARES DE 0 A 100
        // 0 - 2 - 4 - 6... 100
        for (int i = 0 ; i <= 100; i+=2)
        System.out.println(i + "-");
        
        //repitan el anterior, en orden inverso
        System.out.println("");
        for (int i = 100 ; i >= 0; i-=2)
        System.out.println(i + "-");
        
        //imprimir la lista de números entre cualquier valor 
        //que el usuario quiera
        //Ejemplo: -15 y 5 --> -15 -14 -13... 0 1 2 3 4 5
         Scanner input = new Scanner(System.in);

        System.out.println("Ingresa el primer valor:");
        int valor1 = input.nextInt();

        System.out.println("Ingresa el segundo valor:");
        int valor2 = input.nextInt();

        if (valor1 <= valor2) {
            for (int i = valor1; i <= valor2; i++) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = valor1; i >= valor2; i--) {
                System.out.print(i + " ");
            }
        }       
 
        
        //IMPRIMIR EN ORDEN INVERSO 
        System.out.println("Ingresa el primer valor: ");
        int valor3 = input.nextInt();

        System.out.println("Ingresa el segundo valor: ");
        int valor4 = input.nextInt();
        
        if (valor1 < valor2) {
            for (int i = valor3; i >= valor1; i--) {
                System.out.print(i + " ");
            }
        } else {
            for (int i = valor1; i >= valor4; i--) {
                System.out.print(i + " ");
            }
        }
                
        //IMPRIMIR LA TBALA DE MULTIPLICAR (1 A 10)DE
        //CUALQUIER NÚMERO QUE DE EL USUARIO
 
        System.out.println("Ingresa un número para ver su tabla de multiplicar:");
        int numero = input.nextInt();

        System.out.println("\nTabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        
    }
    
}
