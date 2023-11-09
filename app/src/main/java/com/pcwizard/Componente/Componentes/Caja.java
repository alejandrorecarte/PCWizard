package com.pcwizard.Componente.Componentes;

import android.util.Pair;

import com.pcwizard.Componente.Componente;

import java.util.ArrayList;

public class Caja extends Componente {
    
    private double ancho;
    private double alto;

    public Caja(String nombre, ArrayList<Pair<String, Double>> precio, double ancho, double alto) {
        super(nombre, precio);
        this.ancho = ancho;
        this.alto = alto;
    }

    public Caja(String nombre, double ancho, double alto) {
        super(nombre);
        this.ancho = ancho;
        this.alto = alto;
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

    @Override
    public String toString(){
        return ("Nombre: "+ getNombre() +
                "\nAncho: " + getAncho() + " cm" +
                "\nAlto: " +  getAlto() + " cm");
    }
}
