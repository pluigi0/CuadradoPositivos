package Cuadrado;

import java.util.Scanner;

/*
Programa que calcula el cuadrado de numeros enteros igual o mayor a cero
*/

public class Cuadrado {
    public static void main(String[] args) {
        int numero;
        double cuadrado;
        Scanner entry = new Scanner (System.in);
        
        System.out.print("Ingresa un numero: ");
        numero = entry.nextInt();
                
        while (numero >= 0){

            cuadrado = Math.pow(numero, 2);
            System.out.println("El cuadro de "+numero+ " es: "+cuadrado);
            
            System.out.print("Ingresa un numero: ");
            numero = entry.nextInt();
        }
        if(numero < 0){
                System.out.println("ERROR, solo son numero iguales o mayores a 0");
        }
        
    }
}