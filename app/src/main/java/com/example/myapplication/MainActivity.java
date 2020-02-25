package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {
    private TextView TextRegistro;
    private EditText Nombre;
    private Button Entrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextRegistro = findViewById(R.id.TextRegistro);
        Nombre = findViewById(R.id.Nombre);
        Entrar = findViewById(R.id.Entrar);


        Entrar.setOnClickListener(
                (v) -> {
                    String name = Nombre.getText().toString();
                    TextRegistro.setText(name);
                    Intent i = new Intent(MainActivity.this, Main2Activity.class);
                    i.putExtra("Nombre", name);
                    startActivity(i);
                }
        );

    }
}
