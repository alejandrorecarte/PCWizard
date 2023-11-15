package com.pcwizard.Componente.Componentes;

import android.util.Pair;

import com.pcwizard.Componente.Componente;

import java.util.ArrayList;

public class Monitor extends Componente {

    private double pulgadas;
    private int tasaRefresco;

    public Monitor() {
    }

    public Monitor(String nombre, int idImagen, ArrayList<Pair<String, Double>> precio, double pulgadas, int tasaRefresco) {
        super(nombre, idImagen, precio);
        this.pulgadas = pulgadas;
        this.tasaRefresco = tasaRefresco;
    }

    public Monitor(String nombre, int idImagen, double pulgadas, int tasaRefresco) {
        super(nombre, idImagen);
        this.pulgadas = pulgadas;
        this.tasaRefresco = tasaRefresco;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public int getTasaRefresco() {
        return tasaRefresco;
    }

    public void setTasaRefresco(int tasaRefresco) {
        this.tasaRefresco = tasaRefresco;
    }

    @Override
    public String toString(){
        return ("Nombre: "+ getNombre() +
                "\nPulgadas: " + getPulgadas() + "''" +
                "\nTasa de refresco: " + getTasaRefresco() + "€");
    }
}
