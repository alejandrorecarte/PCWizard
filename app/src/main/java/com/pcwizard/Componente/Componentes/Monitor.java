package com.pcwizard.Componente.Componentes;

import com.pcwizard.Componente.Componente;

public class Monitor extends Componente {

    private int pulgadas;
    private int tasaRefresco;

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
}
