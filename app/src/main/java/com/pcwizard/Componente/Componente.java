package com.pcwizard.Componente;

import android.util.Pair;

import java.util.ArrayList;

public class Componente {

    private String nombre;
    private ArrayList<Pair<String, Double>> vendedor;
    private int idImagen;

    public Componente() {
    }

    public Componente(String nombre, int idImagen) {
        this.nombre = nombre;
        this.vendedor = new ArrayList<>();
        this.idImagen = idImagen;
    }

    public Componente (String nombre, int idImagen, ArrayList<Pair<String, Double>> vendedor){
        this.nombre = nombre;
        this.vendedor = vendedor;
        this.idImagen = idImagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdImagen() {
        return idImagen;
    }

    public void setIdImagen(int idImagen) {
        this.idImagen = idImagen;
    }

    public ArrayList<Pair<String, Double>> getVendedor() {
        return vendedor;
    }

    public void setVendedor(ArrayList<Pair<String, Double>> vendedor) {
        this.vendedor = vendedor;
    }
}
