package com.pcwizard.Componente.Componentes;

import com.pcwizard.Componente.Componente;

public class Alimentacion extends Componente {

    private int potencia;
    private boolean modular;
    private double precio;

    public Alimentacion(String nombre, int potencia, boolean modular, double precio) {
        super(nombre);
        this.potencia = potencia;
        this.modular = modular;
        this.precio = precio;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
