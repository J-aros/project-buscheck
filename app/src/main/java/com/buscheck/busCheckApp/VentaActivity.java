package com.buscheck.busCheckApp;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VentaActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venta);

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
        });
    }
}
