package com.pcwizard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.pcwizard.R;
import com.pcwizard.Componente.Componente;
import com.pcwizard.Componente.Componentes.Alimentacion;
import com.pcwizard.Componente.Componentes.Almacenamiento;
import com.pcwizard.Componente.Componentes.Caja;
import com.pcwizard.Componente.Componentes.Grafica;
import com.pcwizard.Componente.Componentes.Microprocesador;
import com.pcwizard.Componente.Componentes.Monitor;
import com.pcwizard.Componente.Componentes.PlacaBase;
import com.pcwizard.Componente.Componentes.RAM;
import com.pcwizard.Componente.Componentes.Raton;
import com.pcwizard.Componente.Componentes.Refrigeracion;
import com.pcwizard.Componente.Componentes.SistemaOperativo;
import com.pcwizard.Componente.Componentes.Teclado;

import java.util.ArrayList;

public class PreciosFragment extends Fragment {

    private TextView lComponentePrecios;
    private Button bAtras;
    private Button bBuscarPrecios;
    private EditText etBuscarPrecios;
    private ArrayAdapter<String> adapter;
    private ListView listView;
    private Componente componente;
    private ComponenteFragment componenteFragment;
    public PreciosFragment preciosFragment = this;

    public PreciosFragment(Componente componente, ComponenteFragment componenteFragment) {
        this.componente = componente;
        this.componenteFragment = componenteFragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.precios_fragment, container, false);

        adapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_list_item_1, actualizarBusqueda(componente, ""));

        listView = view.findViewById(R.id.listBuscar);
        listView.setAdapter(adapter);

        listView.setAdapter(adapter);

        lComponentePrecios = view.findViewById(R.id.lComponentePrecios);
        if(lComponentePrecios != null) {
            lComponentePrecios.setText(componenteFragment.componente);
        }
        bAtras = view.findViewById(R.id.bAtrasPrecios);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String item = (String) adapterView.getItemAtPosition(position);
                Presupuesto p = PresupuestoActivity.getPresupuesto();
                        if (componente instanceof PlacaBase) {
                            p.setPlacaBase((PlacaBase) componente);
                            PresupuestoActivity.getPresupuesto().setVendedorEscogido(position, 0);
                        }
                        if (componente instanceof Microprocesador) {
                            p.setMicroprocesador((Microprocesador) componente);
                            PresupuestoActivity.getPresupuesto().setVendedorEscogido(position, 1);
                        }
                        if (componente instanceof RAM) {
                            p.setRam((RAM) componente);
                            PresupuestoActivity.getPresupuesto().setVendedorEscogido(position, 2);
                        }
                        if (componente instanceof Caja) {
                            p.setCaja((Caja) componente);
                            PresupuestoActivity.getPresupuesto().setVendedorEscogido(position, 3);
                        }
                        if (componente instanceof Refrigeracion) {
                            p.setRefrigeracion((Refrigeracion) componente);
                            PresupuestoActivity.getPresupuesto().setVendedorEscogido(position, 4);
                        }
                        if (componente instanceof Alimentacion) {
                            p.setAlimentacion((Alimentacion) componente);
                            PresupuestoActivity.getPresupuesto().setVendedorEscogido(position, 5);
                        }
                        if (componente instanceof Grafica) {
                            p.setGrafica((Grafica) componente);
                            PresupuestoActivity.getPresupuesto().setVendedorEscogido(position, 6);
                        }
                        if (componente instanceof Almacenamiento) {
                            p.setAlmacenamiento((Almacenamiento) componente);
                            PresupuestoActivity.getPresupuesto().setVendedorEscogido(position, 7);
                        }
                        if (componente instanceof SistemaOperativo) {
                            p.setSistemaOperativo((SistemaOperativo) componente);
                            PresupuestoActivity.getPresupuesto().setVendedorEscogido(position, 8);
                        }
                        if (componente instanceof Monitor) {
                            p.setMonitor((Monitor) componente);
                            PresupuestoActivity.getPresupuesto().setVendedorEscogido(position, 9);
                        }
                        if (componente instanceof Teclado) {
                            p.setTeclado((Teclado) componente);
                            PresupuestoActivity.getPresupuesto().setVendedorEscogido(position, 10);
                        }
                        if (componente instanceof Raton) {
                            p.setRaton((Raton) componente);
                            PresupuestoActivity.getPresupuesto().setVendedorEscogido(position, 11);
                        }
                PresupuestoActivity.actualizarDatos();
                requireActivity().getSupportFragmentManager().beginTransaction().remove(preciosFragment).commit();
            }
        });

        bAtras = view.findViewById(R.id.bAtrasPrecios);
        bAtras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (requireActivity().getSupportFragmentManager().getBackStackEntryCount() > 0) {
                    requireActivity().getSupportFragmentManager().popBackStack();
                } else {
                    requireActivity().onBackPressed();
                }
            }
        });

        bBuscarPrecios = view.findViewById(R.id.bBuscarPrecios);
        etBuscarPrecios = view.findViewById(R.id.etBuscarPrecios);
        bBuscarPrecios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter = new ArrayAdapter<>(getContext(),
                        android.R.layout.simple_list_item_1, actualizarBusqueda(componente, String.valueOf(etBuscarPrecios.getText())));
                adapter.notifyDataSetChanged();
                listView.setAdapter(adapter);
            }
        });
        return view;
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public ArrayList<String> actualizarBusqueda(Componente componente, String busqueda){
        ArrayList<String> items = new ArrayList<String>();
        for(int i = 0; i < componente.getVendedor().size(); i++){
            items.add(componente.getVendedor().get(i).first + ": " + componente.getVendedor().get(i).second + "€");
        }

        for(int i = 0; i < items.size(); i++){
            if(!items.get(i).contains(busqueda)){
                items.remove(i);
            }
        }
        return items;
    }
}