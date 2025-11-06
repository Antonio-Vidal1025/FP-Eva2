/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_20_califas;

import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class EVA1_20_CALIFAS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    var input = new Scanner (System.in);
    int califa;
    System.out.println("Introduce tu calificación: ");
    califa = input.nextInt();
    
        if(califa >=90 && califa <= 100){
        System.out.println("A");
        }else if(califa >=80 && califa <= 89)
        System.out.println("B");
        else if(califa >=70 && califa <= 79)
        System.out.println("C");
        else if(califa >=60 && califa <= 69)
        System.out.println("D");
        else if(califa >=0 && califa <= 59)
        System.out.println("F");
    }
    }


