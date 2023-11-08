package com.pcwizard.Componente.Componentes;

import com.pcwizard.Componente.Componente;

public class Teclado extends Componente {

    private boolean mecanico;
    private String distribucion;

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
}
