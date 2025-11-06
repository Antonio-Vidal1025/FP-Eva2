/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_cuenta;

import java.util.Scanner;

/**
 *
 * @author igrid
 */
public class EVA2_27_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          // TODO code application logic here
        Scanner captu = new Scanner (System.in);
        int val; 
        int cuenta = 1000000;
        do{
            System.out.println("Cantidad a retirar");
           val = captu.nextInt();
           cuenta = cuenta - val;
           System.out.println("Tu aldo es = " + cuenta);
           //cuenta -= val;
        }while(cuenta > 0);
        }
}
