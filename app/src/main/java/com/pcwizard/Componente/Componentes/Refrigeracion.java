package com.pcwizard.Componente.Componentes;

import android.util.Pair;

import com.pcwizard.Componente.Componente;
import com.pcwizard.Componente.Componentes.Enumerados.Chipset;

import java.util.ArrayList;

public class Refrigeracion extends Componente {

    private double voltaje;
    private boolean led;

    public Refrigeracion() {
    }

    public Refrigeracion(String nombre, int idImagen, ArrayList<Pair<String, Double>> precio, double voltaje, boolean led) {
        super(nombre, idImagen);
        this.voltaje = voltaje;
        this.led = led;
    }

    public Refrigeracion(String nombre, int idImagen, double voltaje, boolean led) {
        super(nombre, idImagen);
        this.voltaje = voltaje;
        this.led = led;
    }

    public double getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    public boolean isLed() {
        return led;
    }

    public void setLed(boolean led) {
        this.led = led;
    }

    @Override
    public String toString(){
        return ("Nombre: "+ getNombre() +
                "\nVoltaje: " + getVoltaje() + "V" +
                "\nLED: " + isLed());
    }
}
