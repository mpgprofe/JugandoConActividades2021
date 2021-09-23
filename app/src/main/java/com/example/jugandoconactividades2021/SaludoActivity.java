package com.example.jugandoconactividades2021;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SaludoActivity extends AppCompatActivity {
Button volver;
TextView saludo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saludo);
        Intent intent = getIntent();

        saludo = findViewById(R.id.textViewSaludo);

        String nombre = intent.getStringExtra(MainActivity.NOMBRE);

        saludo.setText("Hola "+nombre);


        volver = findViewById(R.id.buttonVolver);
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText numero = findViewById(R.id.editTextNumero);
                Intent intento  = new Intent();
                intento.putExtra(MainActivity.NUMERO, numero.getText().toString());
                setResult(RESULT_OK, intento);
                finish();
            }
        });

    }
}