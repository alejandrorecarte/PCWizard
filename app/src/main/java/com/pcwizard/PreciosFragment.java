package com.pcwizard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.example.pcwizard.R;
import com.pcwizard.Componente.Componente;
import com.pcwizard.Componente.Componentes.Alimentacion;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PreciosFragment extends Fragment {

    TextView lComponentePrecios;
    Button bAtras;
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

        ArrayList<String> items = new ArrayList<String>();

        for(int i = 0; i < componente.getVendedor().size(); i++){
            items.add(componente.getVendedor().get(i).first + ": " + componente.getVendedor().get(i).second + "€");
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_list_item_1, items);

        ListView listView = view.findViewById(R.id.listPrecios);
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
                        }
                        if (componente instanceof Microprocesador) {
                            p.setMicroprocesador((Microprocesador) componente);                        }
                        if (componente instanceof RAM) {
                            p.setRam((RAM) componente);                        }
                        if (componente instanceof Caja) {
                            p.setCaja((Caja) componente);                        }
                        if (componente instanceof Refrigeracion) {
                            p.setRefrigeracion((Refrigeracion) componente);                        }
                        if (componente instanceof Alimentacion) {
                            p.setAlimentacion((Alimentacion) componente);                        }
                        if (componente instanceof Grafica) {
                            p.setGrafica((Grafica) componente);                        }
                        if (componente instanceof SistemaOperativo) {
                            p.setSistemaOperativo((SistemaOperativo) componente);                        }
                        if (componente instanceof Monitor) {
                            p.setMonitor((Monitor) componente);                        }
                        if (componente instanceof Teclado) {
                            p.setTeclado((Teclado) componente);                        }
                        if (componente instanceof Raton) {
                            p.setRaton((Raton) componente);
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
        return view;
    }
    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}