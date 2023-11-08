package com.pcwizard.Componente.Componentes;

import com.pcwizard.Componente.Componente;

public class Almacenamiento extends Componente {

    private int capacidad;
    private int velocidadLectura;
    private int velocidadEscritura;

    public Almacenamiento(String nombre, int capacidad, int velocidadLectura, int velocidadEscritura) {
        super(nombre);
        this.capacidad = capacidad;
        this.velocidadLectura = velocidadLectura;
        this.velocidadEscritura = velocidadEscritura;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getVelocidadLectura() {
        return velocidadLectura;
    }

    public void setVelocidadLectura(int velocidadLectura) {
        this.velocidadLectura = velocidadLectura;
    }

    public int getVelocidadEscritura() {
        return velocidadEscritura;
    }

    public void setVelocidadEscritura(int velocidadEscritura) {
        this.velocidadEscritura = velocidadEscritura;
    }
}
