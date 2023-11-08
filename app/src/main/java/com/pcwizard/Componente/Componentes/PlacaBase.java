package com.pcwizard.Componente.Componentes;

import com.pcwizard.Componente.Componente;
import com.pcwizard.Componente.Componentes.Enumerados.Chipset;
import com.pcwizard.Componente.Componentes.Enumerados.Memoria;

public class PlacaBase extends Componente {

    private Chipset chipset;
    private Memoria memoria;

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
}
