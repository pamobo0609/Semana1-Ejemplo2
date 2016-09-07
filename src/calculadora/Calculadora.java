/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author laboratorio
 */
public class Calculadora {
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        objetos.Calculadora calculadora = 
                new objetos.Calculadora("Casio", 
                        "Cuenta pollos",
                1500, "Serie pul de pueblo");
        
        System.out.println(calculadora.sumar(10, 10));
        System.out.println(calculadora.restar(30, 15));
        System.out.println(calculadora.dividir(5, 3));
        System.out.println(calculadora.potencia(2, 2));
        
        System.out.println(calculadora.toString());
    }
    
}
