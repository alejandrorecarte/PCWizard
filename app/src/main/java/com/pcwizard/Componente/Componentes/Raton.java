package com.pcwizard.Componente.Componentes;

import android.util.Pair;

import com.pcwizard.Componente.Componente;

import java.util.ArrayList;

public class Raton extends Componente {

    private int dpi;
    private boolean inalambrico;
    private boolean optico;

    public Raton(String nombre, ArrayList<Pair<String, Double>> precio, int dpi, boolean inalambrico, boolean optico) {
        super(nombre, precio);
        this.dpi = dpi;
        this.inalambrico = inalambrico;
        this.optico = optico;
    }

    public Raton(String nombre, int dpi, boolean inalambrico, boolean optico) {
        super(nombre);
        this.dpi = dpi;
        this.inalambrico = inalambrico;
        this.optico = optico;
    }
    
    public int getDpi() {
        return dpi;
    }

    public void setDpi(int dpi) {
        this.dpi = dpi;
    }

    public boolean isInalambrico() {
        return inalambrico;
    }

    public void setInalambrico(boolean inalambrico) {
        this.inalambrico = inalambrico;
    }

    public boolean isOptico() {
        return optico;
    }

    public void setOptico(boolean optico) {
        this.optico = optico;
    }

    @Override
    public String toString(){
        return ("Nombre: "+ getNombre() +
                "\nDPI: " + getDpi() + "dpi" +
                "\nInalámbrico: " + isInalambrico() +
                "\nÓptico: " + isOptico());
    }
}
