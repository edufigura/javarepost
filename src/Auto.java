/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Eduardo Figueroa
 * @version 28/05/2024
 */
public class Auto {
    
    private String marca,modelo,color,tipoTransmision,tipoCombustible;
    private int año;
    private double cilindrada;

    public Auto() {
        
        marca = "Toyota";
        modelo = "Cacaca";
                
    }

    public Auto(String marca, String modelo, String color, String tipoTransmision, String tipoCombustible, int año, double cilindrada) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.tipoTransmision = tipoTransmision;
        this.tipoCombustible = tipoCombustible;
        this.año = año;
        this.cilindrada = cilindrada;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public String getTipoCombustible() {
        return tipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(double cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca=" + marca + ", modelo=" + modelo + ", color=" + color + ", tipoTransmision=" + tipoTransmision + ", tipoCombustible=" + tipoCombustible + ", a\u00f1o=" + año + ", cilindrada=" + cilindrada + '}';
    }
    
    public static void main(String[] args) {
        Auto objAuto1 = new Auto();
        System.out.println("marca: "+ objAuto1.getMarca());
        System.out.println("Modelo: "+ objAuto1.getModelo());
        
        System.out.println(objAuto1.toString());
        
        
        objAuto1.setModelo("Legacy");
        System.out.println("marca: "+ objAuto1.getMarca());
        System.out.println("Modelo: "+ objAuto1.getModelo());
        
        Auto objAuto2 = new Auto("Subaru", "Impreza", "Azul", "Manual", "Petroleo", 2016, 4);
        
        System.out.println(objAuto2.toString());
        
        
    }
    
    
}
