package com.pcwizard.Componente.Componentes;

import android.util.Pair;

import com.pcwizard.Componente.Componente;

import java.util.ArrayList;

public class Teclado extends Componente {

    private boolean mecanico;
    private String distribucion;
    private boolean inalambrico;

    public Teclado() {
    }

    public Teclado(String nombre, int idImagen, ArrayList<Pair<String, Double>> precio, boolean mecanico, String distribucion, boolean inalambrico) {
        super(nombre, idImagen, precio);
        this.mecanico = mecanico;
        this.distribucion = distribucion;
        this.inalambrico = inalambrico;
    }

    public Teclado(String nombre, int idImagen, boolean mecanico, String distribucion, boolean inalambrico) {
        super(nombre, idImagen);
        this.mecanico = mecanico;
        this.distribucion = distribucion;
        this.inalambrico = inalambrico;
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

    public boolean isInalambrico() {
        return inalambrico;
    }

    public void setInalambrico(boolean inalambrico) {
        this.inalambrico = inalambrico;
    }

    @Override
    public String toString(){
        return ("Nombre: "+ getNombre() +
                "\nMecánico: " + isMecanico() +
                "\nDistribución: " + getDistribucion() +
                "\nInalámbrico: " + isInalambrico());
    }
}
