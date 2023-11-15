package com.pcwizard.Componente.Componentes;

import android.util.Pair;

import com.pcwizard.Componente.Componente;
import com.pcwizard.Componente.Componentes.Enumerados.TipoDiscoDuro;

import java.util.ArrayList;

public class Almacenamiento extends Componente {

    private TipoDiscoDuro tipoDiscoDuro;
    private int capacidad;
    private int velocidadLectura;
    private int velocidadEscritura;

    public Almacenamiento() {
    }

    public Almacenamiento(String nombre, int idImagen, ArrayList<Pair<String, Double>> precio, TipoDiscoDuro tipoDiscoDuro, int capacidad, int velocidadLectura, int velocidadEscritura) {
        super(nombre, idImagen, precio);
        this.tipoDiscoDuro = tipoDiscoDuro;
        this.capacidad = capacidad;
        this.velocidadLectura = velocidadLectura;
        this.velocidadEscritura = velocidadEscritura;
    }

    public Almacenamiento(String nombre, int idImagen, TipoDiscoDuro tipoDiscoDuro,int capacidad, int velocidadLectura, int velocidadEscritura) {
        super(nombre, idImagen);
        this.tipoDiscoDuro = tipoDiscoDuro;
        this.capacidad = capacidad;
        this.velocidadLectura = velocidadLectura;
        this.velocidadEscritura = velocidadEscritura;
    }

    public TipoDiscoDuro getTipoDiscoDuro() {
        return tipoDiscoDuro;
    }

    public void setTipoDiscoDuro(TipoDiscoDuro tipoDiscoDuro) {
        this.tipoDiscoDuro = tipoDiscoDuro;
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

    @Override
    public String toString(){
        return ("Nombre: "+ getNombre() +
                "\nCapacidad: " + getCapacidad() + "GB" +
                "\nVelocidad lectura: " +  getVelocidadLectura() + "MB/s" +
                "\nVelocidad escritura: " + getVelocidadEscritura() + "MB/s");
    }
}
