package com.buscheck.busCheckApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    private View opcionUno,opcionDos,opcionTres,opcionCuatro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        opcionUno = (View) findViewById(R.id.opUnoview);
        opcionDos = (View) findViewById(R.id.opDosview);
        opcionTres = (View) findViewById(R.id.opTresview);
        opcionCuatro = (View) findViewById(R.id.opCuatroview);

        opcionUno.setOnClickListener(this);
        opcionDos.setOnClickListener(this);
        opcionTres.setOnClickListener(this);
        opcionCuatro.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.opUnoview : i = new Intent(this,VentaActivity.class); break;
            case R.id.opDosview : i = new Intent(this,VentaActivity.class); break;
            case R.id.opTresview : i = new Intent(this,FormularioActivity.class); break;
            case R.id.opCuatroview : i = new Intent(this,FormularioActivity.class); break;
            default:break;
        }
    }
}