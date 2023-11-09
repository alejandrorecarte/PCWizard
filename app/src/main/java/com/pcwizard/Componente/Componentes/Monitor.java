package com.pcwizard.Componente.Componentes;

import android.util.Pair;

import com.pcwizard.Componente.Componente;

import java.util.ArrayList;

public class Monitor extends Componente {

    private int pulgadas;
    private int tasaRefresco;

    public Monitor(String nombre, ArrayList<Pair<String, Double>> precio, int pulgadas, int tasaRefresco) {
        super(nombre, precio);
        this.pulgadas = pulgadas;
        this.tasaRefresco = tasaRefresco;
    }

    public Monitor(String nombre, int pulgadas, int tasaRefresco) {
        super(nombre);
        this.pulgadas = pulgadas;
        this.tasaRefresco = tasaRefresco;
    }

    public int getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(int pulgadas) {
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
