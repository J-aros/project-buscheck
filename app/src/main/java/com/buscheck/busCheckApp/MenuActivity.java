package com.buscheck.busCheckApp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    private View opcionUno,opcionDos,opcionTres,opcionCuatro;
    TextView fechahora;
    Handler mHandler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        fechahora = (TextView) findViewById(R.id.horaTxT);

        opcionUno = (View) findViewById(R.id.opUnoview);
        opcionDos = (View) findViewById(R.id.opDosview);
        opcionTres = (View) findViewById(R.id.opTresview);
        opcionCuatro = (View) findViewById(R.id.opCuatroview);

        opcionUno.setOnClickListener(this);
        opcionDos.setOnClickListener(this);
        opcionTres.setOnClickListener(this);
        opcionCuatro.setOnClickListener(this);

        Refrescar.run();
    }

    public String fechahora() {

        Calendar c = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM YYYY, hh:mm:ss a");
        String Date = sdf.format(c.getTime());
        return Date;
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.opUnoview : i = new Intent(this,SeleccionarBusActivity.class);startActivity(i); break;
            case R.id.opDosview : i = new Intent(this,ConsultarDatosActivity.class);startActivity(i); break;
            case R.id.opTresview : i = new Intent(this,FormularioActivity.class);startActivity(i); break;
            case R.id.opCuatroview : i = new Intent(this,HistorialActivity.class);startActivity(i); break;
            default:break;
        }
    }

    public Runnable Refrescar = new Runnable() {
        @Override
        public void run() {
            fechahora.setText(fechahora());
            mHandler.postDelayed(this, 1000);
        }
    };
}