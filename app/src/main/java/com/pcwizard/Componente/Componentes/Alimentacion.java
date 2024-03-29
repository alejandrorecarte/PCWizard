package com.pcwizard.Componente.Componentes;

import android.util.Pair;

import com.pcwizard.Componente.Componente;

import java.util.ArrayList;

public class Alimentacion extends Componente {

    private int potencia;
    private boolean modular;

    public Alimentacion() {
    }

    public Alimentacion(String nombre, int idImagen, ArrayList<Pair<String, Double>> precio, int potencia, boolean modular) {
        super(nombre, idImagen, precio);
        this.potencia = potencia;
        this.modular = modular;
    }

    public Alimentacion(String nombre, int idImagen, int potencia, boolean modular) {
        super(nombre, idImagen);
        this.potencia = potencia;
        this.modular = modular;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public boolean isModular() {
        return modular;
    }

    public void setModular(boolean modular) {
        this.modular = modular;
    }

    @Override
    public String toString(){
        return ("Nombre: "+ getNombre() +
                "\nPotencia: " + getPotencia() +
                "\nModular: " +  isModular());
    }
}
