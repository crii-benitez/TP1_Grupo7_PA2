package com.example.tp1_grupo7_pa2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio1Activity extends AppCompatActivity {

    EditText etPrimerNumero;
    EditText etSegundoNumero;
    TextView tvResultado;
    Button btnCalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_ejercicio1);

        etPrimerNumero = findViewById(R.id.etPrimerNumero);
        etSegundoNumero = findViewById(R.id.etSegundoNumero);
        tvResultado = findViewById(R.id.tvResultado);
        btnCalcular = findViewById(R.id.btnCalcular);

        btnCalcular.setOnClickListener(view ->
        {
            // TODO: Realizar las validaciones correspondientes. Usar Toast.MakeText para mostrar los mensajes de advertencia.

            // TODO: Realizar el calculo del primer y segundo número y mostrarlo en pantalla.
            tvResultado.setText("RESULTADO");
        });
    }
}