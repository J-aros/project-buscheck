package com.buscheck.busCheckApp;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FinalizarVentaActivity extends AppCompatActivity {

    Button btnFinalizar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finalizar_venta);

        btnFinalizar = (Button) findViewById(R.id.enviarBtn2);
        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateAlertDialoge();
            }
        });
    }

    private void CreateAlertDialoge() {
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("¿Está realmente seguro?");
        builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int a) {

                Intent i = new Intent(FinalizarVentaActivity.this, MenuActivity.class);
                startActivity(i);
            }
        });
        builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(FinalizarVentaActivity.this, "Verifique sus Datos", Toast.LENGTH_SHORT).show();
            }
        });
        builder.create();
        builder.show();
    }

}