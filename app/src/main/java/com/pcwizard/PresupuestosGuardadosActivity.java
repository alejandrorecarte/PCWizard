package com.pcwizard;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.pcwizard.R;

import java.util.ArrayList;
import java.util.List;

public class PresupuestosGuardadosActivity extends AppCompatActivity {

    static Spinner spinner;
    static Button bAtras;
    static Button bModificar;
    static Button bEliminar;
    static TextView lDescripcionPresupuesto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.presupuestos_guardados_activity);

        spinner = findViewById(R.id.spinner);
        actualizarPresupuestos();

        bAtras = findViewById(R.id.bAtrasPresupuestosGuardados);
        bModificar = findViewById(R.id.bModificarPresupuestos);
        bEliminar = findViewById(R.id.bEliminarPresupuesto);
        lDescripcionPresupuesto = findViewById(R.id.lDescripcionPresupuesto);

        bAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String itemSeleccionado = parent.getItemAtPosition(position).toString();
                Presupuesto presupuesto = MainActivity.presupuestos.get(position);
                ArrayList<String> descripciones = new ArrayList<>();
                if(presupuesto.getPlacaBase() != null) {
                    descripciones.add(presupuesto.getPlacaBase().toString() + "\nPrecio: " + presupuesto.getPlacaBase().getVendedor().get(presupuesto.getVendedorEscogido()[0]).second);
                }else{
                    descripciones.add("No seleccionado");
                }
                if(presupuesto.getMicroprocesador() != null) {
                    descripciones.add(presupuesto.getMicroprocesador().toString() + "\nPrecio: " + presupuesto.getMicroprocesador().getVendedor().get(presupuesto.getVendedorEscogido()[1]).second);
                }else{
                    descripciones.add("No seleccionado");
                }
                if(presupuesto.getRam() != null) {
                    descripciones.add(presupuesto.getRam().toString() + "\nPrecio: " + presupuesto.getRam().getVendedor().get(presupuesto.getVendedorEscogido()[2]).second);
                }else{
                    descripciones.add("No seleccionado");
                }
                if(presupuesto.getCaja() != null) {
                    descripciones.add(presupuesto.getCaja().toString() + "\nPrecio: " + presupuesto.getCaja().getVendedor().get(presupuesto.getVendedorEscogido()[3]).second);
                }else{
                    descripciones.add("No seleccionado");
                }
                if(presupuesto.getRefrigeracion() != null) {
                    descripciones.add(presupuesto.getRefrigeracion().toString() + "\nPrecio: " + presupuesto.getCaja().getVendedor().get(presupuesto.getVendedorEscogido()[4]).second);
                }else{
                    descripciones.add("No seleccionado");
                }
                if(presupuesto.getAlimentacion() != null) {
                    descripciones.add(presupuesto.getAlimentacion().toString() + "\nPrecio: " + presupuesto.getAlimentacion().getVendedor().get(presupuesto.getVendedorEscogido()[5]).second);
                }else{
                    descripciones.add("No seleccionado");
                }
                if(presupuesto.getGrafica() != null) {
                    descripciones.add(presupuesto.getGrafica().toString() + "\nPrecio: " + presupuesto.getGrafica().getVendedor().get(presupuesto.getVendedorEscogido()[6]).second);
                }else{
                    descripciones.add("No seleccionado");
                }
                if(presupuesto.getAlmacenamiento() != null) {
                    descripciones.add(presupuesto.getAlmacenamiento().toString() + "\nPrecio: " + presupuesto.getAlmacenamiento().getVendedor().get(presupuesto.getVendedorEscogido()[7]).second);
                }else{
                    descripciones.add("No seleccionado");
                }
                if(presupuesto.getSistemaOperativo() != null) {
                    descripciones.add(presupuesto.getSistemaOperativo().toString() + "\nPrecio: " + presupuesto.getSistemaOperativo().getVendedor().get(presupuesto.getVendedorEscogido()[8]).second);
                }else{
                    descripciones.add("No seleccionado");
                }
                if(presupuesto.getMonitor() != null) {
                    descripciones.add(presupuesto.getMonitor().toString() + "\nPrecio: " + presupuesto.getMonitor().getVendedor().get(presupuesto.getVendedorEscogido()[9]).second);
                }else{
                    descripciones.add("No seleccionado");
                }
                if(presupuesto.getTeclado() != null) {
                    descripciones.add(presupuesto.getTeclado().toString() + "\nPrecio: " + presupuesto.getTeclado().getVendedor().get(presupuesto.getVendedorEscogido()[10]).second);
                }else{
                    descripciones.add("No seleccionado");
                }
                if(presupuesto.getRaton() != null) {
                    descripciones.add(presupuesto.getRaton().toString() + "\nPrecio: " + presupuesto.getRaton().getVendedor().get(presupuesto.getVendedorEscogido()[11]).second);
                }else{
                    descripciones.add("No seleccionado");
                }
                lDescripcionPresupuesto.setText("Nombre presupuesto: " + presupuesto.getNombre() +
                        "\nPrecio: " + presupuesto.getPrecioTotal() +
                        "\n\n- Placa base -\n" +
                        descripciones.get(0) +
                        "\n\n- Microprocesador -\n" +
                        descripciones.get(1) +
                        "\n\n- Memoria RAM -\n" +
                        descripciones.get(2) +
                        "\n\n- Caja -\n" +
                        descripciones.get(3) +
                        "\n\n- Refrigeración -\n" +
                        descripciones.get(4) +
                        "\n\n- Alimentación -\n" +
                        descripciones.get(5) +
                        "\n\n- Tarjeta gráfica -\n" +
                        descripciones.get(6) +
                        "\n\n- Almacenamiento -\n" +
                        descripciones.get(7) +
                        "\n\n- Sistema operativo -\n" +
                        descripciones.get(8) +
                        "\n\n- Monitor -\n" +
                        descripciones.get(9) +
                        "\n\n- Teclado -\n" +
                        descripciones.get(10) +
                        "\n\n- Ratón -\n" +
                        descripciones.get(11));
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                lDescripcionPresupuesto.setText("Seleccione un elemento primero.");
            }
        });

        bEliminar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.presupuestos.remove(MainActivity.presupuestos.remove(spinner.getSelectedItemPosition()));
                actualizarPresupuestos();
            }
        });


    }
    public void modificar(View view){
        MainActivity.presupuesto = MainActivity.presupuestos.get(spinner.getSelectedItemPosition());
        Intent intent = new Intent(this, PresupuestoActivity.class);
        startActivity(intent);
        MainActivity.presupuestos.remove(spinner.getSelectedItemPosition());
        MainActivity.presupuestos.add(MainActivity.presupuesto);
    }
    public void actualizarPresupuestos(){
        List<String> items = new ArrayList<>();

        for(int i = 0; i < MainActivity.presupuestos.size(); i++){
            items.add(MainActivity.presupuestos.get(i).getNombre());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, items);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }
}
