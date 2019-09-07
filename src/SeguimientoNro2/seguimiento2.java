/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeguimientoNro2;

import java.util.Scanner;

/**
 *
 * @author s109e2
 */
public class seguimiento2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ejercicio1();
        //ejercicio2();
        //ejercicio3();
        //ejercicio4();
        //ejercicio5();
        ejercicio6();
    }

    public static void ejercicio1() {
        //Mostrar los numeros del 1 al 100
        for (int num = 1; num <= 100; num++) {
            System.out.println("Los numeros del 1 al 100 son: " + num);

        }

        System.out.println("impresion por while ");
        int num = 1;
        while (num <= 100) {
            System.out.println("Los numeros del 1 al 100 son: " + num);
            num++;

        }
    }

    public static void ejercicio2() {
        //Mostrar los numeros del 100 al 1
        for (int num = 100; num > 0; num--) {
            System.out.println("Los numeros del 100 al 1 son: " + num);

        }

        System.out.println("impresion por while ");
        int num = 100;
        while (num > 0) {
            System.out.println("Los numeros del 100 al 1 son: " + num);
            num--;

        }
    }

    public static void ejercicio3() {
        for (int num = 1; num <= 150; num++) {
            if (num % 2 == 0) {
                System.out.println("Los numeros pares del 1 al 150 son: " + num);
            }

        }
        System.out.println("impresion por while ");
        int num = 1;
        while (num <= 150) {
            if (num % 2 == 0) {
                System.out.println("Los numeros pares del 1 al 150 son: " + num);
            }
            num++;

        }
    }

    public static void ejercicio4() {
        // Imprimir la suma de los numeros del 1 al 200
        int num = 0;

        int suma = 0;

        while (num < 200) {

            num++;

            suma = num + suma;

        }

        System.out.println("La suma de los numeros del 1 al 200 es: " + suma);

    }

    public static void ejercicio5() {
        //Pedir un numero por consola y muestre en pantalla el mismo numero de asteriscos
        Scanner sc = new Scanner(System.in);
        System.out.print("Introducir el número de filas: ");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++) {

            System.out.print("*");
        }

    }

    public static void ejercicio6() {
        //Mostrar una matriz 10*10 donde los numeros pares tienen una x y los impares un 0
        int ma[][] = new int[10][10];
     

        for (int fila = 0; fila < 10; fila++) {
            for (int columna = 0; columna < 10; columna++) {
                System.out.print(ma[fila][columna]);

            }
            System.out.println();

        }

    }

}
