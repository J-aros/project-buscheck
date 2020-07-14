package com.buscheck.busCheckApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button entrarBtn;
    TextView ayudaTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        entrarBtn = (Button) findViewById(R.id.entrarBtn);
        entrarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, TutorialActivity.class);
                startActivity(intent);

            }
        });

        ayudaTxt = (TextView)findViewById(R.id.ayudaTxt);
        ayudaTxt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent registroUsuario = new Intent(MainActivity.this, AyudaActivity.class);
                startActivity(registroUsuario);
            }
        });
    }
}
