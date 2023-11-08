package com.pcwizard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pcwizard.R;
import com.pcwizard.Componente.*;
import com.pcwizard.Componente.Componentes.Enumerados.Chipset;
import com.pcwizard.Componente.Componentes.Enumerados.Memoria;
import com.pcwizard.Componente.Componentes.PlacaBase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    
    public static ArrayList<Presupuesto> presupuestos = new ArrayList<Presupuesto>();
    public static ArrayList<Componente> componentes = new ArrayList<>();
    public static Presupuesto presupuesto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        componentes.add(new PlacaBase("Asus TUF GAMING B550-PLUS AMD", Memoria.DDR4, Chipset.AMD));
        componentes.add(new PlacaBase("Asus TUF GAMING B550-PLUS Intel", Memoria.DDR4, Chipset.INTEL));
    }

    public void nuevoPresupuesto (View view){
        presupuesto = new Presupuesto();
        Intent intent = new Intent(this, PresupuestoActivity.class);
        startActivity(intent);
        presupuestos.add(presupuesto);
    }
}