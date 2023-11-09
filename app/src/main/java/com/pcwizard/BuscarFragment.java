package com.pcwizard;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import com.example.pcwizard.R;
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

public class BuscarFragment extends Fragment {

    TextView lComponenteBuscar;
    Button bAtras;
    private String seleccion;
    private ComponenteFragment componenteFragment;
    public BuscarFragment buscarFragment = this;

    public BuscarFragment(String seleccion) {
        this.seleccion = seleccion;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.buscar_fragment, container, false);

        ArrayList<String> items = new ArrayList<String>();

        for(int i = 0; i < MainActivity.componentes.size(); i++) {
            switch (seleccion) {
                case "Placa base":
                    if (MainActivity.componentes.get(i) instanceof PlacaBase) {
                        items.add(MainActivity.componentes.get(i).getNombre());
                    }
                    break;
                case "Microprocesador":
                    if (MainActivity.componentes.get(i) instanceof Microprocesador) {
                        items.add(MainActivity.componentes.get(i).getNombre());
                    }
                    break;
                case "Memoria RAM":
                    if (MainActivity.componentes.get(i) instanceof RAM) {
                        items.add(MainActivity.componentes.get(i).getNombre());
                    }
                    break;
                case "Caja":
                    if (MainActivity.componentes.get(i) instanceof Caja) {
                        items.add(MainActivity.componentes.get(i).getNombre());
                    }
                    break;
                case "Refrigeración":
                    if (MainActivity.componentes.get(i) instanceof Refrigeracion) {
                        items.add(MainActivity.componentes.get(i).getNombre());
                    }
                    break;
                case "Alimentación":
                    if (MainActivity.componentes.get(i) instanceof Alimentacion) {
                        items.add(MainActivity.componentes.get(i).getNombre());
                    }
                    break;
                case "Tarejeta Gráfica":
                    if (MainActivity.componentes.get(i) instanceof Grafica) {
                        items.add(MainActivity.componentes.get(i).getNombre());
                    }
                    break;
                case "Sistema operativo":
                    if (MainActivity.componentes.get(i) instanceof SistemaOperativo) {
                        items.add(MainActivity.componentes.get(i).getNombre());
                    }
                    break;
                case "Monitor":
                    if (MainActivity.componentes.get(i) instanceof Monitor) {
                        items.add(MainActivity.componentes.get(i).getNombre());
                    }
                    break;
                case "Teclado":
                    if (MainActivity.componentes.get(i) instanceof Teclado) {
                        items.add(MainActivity.componentes.get(i).getNombre());
                    }
                    break;
                case "Ratón":
                    if (MainActivity.componentes.get(i) instanceof Raton) {
                        items.add(MainActivity.componentes.get(i).getNombre());
                    }
                    break;
            }
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_list_item_1, items);

        ListView listView = view.findViewById(R.id.listPrecios);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String item = (String) adapterView.getItemAtPosition(position);
                componenteFragment = new ComponenteFragment(item, seleccion, buscarFragment);
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.fragmentContainerView, componenteFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        lComponenteBuscar = view.findViewById(R.id.lComponenteBuscar);
        lComponenteBuscar.setText(seleccion);
        bAtras = view.findViewById(R.id.bAtrasPrecios);

        if(bAtras != null) {
            bAtras.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    requireActivity().getSupportFragmentManager().beginTransaction().remove(buscarFragment).commit();
                }
            });
        }
    }
}