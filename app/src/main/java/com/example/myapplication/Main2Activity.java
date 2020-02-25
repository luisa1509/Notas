package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;
import android.content.Intent;

public class Main2Activity extends AppCompatActivity {
    private TextView TextCalificaciones;
    private EditText EditParcial1;
    private EditText EditParcial2;
    private EditText EditTaller1;
    private EditText EditTaller2;
    private EditText EditQuizt;
    private EditText EditQuizp;
    private EditText EditEjericicios;
    private EditText EditFinal;
    private Button BotonVerificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextCalificaciones = findViewById(R.id.TextCalificaciones);
        EditParcial1 = findViewById(R.id.EditParcial1);
        EditParcial2 = findViewById(R.id.EditParcial2);
        EditTaller1 = findViewById(R.id.EditTaller1);
        EditTaller2 = findViewById(R.id.EditTaller2);
        EditQuizt = findViewById(R.id.EditQuizt);
        EditQuizp = findViewById(R.id.EditQuizp);
        EditEjericicios = findViewById(R.id.EditEjercicios);
        EditFinal = findViewById(R.id.EditFinal);
        BotonVerificar = findViewById(R.id.BotonVerificar);

        BotonVerificar.setOnClickListener(
                (v) -> {

                    String valor1 = EditParcial1.getText().toString();
                    double valoruno = Double.parseDouble(valor1);

                    String valor2 = EditParcial2.getText().toString();
                    double valordos = Double.parseDouble(valor2);

                    String valor3 = EditTaller1.getText().toString();
                    double valortres = Double.parseDouble(valor3);

                    String valor4 = EditTaller2.getText().toString();
                    double valorcuatro = Double.parseDouble(valor4);

                    String valor5 = EditQuizt.getText().toString();
                    double valorcinco = Double.parseDouble(valor5);

                    String valor6 = EditQuizp.getText().toString();
                    double valorseis = Double.parseDouble(valor6);

                    String valor7 = EditEjericicios.getText().toString();
                    double valorsiete = Double.parseDouble(valor7);

                    String valor8 = EditFinal.getText().toString();
                    double valorocho = Double.parseDouble(valor8);

                    double resul1 = (valoruno*15)/100;
                    


                }
        );
    }
}
