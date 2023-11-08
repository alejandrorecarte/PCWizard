package com.pcwizard;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.pcwizard.R;

import java.util.ArrayList;

public class BuscarFragment extends Fragment {

    public BuscarFragment() {
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.buscar_fragment, container, false);

        // Aquí está tu lista de elementos predefinidos
        ArrayList<String> items = new ArrayList<>();
        items.add("Elemento 1");
        items.add("Elemento 2");
        items.add("Elemento 3");
        items.add("Elemento 4");
        items.add("Elemento 5");

        // Configura el adaptador para la lista de elementos
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getContext(),
                android.R.layout.simple_list_item_1, items);

        // Encuentra el ListView en tu layout y configura el adaptador
        ListView listView = view.findViewById(R.id.list_view);
        listView.setAdapter(adapter);

        return view;
    }
}