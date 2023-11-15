package com.pcwizard.Componente.Componentes;

import android.util.Pair;

import com.pcwizard.Componente.Componente;

import java.util.ArrayList;

public class SistemaOperativo extends Componente {

    private String distribucion;
    private int version;

    public SistemaOperativo() {
    }

    public SistemaOperativo(String nombre, int idImagen, ArrayList<Pair<String, Double>> precio, String distribucion, int version) {
        super(nombre, idImagen, precio);
        this.distribucion = distribucion;
        this.version = version;
    }

    public SistemaOperativo(String nombre, int idImagen, String distribucion, int version) {
        super(nombre, idImagen);
        this.distribucion = distribucion;
        this.version = version;
    }

    public String getDistribucion() {
        return distribucion;
    }

    public void setDistribucion(String distribucion) {
        this.distribucion = distribucion;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public String toString(){
        return ("Nombre: "+ getNombre() +
                "\nDistribución: " + getDistribucion() +
                "\nVersión: " + getVersion());
    }
}
