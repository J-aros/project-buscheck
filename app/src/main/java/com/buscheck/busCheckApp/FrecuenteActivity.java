package com.buscheck.busCheckApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FrecuenteActivity extends AppCompatActivity {

    Button vender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frecuente);

        vender = findViewById(R.id.venderBtn);
        vender.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FrecuenteActivity.this, VentaActivity.class);
                startActivity(intent);

            }
        });

    }
}