package com.pcwizard.Componente.Componentes;

import android.util.Pair;

import com.pcwizard.Componente.Componente;
import com.pcwizard.Componente.Componentes.Enumerados.Chipset;
import com.pcwizard.Componente.Componentes.Enumerados.Memoria;

import java.util.ArrayList;

public class PlacaBase extends Componente {

    private Chipset chipset;
    private Memoria memoria;

    public PlacaBase(String nombre, ArrayList<Pair<String, Double>> precio, Memoria memoria, Chipset chipset) {
        super(nombre, precio);
        this.chipset = chipset;
        this.memoria = memoria;
    }

    public PlacaBase(String nombre, Memoria memoria, Chipset chipset) {
        super(nombre);
        this.chipset = chipset;
        this.memoria = memoria;
    }

    public Chipset getChipset() {
        return chipset;
    }

    public void setChipset(Chipset chipset) {
        this.chipset = chipset;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString(){
        return ("Nombre: "+ getNombre() +
                "\nChipset: " + getChipset().name() +
                "\nMemoria: " +  getMemoria().name());
    }
}
