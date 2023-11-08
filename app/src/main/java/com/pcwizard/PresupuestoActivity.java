package com.pcwizard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.pcwizard.R;


public class PresupuestoActivity extends AppCompatActivity {

    private Bundle savedInstanceState;
    Button bAtras;
    TextView lNombrePresupuesto;
    TextView lChPlacaBase;
    TextView lChMicroprocesador;
    TextView lChRAM;
    TextView lChCaja;
    TextView lChRefrig;
    TextView lChAlimentacion;
    TextView lChGrafica;
    TextView lChAlmacenamiento;
    TextView lChOS;
    TextView lChMonitor;
    TextView lChTeclado;
    TextView lChRaton;
    private Presupuesto presupuesto;
    private BuscarFragment buscarFragment;
    private String seleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.savedInstanceState = savedInstanceState;
        setContentView(R.layout.presupuesto_activity);

        bAtras = findViewById(R.id.bAtras);
        lNombrePresupuesto = findViewById(R.id.etNombrePresupuesto);
        lChPlacaBase = findViewById(R.id.lChPlacaBase);
        lChMicroprocesador = findViewById(R.id.lChMicroprocesador);
        lChRAM = findViewById(R.id.lChRAM);
        lChCaja = findViewById(R.id.lChCaja);
        lChRefrig = findViewById(R.id.lChRefrig);
        lChAlimentacion = findViewById(R.id.lChAlimentacion);
        lChGrafica = findViewById(R.id.lChGrafica);
        lChAlmacenamiento = findViewById(R.id.lChAlmacenamiento);
        lChOS = findViewById(R.id.lChOS);
        lChMonitor = findViewById(R.id.lChMonitor);
        lChTeclado = findViewById(R.id.lChTeclado);
        lChRaton = findViewById(R.id.lChRaton);

        this.presupuesto = MainActivity.presupuesto;
        actualizarDatos();
    }

    public void atras (View view){
        Intent intent = new Intent(this,  MainActivity.class);
        startActivity(intent);
    }

    public void atrasBuscarFragment(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().remove(buscarFragment).commit();
    }

    public void actualizarDatos(){
        if(presupuesto.getNombre() != null){
            lNombrePresupuesto.setText(presupuesto.getNombre());
        }else{
            lNombrePresupuesto.setText("Sin nombre");
        }
        if(presupuesto.getPlacaBase() != null) {
            lChPlacaBase.setText(presupuesto.getPlacaBase().getNombre());
        }else{
            lChPlacaBase.setText("No seleccionado");
        }
        if(presupuesto.getMicroprocesador() != null) {
            lChMicroprocesador.setText(presupuesto.getMicroprocesador().getNombre());
        }else{
            lChMicroprocesador.setText("No seleccionado");
        }
        if(presupuesto.getRam() != null) {
            lChRAM.setText(presupuesto.getRam().getNombre());
        }else{
            lChRAM.setText("No seleccionado");
        }
        if(presupuesto.getCaja() != null) {
            lChCaja.setText(presupuesto.getCaja().getNombre());
        }else{
            lChCaja.setText("No seleccionado");
        }
        if(presupuesto.getRefrigeracion() != null) {
            lChRefrig.setText(presupuesto.getRefrigeracion().getNombre());
        }else{
            lChRefrig.setText("No seleccionado");
        }
        if(presupuesto.getAlimentacion() != null) {
            lChAlimentacion.setText(presupuesto.getAlimentacion().getNombre());
        }else{
            lChAlimentacion.setText("No seleccionado");
        }
        if(presupuesto.getGrafica() != null) {
            lChGrafica.setText(presupuesto.getGrafica().getNombre());
        }else{
            lChGrafica.setText("No seleccionado");
        }
        if(presupuesto.getAlmacenamiento() != null) {
            lChAlmacenamiento.setText(presupuesto.getAlmacenamiento().getNombre());
        }else{
            lChAlmacenamiento.setText("No seleccionado");
        }
        if(presupuesto.getSistemaOperativo() != null) {
            lChOS.setText(presupuesto.getSistemaOperativo().getNombre());
        }else{
            lChOS.setText("No seleccionado");
        }
        if(presupuesto.getMonitor() != null) {
            lChMonitor.setText(presupuesto.getSistemaOperativo().getNombre());
        }else{
            lChMonitor.setText("No seleccionado");
        }
        if(presupuesto.getTeclado() != null) {
            lChTeclado.setText(presupuesto.getTeclado().getNombre());
        }else{
            lChTeclado.setText("No seleccionado");
        }
        if(presupuesto.getRaton() != null) {
            lChRaton.setText(presupuesto.getRaton().getNombre());
        }else{
            lChRaton.setText("No seleccionado");
        }

    }
    public void buscarPlacaBase(View view){
        seleccion = new String("Placa base");
        if (savedInstanceState == null) {
            buscarFragment =  new BuscarFragment(seleccion);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentContainerView, buscarFragment).commit();
        }
    }

    public void buscarMicroprocesador(View view){
        seleccion = new String("Microprocesador");
        if (savedInstanceState == null) {
            buscarFragment =  new BuscarFragment(new String(seleccion));
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainerView, buscarFragment).commit();
        }
    }

    public void buscarRAM(View view){
        seleccion = new String("Memoria RAM");
        if (savedInstanceState == null) {
            buscarFragment =  new BuscarFragment(seleccion);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentContainerView, buscarFragment).commit();
        }
    }

    public void buscarCaja(View view){
        seleccion = new String("Caja");
        if (savedInstanceState == null) {
            buscarFragment =  new BuscarFragment(seleccion);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentContainerView, buscarFragment).commit();
        }
    }

    public void buscarRefrig(View view){
        seleccion = new String("Refrigeración");
        if (savedInstanceState == null) {
            buscarFragment =  new BuscarFragment(seleccion);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentContainerView, buscarFragment).commit();
        }
    }

    public void buscarAlimentacion(View view){
        seleccion = new String("Alimentación");
        if (savedInstanceState == null) {
            buscarFragment =  new BuscarFragment(seleccion);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentContainerView, buscarFragment).commit();
        }
    }

    public void buscarGráfica(View view){
        seleccion = new String("Tarjeta gráfica");
        if (savedInstanceState == null) {
            buscarFragment =  new BuscarFragment(seleccion);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentContainerView, buscarFragment).commit();
        }
    }

    public void buscarAlmacenamiento(View view){
        seleccion = new String("Almacenamiento");
        if (savedInstanceState == null) {
            buscarFragment =  new BuscarFragment(seleccion);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentContainerView, buscarFragment).commit();
        }
    }

    public void buscarOS(View view){
        seleccion = new String("Sistema operativo");
        if (savedInstanceState == null) {
            buscarFragment =  new BuscarFragment(seleccion);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentContainerView, buscarFragment).commit();
        }
    }

    public void buscarMonitor(View view){
        seleccion = new String("Monitor");
        if (savedInstanceState == null) {
            buscarFragment =  new BuscarFragment(seleccion);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentContainerView, buscarFragment).commit();
        }
    }

    public void buscarTeclado(View view){
        seleccion = new String("Teclado");
        if (savedInstanceState == null) {
            buscarFragment =  new BuscarFragment(seleccion);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentContainerView, buscarFragment).commit();
        }
    }

    public void buscarRaton(View view){
        seleccion = new String("Ratón");
        if (savedInstanceState == null) {
            buscarFragment =  new BuscarFragment(seleccion);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.fragmentContainerView, buscarFragment).commit();
        }
    }

    public Presupuesto getPresupuesto() {
        return presupuesto;
    }

    public static void setPresupuesto(Presupuesto presupuesto) {
        presupuesto = presupuesto;
    }
}
