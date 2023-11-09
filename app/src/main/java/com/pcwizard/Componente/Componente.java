package com.pcwizard.Componente;

import android.util.Pair;

import java.util.ArrayList;

public abstract class Componente {

    private String nombre;
    private ArrayList<Pair<String, Double>> vendedor;

    public Componente(String nombre) {
        this.nombre = nombre;
        this.vendedor = new ArrayList<>();
    }

    public Componente (String nombre, ArrayList<Pair<String, Double>> vendedor){
        this.nombre = nombre;
        this.vendedor = vendedor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Pair<String, Double>> getVendedor() {
        return vendedor;
    }

    public void setVendedor(ArrayList<Pair<String, Double>> vendedor) {
        this.vendedor = vendedor;
    }
}
