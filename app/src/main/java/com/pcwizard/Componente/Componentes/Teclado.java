package com.pcwizard.Componente.Componentes;

import android.util.Pair;

import com.pcwizard.Componente.Componente;

import java.util.ArrayList;

public class Teclado extends Componente {

    private boolean mecanico;
    private String distribucion;

    public Teclado(String nombre, ArrayList<Pair<String, Double>> precio, boolean mecanico, String distribucion) {
        super(nombre, precio);
        this.mecanico = mecanico;
        this.distribucion = distribucion;
    }

    public Teclado(String nombre, boolean mecanico, String distribucion) {
        super(nombre);
        this.mecanico = mecanico;
        this.distribucion = distribucion;
    }

    public boolean isMecanico() {
        return mecanico;
    }

    public void setMecanico(boolean mecanico) {
        this.mecanico = mecanico;
    }

    public String getDistribucion() {
        return distribucion;
    }

    public void setDistribucion(String distribucion) {
        this.distribucion = distribucion;
    }

    @Override
    public String toString(){
        return ("Nombre: "+ getNombre() +
                "\nMecánico: " + isMecanico() +
                "\nDistribución: " + getDistribucion());
    }
}
