/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

import interfaces.MetodosCalculadora;

/**
 *
 * @author laboratorio
 */
public class Calculadora extends DispositivoElectronico 
    implements MetodosCalculadora {
    
    private double numeroUno;
    private double numeroDos;

    public Calculadora(
            String marca, String modelo, double precio, 
            String serie) {
        
        super(marca, modelo, precio, serie);
    }

    public double getNumeroUno() {
        return numeroUno;
    }

    public void setNumeroUno(double numeroUno) {
        this.numeroUno = numeroUno;
    }

    public double getNumeroDos() {
        return numeroDos;
    }

    public void setNumeroDos(double numeroDos) {
        this.numeroDos = numeroDos;
    }

    @Override
    public double sumar(double num1, double num2) {
        return num1+num2;
    }

    @Override
    public double restar(double num1, double num2) {
        return num1-num2;
    }

    @Override
    public double dividir(double num1, double num2) {
        return num1/num2;
    }

    @Override
    public double potencia(int base, int exponente) {
        return Math.pow(base, exponente);
    }
}
