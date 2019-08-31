/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicionro1;
import automores.Carro;
import java.util.Scanner;

/**
 *
 * @author s109e2
 */
public class EjercicioNro1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //******PARTE UNO****//
        // Llamado al procedimiento de imprimir en consola
        imprimirNombre();
        //ingresar datos por teclado
        Scanner reader = new Scanner(System.in);

        System.out.print("Introduce el primer número:");
        double numero1 = reader.nextDouble();

        System.out.print("Introduce el segundo número:");
        double numero2 = reader.nextDouble();

        double resultadoSuma = MetodoSumar(numero1,numero2);
        imprimirResultado(resultadoSuma, "suma");

        double resultadoResta = MetodoRestar(numero1,numero2);
        imprimirResultado(resultadoResta, "resta");

        double resultadoMultiplicar = MetodoMultiplicar(numero1,numero2);
        imprimirResultado(resultadoMultiplicar, "multiplicacion");

        double resultadoDividir = MetodoDividir(numero1,numero2);
        imprimirResultado(resultadoDividir, "division");
        
        //****PARTE DOS*****//
        
        Carro miPrimerCarro = new Carro("Azul",4, 2013, "KIA");
        Carro miSegundoCarro = new Carro("Negro",2, 2014, "Chevrolet");
        
        double valorPrimerCarro = miPrimerCarro.valorCarro();
        System.err.println("El valor del primer carro es: " + valorPrimerCarro);
        miPrimerCarro.imprimir();
        
        double valorSegundoCarro = miSegundoCarro.valorCarro();
        System.err.println("El valor del segundo carro es: " + valorPrimerCarro);
        miSegundoCarro.imprimir();
    }

    /**
     * Procedimiento para imprimir nombre
     */
    private static void imprimirNombre() {

        System.out.println("Mi nombre es Daniel");
    }

    /*Funcion sumar dos numeros
     @param numero1 
    */
    private static double MetodoSumar(double numero1, double numero2) {

        double resultadoSuma = numero1 + numero2;
        return resultadoSuma;
    }

    private static double MetodoRestar(double numero1, double numero2) {

        double resultadoResta = numero1 - numero2;
        return resultadoResta;
    }

    private static double MetodoMultiplicar(double numero1, double numero2) {

        double resultadoMultiplicar = numero1 * numero2;
        return resultadoMultiplicar;
    }

    private static double MetodoDividir(double numero1, double numero2) {

        double resultadoDivision = numero1 / numero2;
        return resultadoDivision;
    }

    private static void imprimirResultado(double resultado, String tipoOperacion) {
        System.err.println("La operación realizada es: " + tipoOperacion);
        System.err.println("El resultado es: " + resultado);
    }
}
