/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

import java.util.Scanner;

/**
 *
 * @author s109e2
 */
public class ejercicioMeses {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Introduce un número para determinar que mes es:");
        int mes = reader.nextInt();
        if (mes < 0 || mes > 12) {
            System.out.println("El valor inresado no pertenece a un mes");
        }
        switch (mes) {
            case 1:
                System.out.print("segun el numero ingresado el mes es ENERO:");
                break;
            case 2:
                 System.out.print("segun el numero ingresado el mes es FREBRERO:");
                break;
            case 3:
                System.out.print("segun el numero ingresado el mes es MARZO :");
                break;
            case 4:
                   System.out.print("segun el numero ingresado el mes es ABRIL:");
                break;
            case 5:
                System.out.print("segun el numero ingresado el mes es MAYO:");
                break;
            case 6:
                  System.out.print("segun el numero ingresado el mes es JUNIO:");
                break;
            case 7:
                System.out.print("segun el numero ingresado el mes es JULIO:");
                break;
            case 8:
                   System.out.print("segun el numero ingresado el mes es AGOSTO:");
                break;
            case 9:
                System.out.print("segun el numero ingresado el mes es SEPTIEMBRE:");
                break;
            case 10:
                  System.out.print("segun el numero ingresado el mes es OCTUBRE:");
                break;
            case 11:
                System.out.print("segun el numero ingresado el mes es NOVIEMBRE:");
                break;
            case 12:
                  System.out.print("segun el numero ingresado el mes es DICIEMBRE:");
                break;
            default:
            // code block
        }

    }
}
