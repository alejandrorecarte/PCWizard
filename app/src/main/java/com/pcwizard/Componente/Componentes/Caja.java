package com.pcwizard.Componente.Componentes;

import android.util.Pair;

import com.pcwizard.Componente.Componente;

import java.util.ArrayList;

public class Caja extends Componente {
    
    private double ancho;
    private double alto;
    private double profundidad;

    public Caja() {
    }

    public Caja(String nombre, int idImagen, ArrayList<Pair<String, Double>> precio, double ancho, double alto, double profundidad) {
        super(nombre, idImagen, precio);
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }

    public Caja(String nombre, int idImagen, double ancho, double alto, double profundidad) {
        super(nombre, idImagen);
        this.ancho = ancho;
        this.alto = alto;
        this.profundidad = profundidad;
    }
    
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getProfundidad() {
        return profundidad;
    }

    public void setProfundidad(double profundidad) {
        this.profundidad = profundidad;
    }

    @Override
    public String toString(){
        return ("Nombre: "+ getNombre() +
                "\nAncho: " + getAncho() + " mm" +
                "\nAlto: " +  getAlto() + " mm" +
                "\nProfundidad: " + getProfundidad() + " mm");
    }
}
