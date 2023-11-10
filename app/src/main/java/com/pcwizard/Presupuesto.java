package com.pcwizard;

import com.pcwizard.Componente.Componente;
import com.pcwizard.Componente.Componentes.Enumerados.Chipset;
import com.pcwizard.Componente.Componentes.Enumerados.Memoria;
import com.pcwizard.Componente.Componentes.Microprocesador;
import com.pcwizard.Componente.Componentes.PlacaBase;
import com.pcwizard.Componente.Componentes.RAM;
import com.pcwizard.Componente.Componentes.Caja;
import com.pcwizard.Componente.Componentes.Refrigeracion;
import com.pcwizard.Componente.Componentes.Alimentacion;
import com.pcwizard.Componente.Componentes.Grafica;
import com.pcwizard.Componente.Componentes.Almacenamiento;
import com.pcwizard.Componente.Componentes.SistemaOperativo;
import com.pcwizard.Componente.Componentes.Monitor;
import com.pcwizard.Componente.Componentes.Teclado;
import com.pcwizard.Componente.Componentes.Raton;

import java.util.ArrayList;


public class Presupuesto {

    private String nombre;
    private PlacaBase placaBase;
    private Microprocesador microprocesador;
    private RAM ram;
    private Caja caja;
    private Refrigeracion refrigeracion;
    private Alimentacion alimentacion;
    private Grafica grafica;
    private Almacenamiento almacenamiento;
    private SistemaOperativo sistemaOperativo;
    private Monitor monitor;
    private Teclado teclado;
    private Raton raton;
    private int[] vendedorEscogido = new int[12];

    public Presupuesto() {
    }

    public Presupuesto(PlacaBase placaBase, Microprocesador microprocesador, RAM ram, Caja caja, Refrigeracion refrigeracion, Alimentacion alimentacion, Grafica grafica, Almacenamiento almacenamiento, SistemaOperativo sistemaOperativo, Monitor monitor, Teclado teclado, Raton raton) {
        this.placaBase = placaBase;
        this.microprocesador = microprocesador;
        this.ram = ram;
        this.caja = caja;
        this.refrigeracion = refrigeracion;
        this.alimentacion = alimentacion;
        this.grafica = grafica;
        this.almacenamiento = almacenamiento;
        this.sistemaOperativo = sistemaOperativo;
        this.monitor = monitor;
        this.teclado = teclado;
        this.raton = raton;
    }

    public PlacaBase getPlacaBase() {
        return placaBase;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPlacaBase(PlacaBase placaBase) {
        this.placaBase = placaBase;
    }

    public Microprocesador getMicroprocesador() {
        return microprocesador;
    }

    public void setMicroprocesador(Microprocesador microprocesador) {
        this.microprocesador = microprocesador;
    }

    public RAM getRam() {
        return ram;
    }

    public void setRam(RAM ram) {
        this.ram = ram;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public Refrigeracion getRefrigeracion() {
        return refrigeracion;
    }

    public void setRefrigeracion(Refrigeracion refrigeracion) {
        this.refrigeracion = refrigeracion;
    }

    public Alimentacion getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(Alimentacion alimentacion) {
        this.alimentacion = alimentacion;
    }

    public Grafica getGrafica() {
        return grafica;
    }

    public void setGrafica(Grafica grafica) {
        this.grafica = grafica;
    }

    public Almacenamiento getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public SistemaOperativo getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(SistemaOperativo sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getRaton() {
        return raton;
    }

    public void setRaton(Raton raton) {
        this.raton = raton;
    }

    public void setVendedorEscogido(int vendedor, int i){
        vendedorEscogido[i] = vendedor;
    }

    public int[] getVendedorEscogido() {
        return vendedorEscogido;
    }

    public double getPrecioTotal(){
        double precioTotal = 0;
        if(getPlacaBase() != null) {
            precioTotal += getPlacaBase().getVendedor().get(getVendedorEscogido()[0]).second;
        }
        if(getMicroprocesador() != null) {
        precioTotal += getMicroprocesador().getVendedor().get(getVendedorEscogido()[1]).second;
        }
        if(getRam() != null) {
        precioTotal += getRam().getVendedor().get(getVendedorEscogido()[2]).second;
        }
        if(getCaja() != null) {precioTotal += getCaja().getVendedor().get(getVendedorEscogido()[3]).second;
        precioTotal += getRefrigeracion().getVendedor().get(getVendedorEscogido()[4]).second;
        }
        if(getAlimentacion() != null) {
        precioTotal += getAlimentacion().getVendedor().get(getVendedorEscogido()[5]).second;
        }
        if(getGrafica() != null) {
        precioTotal += getGrafica().getVendedor().get(getVendedorEscogido()[6]).second;
        }
        if(getSistemaOperativo() != null) {precioTotal += getAlmacenamiento().getVendedor().get(getVendedorEscogido()[7]).second;
        precioTotal += getSistemaOperativo().getVendedor().get(getVendedorEscogido()[8]).second;
        }
        if(getSistemaOperativo() != null) {
        precioTotal += getSistemaOperativo().getVendedor().get(getVendedorEscogido()[9]).second;
        }
        if(getTeclado() != null) {
        precioTotal += getTeclado().getVendedor().get(getVendedorEscogido()[10]).second;
        }
        if(getRaton() != null) {
            precioTotal += getRaton().getVendedor().get(getVendedorEscogido()[11]).second;
        }
        return precioTotal;
    }
}
