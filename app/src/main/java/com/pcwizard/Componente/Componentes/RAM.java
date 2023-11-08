package com.pcwizard.Componente.Componentes;

import com.pcwizard.Componente.Componente;
import com.pcwizard.Componente.Componentes.Enumerados.Memoria;

public class RAM extends Componente {

    private int capacidad;
    private int velodiad;
    private int latencia;
    private Memoria memoria;

    public RAM(String nombre, int capacidad, int velodiad, int latencia, Memoria memoria) {
        super(nombre);
        this.capacidad = capacidad;
        this.velodiad = velodiad;
        this.latencia = latencia;
        this.memoria = memoria;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getVelodiad() {
        return velodiad;
    }

    public void setVelodiad(int velodiad) {
        this.velodiad = velodiad;
    }

    public int getLatencia() {
        return latencia;
    }

    public void setLatencia(int latencia) {
        this.latencia = latencia;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }
}
