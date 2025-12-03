/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package es.gva.edu.davlorrub.tarea54.dlr;

/**
 *
 * @author David
 * //**Punto 18**
 */
public class Cuadrado implements Figura{
    
    private int lado;

    public Cuadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + '}';
    }
    
    

    @Override
    public double calcularArea() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return lado*lado;
    }

    @Override
    public double calcularPerimetro() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        return 4*lado;
    }
    
    
}
