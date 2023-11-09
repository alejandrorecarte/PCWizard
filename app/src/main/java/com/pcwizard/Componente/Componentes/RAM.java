package com.pcwizard.Componente.Componentes;

import android.util.Pair;

import com.pcwizard.Componente.Componente;
import com.pcwizard.Componente.Componentes.Enumerados.Memoria;

import java.util.ArrayList;

public class RAM extends Componente {

    private int capacidad;
    private int velocidad;
    private int latencia;
    private Memoria memoria;

    public RAM(String nombre, ArrayList<Pair<String, Double>> precio, int capacidad, int velocidad, int latencia, Memoria memoria) {
        super(nombre, precio);
        this.capacidad = capacidad;
        this.velocidad = velocidad;
        this.latencia = latencia;
        this.memoria = memoria;
    }

    public RAM(String nombre, int capacidad, int velocidad, int latencia, Memoria memoria) {
        super(nombre);
        this.capacidad = capacidad;
        this.velocidad = velocidad;
        this.latencia = latencia;
        this.memoria = memoria;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
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

    @Override
    public String toString(){
        return ("Nombre: "+ getNombre() +
                "\nCapacidad: " + getCapacidad() + "GB" +
                "\nVelocidad: " +  getVelocidad() + "MHz" +
                "\nLatencia: CL" + getLatencia() +
                "\nTipo de memoria: " + getMemoria().name());
    }
}
