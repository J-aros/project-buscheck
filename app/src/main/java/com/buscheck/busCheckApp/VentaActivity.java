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

            Drawable background = btn.getBackground();

            @Override
            public void onClick(View v) {
            /*    if (btn.isPressed()) {
                    btn.setBackgroundResource(R.drawable.button_seatorange);
                } else {
                    btn.setBackgroundResource(R.drawable.button_seat);
                }*/
                CreateAlertDialoge();
            }
        });
    }


        //--Agregar Color Naranja al Asiento--



        private void CreateAlertDialoge() {

            //Se crea el array con los 3 tipos de boleto y el destino de las opciones del radioButton
            final String arr[] = getResources().getStringArray(R.array.tipoBoleto);
            AlertDialog.Builder builder = new AlertDialog.Builder(this);
            builder.setTitle("Selecciona una Opción");
            builder.setSingleChoiceItems(R.array.tipoBoleto, 0, new DialogInterface.OnClickListener() {
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
                            Intent op1=new Intent(VentaActivity.this,NormalActivity.class);
                            op1.putExtra("act1","");
                            startActivity(op1);
                            break;
                        case("Frecuente"):
                            Intent op2=new Intent(VentaActivity.this,FrecuenteActivity.class);
                            op2.putExtra("act2","");
                            startActivity(op2);
                            break;
                        case("Estudiante"):
                            Intent op3=new Intent(VentaActivity.this,EstudianteActivity.class);
                            op3.putExtra("act3","");
                            startActivity(op3);
                            break;
                        default:
                            dialog.cancel();
                    }

                }
            });

            AlertDialog alert = builder.create();
            alert.show();
        }

    }


