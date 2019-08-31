/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadores;

/**
 *
 * @author s109e2
 */
public class operadores {
    
    private static int numeroA;
    private static int numeroB;
    
        public static void main(String[] args) {
        
            numeroA= 13;
            numeroB= 10;
            //Operador modulo
            int resultadoModulo = numeroA %2;
            
            numeroA = numeroA -1; 
            System.out.print("El modulo es: " + resultadoModulo);
            
            //operador incremento
            int resultadoIncremento = numeroA++;
             System.out.print("El resultado del incremento es: " + resultadoIncremento);
             
             numeroB--;
            
        }
    
}
