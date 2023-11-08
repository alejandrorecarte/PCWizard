package com.pcwizard;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.pcwizard.R;


public class ComponenteFragment extends Fragment {

    TextView lComponente;
    TextView lDescripcion;
    private String componente;

    public ComponenteFragment(String componente) {
        this.componente = componente;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.componente_fragment, container, false);
        lComponente = view.findViewById(R.id.lComponente);
        lDescripcion = view.findViewById(R.id.lDescripcion);

        if (lComponente != null) {
            lComponente.setText(componente);
        }

        for(int i = 0; i < MainActivity.componentes.size(); i++){
            if(componente.equals(MainActivity.componentes.get(i).getNombre())){
                if(lDescripcion != null) {
                    lDescripcion.setText(MainActivity.componentes.get(i).toString());
                }
            }
        }
        return view;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
