package com.pcwizard.Componente.Componentes;

import com.pcwizard.Componente.Componente;

public class Raton extends Componente {

    private int dpi;
    private boolean inalambrico;
    private boolean optico;

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
}
