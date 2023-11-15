package com.pcwizard;


import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pcwizard.R;
import com.google.android.material.internal.TextWatcherAdapter;
import com.pcwizard.Componente.Componente;
import com.pcwizard.Componente.Componentes.Refrigeracion;


public class PresupuestoActivity extends AppCompatActivity {

    private Bundle savedInstanceState;
    Button bAtras;
    static EditText etNombrePresupuesto;
    static TextView lChPlacaBase;
    static TextView lChMicroprocesador;
    static TextView lChRAM;
    static TextView lChCaja;
    static TextView lChRefrig;
    static TextView lChAlimentacion;
    static TextView lChGrafica;
    static TextView lChAlmacenamiento;
    static TextView lChOS;
    static TextView lChMonitor;
    static TextView lChTeclado;
    static TextView lChRaton;

    static TextView lPrPlacaBase;
    static TextView lPrMicroprocesador;
    static TextView lPrRAM;
    static TextView lPrCaja;
    static TextView lPrRefrig;
    static TextView lPrAlimentacion;
    static TextView lPrGrafica;
    static TextView lPrAlmacenamiento;
    static TextView lPrOS;
    static TextView lPrMonitor;
    static TextView lPrTeclado;
    static TextView lPrRaton;
    static TextView lPrecioPresupuesto;
    private static Presupuesto presupuesto;
    private BuscarFragment buscarFragment;
    private String seleccion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.savedInstanceState = savedInstanceState;
        setContentView(R.layout.presupuesto_activity);

        bAtras = findViewById(R.id.bAtras);
        etNombrePresupuesto = findViewById(R.id.etNombrePresupuesto);
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
        lPrPlacaBase = findViewById(R.id.lPrPlacaBase);
        lPrMicroprocesador = findViewById(R.id.lPrMicroprocesador);
        lPrRAM = findViewById(R.id.lPrRAM);
        lPrCaja = findViewById(R.id.lPrCaja);
        lPrRefrig = findViewById(R.id.lPrRefrig);
        lPrAlimentacion = findViewById(R.id.lPrAlimentacion);
        lPrGrafica = findViewById(R.id.lPrGrafica);
        lPrAlmacenamiento = findViewById(R.id.lPrAlmacenamiento);
        lPrOS = findViewById(R.id.lPrOS);
        lPrMonitor = findViewById(R.id.lPrMonitor);
        lPrTeclado = findViewById(R.id.lPrTeclado);
        lPrRaton = findViewById(R.id.lPrRaton);
        lPrecioPresupuesto = findViewById(R.id.lPrecioPresupuesto);


        this.presupuesto = MainActivity.presupuesto;
        actualizarDatos();

        etNombrePresupuesto.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                presupuesto.setNombre(String.valueOf(etNombrePresupuesto.getText()));
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                presupuesto.setNombre(String.valueOf(etNombrePresupuesto.getText()));
            }

            @Override
            public void afterTextChanged(Editable s) {
                presupuesto.setNombre(String.valueOf(etNombrePresupuesto.getText()));
            }
        });
    }

    public void guardar(View view){
        if(String.valueOf(etNombrePresupuesto.getText()).equals("")){
            etNombrePresupuesto.setText("Presupuesto " + MainActivity.presupuestos.size());
        }
        finish();
        Toast.makeText(this, "Se ha guardado el presupuesto "+String.valueOf(etNombrePresupuesto.getText()), Toast.LENGTH_SHORT).show();
    }

    public void atras (View view){
        MainActivity.presupuestos.remove(presupuesto);
        finish();
    }

    public static void actualizarDatos(){
        if(presupuesto.getNombre() != null){
            etNombrePresupuesto.setText(presupuesto.getNombre());
        }else{
            etNombrePresupuesto.setText("");
            etNombrePresupuesto.setHint("Sin nombre");
        }
        if(presupuesto.getPlacaBase() != null) {
            lChPlacaBase.setText(presupuesto.getPlacaBase().getNombre());
            lPrPlacaBase.setText("Precio: "+ presupuesto.getPlacaBase().getVendedor().get(presupuesto.getVendedorEscogido()[0]).second + "€");
        }else{
            lChPlacaBase.setText("No seleccionado");
            lPrPlacaBase.setText("0.0€");
        }
        if(presupuesto.getMicroprocesador() != null) {
            lChMicroprocesador.setText(presupuesto.getMicroprocesador().getNombre());
            lPrMicroprocesador.setText("Precio: "+ presupuesto.getMicroprocesador().getVendedor().get(presupuesto.getVendedorEscogido()[1]).second + "€");
        }else{
            lChMicroprocesador.setText("No seleccionado");
            lPrMicroprocesador.setText("0.0€");
        }
        if(presupuesto.getRam() != null) {
            lChRAM.setText(presupuesto.getRam().getNombre());
            lPrRAM.setText("Precio: "+ presupuesto.getRam().getVendedor().get(presupuesto.getVendedorEscogido()[2]).second + "€");
        }else{
            lChRAM.setText("No seleccionado");
            lPrRAM.setText("0.0€");
        }
        if(presupuesto.getCaja() != null) {
            lChCaja.setText(presupuesto.getCaja().getNombre());
            lPrCaja.setText("Precio: "+ presupuesto.getCaja().getVendedor().get(presupuesto.getVendedorEscogido()[3]).second + "€");
        }else{
            lChCaja.setText("No seleccionado");
            lPrCaja.setText("0.0€");
        }
        if(presupuesto.getRefrigeracion() != null) {
            lChRefrig.setText(presupuesto.getRefrigeracion().getNombre());
            lPrRefrig.setText("Precio: "+ presupuesto.getRefrigeracion().getVendedor().get(presupuesto.getVendedorEscogido()[4]).second + "€");
        }else{
            lChRefrig.setText("No seleccionado");
            lPrRefrig.setText("0.0€");
        }
        if(presupuesto.getAlimentacion() != null) {
            lChAlimentacion.setText(presupuesto.getAlimentacion().getNombre());
            lPrAlimentacion.setText("Precio: "+ presupuesto.getAlimentacion().getVendedor().get(presupuesto.getVendedorEscogido()[5]).second + "€");
        }else{
            lChAlimentacion.setText("No seleccionado");
            lPrAlimentacion.setText("0.0€");
        }
        if(presupuesto.getGrafica() != null) {
            lChGrafica.setText(presupuesto.getGrafica().getNombre());
            lPrGrafica.setText("Precio: "+ presupuesto.getGrafica().getVendedor().get(presupuesto.getVendedorEscogido()[6]).second + "€");
        }else{
            lChGrafica.setText("No seleccionado");
            lPrGrafica.setText("0.0€");
        }
        if(presupuesto.getAlmacenamiento() != null) {
            lChAlmacenamiento.setText(presupuesto.getAlmacenamiento().getNombre());
            lPrAlmacenamiento.setText("Precio: "+ presupuesto.getAlmacenamiento().getVendedor().get(presupuesto.getVendedorEscogido()[7]).second + "€");
        }else{
            lChAlmacenamiento.setText("No seleccionado");
            lPrAlmacenamiento.setText("0.0€");
        }
        if(presupuesto.getSistemaOperativo() != null) {
            lChOS.setText(presupuesto.getSistemaOperativo().getNombre());
            lPrOS.setText("Precio: "+ presupuesto.getSistemaOperativo().getVendedor().get(presupuesto.getVendedorEscogido()[8]).second + "€");

        }else{
            lChOS.setText("No seleccionado");
            lPrOS.setText("0.0€");
        }
        if(presupuesto.getMonitor() != null) {
            lChMonitor.setText(presupuesto.getMonitor().getNombre());
            lPrMonitor.setText("Precio: "+ presupuesto.getMonitor().getVendedor().get(presupuesto.getVendedorEscogido()[9]).second + "€");
        }else{
            lChMonitor.setText("No seleccionado");
            lPrMonitor.setText("0.0€");
        }
        if(presupuesto.getTeclado() != null) {
            lChTeclado.setText(presupuesto.getTeclado().getNombre());
            lPrTeclado.setText("Precio: "+ presupuesto.getTeclado().getVendedor().get(presupuesto.getVendedorEscogido()[10]).second + "€");
        }else{
            lChTeclado.setText("No seleccionado");
            lPrTeclado.setText("0.0€");
        }
        if(presupuesto.getRaton() != null) {
            lChRaton.setText(presupuesto.getRaton().getNombre());
            lPrRaton.setText("Precio: "+ presupuesto.getRaton().getVendedor().get(presupuesto.getVendedorEscogido()[11]).second + "€");
        }else{
            lChRaton.setText("No seleccionado");
            lPrRaton.setText("0.0€");
        }

        if(presupuesto != null) {
            lPrecioPresupuesto.setText(presupuesto.getPrecioTotal() + "€");
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
            buscarFragment =  new BuscarFragment(seleccion);
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
        Componente componente = new Refrigeracion();
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

    public static Presupuesto getPresupuesto() {
        return presupuesto;
    }

    public static void setPresupuesto(Presupuesto presupuesto) {
        presupuesto = presupuesto;
    }
}
