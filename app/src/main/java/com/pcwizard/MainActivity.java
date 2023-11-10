package com.pcwizard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;

import com.example.pcwizard.R;
import com.pcwizard.Componente.*;
import com.pcwizard.Componente.Componentes.Enumerados.Chipset;
import com.pcwizard.Componente.Componentes.Enumerados.Memoria;
import com.pcwizard.Componente.Componentes.Microprocesador;
import com.pcwizard.Componente.Componentes.PlacaBase;
import com.pcwizard.Componente.Componentes.RAM;

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
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 96.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 99.99));
        componentes.add(new PlacaBase("Asus TUF GAMING B550-PLUS Intel", Memoria.DDR5, Chipset.INTEL));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 96.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 99.99));
        componentes.add(new Microprocesador("AMD Ryzen 7 5700G 4.6GHz",4.6, 8, 16, Memoria.DDR4, Chipset.AMD));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 339.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 349.99));
        componentes.add(new Microprocesador("Intel Core i7-13700KF 3.4 GHz",3.4, 16, 24, Memoria.DDR5, Chipset.INTEL));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 389.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 399.99));
        componentes.add(new RAM("Corsair Vengeance DDR5 6200MHz 32GB 2x16GB CL36",32, 6300, 36, Memoria.DDR5));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 132.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 134.99));
        componentes.add(new RAM("Corsair Vengeance DDR4 6200MHz 32GB 2x16GB CL36",32, 6300, 36, Memoria.DDR4));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("PC Componentes", 132.99));
        componentes.get(componentes.size()-1).getVendedor().add(new Pair<>("MediaMarkt", 134.99));

    }

    public void nuevoPresupuesto (View view){
        presupuesto = new Presupuesto();
        Intent intent = new Intent(this, PresupuestoActivity.class);
        startActivity(intent);
        presupuestos.add(presupuesto);
    }

    public void misPresupuestos(View view){
        Intent intent = new Intent(this, PresupuestosGuardadosActivity.class);
        startActivity(intent);
    }
}