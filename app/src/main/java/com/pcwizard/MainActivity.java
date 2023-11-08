package com.pcwizard;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.pcwizard.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    
    public static ArrayList<Presupuesto> presupuestos = new ArrayList<Presupuesto>();
    public static Presupuesto presupuesto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nuevoPresupuesto (View view){
        presupuesto = new Presupuesto();
        Intent intent = new Intent(this, PresupuestoActivity.class);
        startActivity(intent);
        presupuestos.add(presupuesto);
    }
}