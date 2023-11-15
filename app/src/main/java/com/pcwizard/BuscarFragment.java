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
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

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

public class BuscarFragment extends Fragment {

    TextView lComponenteBuscar;
    Button bAtras;
    Button bBuscarBuscar;
    EditText etComponenteBuscar;
    ListView listView;
    private String seleccion;
    private ComponenteFragment componenteFragment;
    public BuscarFragment buscarFragment = this;
    public ArrayAdapter<String> adapter;

    public BuscarFragment(String seleccion) {
        this.seleccion = seleccion;
    }

    public BuscarFragment () {
        this.seleccion = "Componente";
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.buscar_fragment, container, false);


        adapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_list_item_1, actualizarBusqueda(seleccion, ""));
        adapter.notifyDataSetChanged();

        listView = view.findViewById(R.id.listBuscar);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String item = (String) adapterView.getItemAtPosition(position);
                if(item.contains(" (Chipset incompatible)")){
                    item = item.substring(0, item.length() - " (Chipset incompatible)".length());
                }
                if(item.contains(" (Memoria incompatible)")){
                    item = item.substring(0, item.length() - " (Memoria incompatible)".length());
                }
                if(item.contains(" (Potencia incompatible)")){
                    item = item.substring(0, item.length() - " (Potencia incompatible)".length());
                }
                componenteFragment = new ComponenteFragment(item, seleccion, buscarFragment);
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.fragmentContainerView, componenteFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        bBuscarBuscar = view.findViewById(R.id.bBuscarPrecios);
        etComponenteBuscar = view.findViewById(R.id.etBuscarPrecios);
        bBuscarBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter = new ArrayAdapter<>(getContext(),
                        android.R.layout.simple_list_item_1, actualizarBusqueda(seleccion, String.valueOf(etComponenteBuscar.getText())));
                adapter.notifyDataSetChanged();
                listView.setAdapter(adapter);
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

    public  ArrayList<String> actualizarBusqueda(String seleccion, String busqueda){
        ArrayList<String> items = new ArrayList<String>();

        for(int i = 0; i < MainActivity.componentes.size(); i++) {
            switch (seleccion) {
                case "Placa base":
                    if (MainActivity.componentes.get(i) instanceof PlacaBase) {
                        String componente = MainActivity.componentes.get(i).getNombre();
                        if(PresupuestoActivity.getPresupuesto().getMemoria() != null &&
                                PresupuestoActivity.getPresupuesto().getMemoria() != ((PlacaBase) MainActivity.componentes.get(i)).getMemoria()){
                            componente += " (Memoria incompatible)";
                        }
                        if (PresupuestoActivity.getPresupuesto().getChipset() != null &&
                                PresupuestoActivity.getPresupuesto().getChipset() != ((PlacaBase) MainActivity.componentes.get(i)).getChipset()){
                            componente += " (Chipset incompatible)";
                        }
                        items.add(componente);
                    }
                    break;
                case "Microprocesador":
                    if (MainActivity.componentes.get(i) instanceof Microprocesador) {
                        String componente = MainActivity.componentes.get(i).getNombre();
                        if(PresupuestoActivity.getPresupuesto().getMemoria() != null &&
                                PresupuestoActivity.getPresupuesto().getMemoria() != ((Microprocesador) MainActivity.componentes.get(i)).getMemoria()){
                            componente += " (Memoria incompatible)";
                        }
                        if (PresupuestoActivity.getPresupuesto().getChipset() != null &&
                                PresupuestoActivity.getPresupuesto().getChipset() != ((Microprocesador) MainActivity.componentes.get(i)).getChipset()){
                            componente += " (Chipset incompatible)";
                        }
                        items.add(componente);
                    }
                    break;
                case "Memoria RAM":
                    if (MainActivity.componentes.get(i) instanceof RAM) {
                        String componente = MainActivity.componentes.get(i).getNombre();
                        if(PresupuestoActivity.getPresupuesto().getMemoria() != null &&
                                PresupuestoActivity.getPresupuesto().getMemoria() != ((RAM) MainActivity.componentes.get(i)).getMemoria()) {
                            componente += " (Memoria incompatible)";
                        }
                        items.add(componente);
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
                        String componente = MainActivity.componentes.get(i).getNombre();
                        if(PresupuestoActivity.getPresupuesto().getPotenciaNecesitada() != -1 &&
                                PresupuestoActivity.getPresupuesto().getPotenciaNecesitada() > ((Alimentacion) MainActivity.componentes.get(i)).getPotencia()){
                            componente += " (Potencia incompatible)";
                        }
                        items.add(componente);
                    }
                    break;
                case "Tarjeta gráfica":
                    if (MainActivity.componentes.get(i) instanceof Grafica) {
                        String componente = MainActivity.componentes.get(i).getNombre();
                        if(PresupuestoActivity.getPresupuesto().getPotenciaAlimentada() != -1 &&
                                PresupuestoActivity.getPresupuesto().getPotenciaAlimentada() < ((Grafica) MainActivity.componentes.get(i)).getPotencia()){
                            componente += " (Potencia incompatible)";}
                        items.add(componente);
                    }
                    break;
                case "Almacenamiento":
                    if (MainActivity.componentes.get(i) instanceof Almacenamiento) {
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
                case "Componente":
                    if (MainActivity.componentes.get(i) instanceof Componente){
                        items.add(MainActivity.componentes.get(i).getNombre());
                    }
            }
        }

        for(int i = 0; i < items.size(); i++){
            if(!items.get(i).contains(busqueda)){
                items.remove(i);
            }
        }

        return items;
    }
}