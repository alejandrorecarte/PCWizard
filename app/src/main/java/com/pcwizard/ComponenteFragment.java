package com.pcwizard;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.pcwizard.R;
import com.pcwizard.Componente.Componente;


public class ComponenteFragment extends Fragment {

    TextView lComponente;
    Button bAtras;
    TextView lDescripcion;
    ImageView iComponente;
    public String componente;
    public String seleccion;
    private Componente componenteSeleccionado;
    public BuscarFragment buscarFragment;
    public ComponenteFragment componenteFragment = this;

    public ComponenteFragment(String componente, String seleccion, BuscarFragment buscarFragment) {
        this.componente = componente;
        this.seleccion = seleccion;
        this.buscarFragment = buscarFragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.componente_fragment, container, false);
        lComponente = view.findViewById(R.id.lComponente);
        lDescripcion = view.findViewById(R.id.lDescripcion);
        iComponente = view.findViewById(R.id.iComponente);

        if (lComponente != null) {
            lComponente.setText(componente);
        }

        for(int i = 0; i < MainActivity.componentes.size(); i++){
            if(componente.equals(MainActivity.componentes.get(i).getNombre())){
                if(lDescripcion != null) {
                    lDescripcion.setText(MainActivity.componentes.get(i).toString());
                    componenteSeleccionado = MainActivity.componentes.get(i);
                }
                if(iComponente != null) {
                    iComponente.setImageResource(componenteSeleccionado.getIdImagen());
                }
            }
        }

        bAtras = view.findViewById(R.id.bAtrasComp);
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

        Button bCompararPrecios = view.findViewById(R.id.bCompararPrecios);

        bCompararPrecios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PreciosFragment fragmentB = new PreciosFragment(componenteSeleccionado, componenteFragment);
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragmentContainerView, fragmentB);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;
    }


    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }
}
