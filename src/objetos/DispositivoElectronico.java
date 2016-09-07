/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author laboratorio
 */
public abstract class DispositivoElectronico {
    
    private String marca;
    private String modelo;
    private double precio;
    private String serie;

    public DispositivoElectronico() {
    }

    public DispositivoElectronico(String marca, 
            String modelo, double precio, String serie) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.serie = serie;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    @Override
    public String toString() {
        return "DispositivoElectronico{" + "marca=" + 
                marca + ", modelo=" + modelo + ", precio=" + 
                precio + ", serie=" + serie + '}';
    }
    
    
}
