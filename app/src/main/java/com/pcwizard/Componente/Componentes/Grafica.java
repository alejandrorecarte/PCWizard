package com.pcwizard.Componente.Componentes;

import android.util.Pair;

import com.pcwizard.Componente.Componente;

import java.util.ArrayList;

public class Grafica extends Componente {

    private int memoria;
    private int velocidadReloj;
    private int potencia;

    public Grafica(String nombre, ArrayList<Pair<String, Double>> precio, int memoria, int velocidadReloj, int potencia) {
        super(nombre, precio);
        this.memoria = memoria;
        this.velocidadReloj = velocidadReloj;
        this.potencia = potencia;
    }

    public Grafica(String nombre, int memoria, int velocidadReloj, int potencia) {
        super(nombre);
        this.memoria = memoria;
        this.velocidadReloj = velocidadReloj;
        this.potencia = potencia;
    }
    
    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }

    public int getVelocidadReloj() {
        return velocidadReloj;
    }

    public void setVelocidadReloj(int velocidadReloj) {
        this.velocidadReloj = velocidadReloj;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString(){
        return ("Nombre: "+ getNombre() +
                "\nMemoria: " + getMemoria() + "GB" +
                "\nVelocidad de reloj: " +  getVelocidadReloj() + "MHz" +
                "\nPotencia: " + getPotencia() + "W");
    }
}
