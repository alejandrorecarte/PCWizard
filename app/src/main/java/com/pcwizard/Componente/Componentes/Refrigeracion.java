package com.pcwizard.Componente.Componentes;

import com.pcwizard.Componente.Componente;
import com.pcwizard.Componente.Componentes.Enumerados.Chipset;

public class Refrigeracion extends Componente {

    private int voltaje;
    private Chipset chipset;

    public Refrigeracion(String nombre, int voltaje, Chipset chipset) {
        super(nombre);
        this.voltaje = voltaje;
        this.chipset = chipset;
    }

    public int getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(int voltaje) {
        this.voltaje = voltaje;
    }

    public Chipset getChipset() {
        return chipset;
    }

    public void setChipset(Chipset chipset) {
        this.chipset = chipset;
    }
}
