package com.buscheck.busCheckApp;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

public class VentaActivity extends AppCompatActivity {

    private Button btn;
    private String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venta);

        //Creación de Variables
        btn = findViewById(R.id.btnA1);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreateAlertDialoge();
            }
        });
    }


        /* --Agregar Color Naranja al Asiento--
        final Button seatA1 = findViewById(R.id.btnA1);

        seatA1.setOnClickListener(new View.OnClickListener() {

            Drawable background = seatA1.getBackground();

            @Override
            public void onClick(View view) {
                if (seatA1.isPressed()) {
                    seatA1.setBackgroundResource(R.drawable.button_seatorange);
                } else {
                    seatA1.setBackgroundResource(R.drawable.button_seat);
                }
            }

            ;
        });*/


        private void CreateAlertDialoge() {

            //Se crea el array con los 3 tipos de boleto y el destino de las opciones del radioButton
            final String arr[] = getResources().getStringArray(R.array.tipoBoleto);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Selecciona una Opción");
            builder.setSingleChoiceItems(R.array.tipoBoleto, -1, new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    data = arr[i];
                }
            });

            builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialog, int i) {
                    switch(data)
                    {
                        case("Normal"):
                            Intent myint=new Intent(VentaActivity.this,MenuActivity.class);
                            myint.putExtra("act1","");
                            startActivity(myint);
                            break;
                        case("Frecuente"):
                            dialog.cancel();

                    }

                }
            });

            builder.create();
            builder.show();
        }

    }


