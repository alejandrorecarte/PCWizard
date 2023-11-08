package com.pcwizard.Componente.Componentes;

import com.pcwizard.Componente.Componente;
import com.pcwizard.Componente.Componentes.Enumerados.Chipset;
import com.pcwizard.Componente.Componentes.Enumerados.Memoria;

public class Microprocesador extends Componente {

    private int frecuencia;
    private int nucleos;
    private int hilos;
    private Memoria memoria;
    private Chipset chipset;

    public Microprocesador(String nombre, int frecuencia, int nucleos, int hilos, Memoria memoria, Chipset chipset) {
        super(nombre);
        this.frecuencia = frecuencia;
        this.nucleos = nucleos;
        this.hilos = hilos;
        this.memoria = memoria;
        this.chipset = chipset;
    }

    public int getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(int frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getNucleos() {
        return nucleos;
    }

    public void setNucleos(int nucleos) {
        this.nucleos = nucleos;
    }

    public int getHilos() {
        return hilos;
    }

    public void setHilos(int hilos) {
        this.hilos = hilos;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public Chipset getChipset() {
        return chipset;
    }

    public void setChipset(Chipset chipset) {
        this.chipset = chipset;
    }
}
