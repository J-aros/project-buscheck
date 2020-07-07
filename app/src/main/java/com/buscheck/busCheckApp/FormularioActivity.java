package com.buscheck.busCheckApp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class FormularioActivity extends AppCompatActivity {

    ImageButton volver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_formulario);

        volver = (ImageButton) findViewById(R.id.backBtnForm);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FormularioActivity.this, MenuActivity.class);
                startActivity(intent);

            }
        });


    }


    public void onRadioButtonClick(View view){
        RadioGroup radioGroup=findViewById(R.id.radioGroup);
        RadioButton radioButton=findViewById(radioGroup.getCheckedRadioButtonId());
        Toast.makeText(this, radioButton.getText()+"seleccionado", Toast.LENGTH_SHORT).show();

    }
}
