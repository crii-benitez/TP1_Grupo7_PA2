package com.example.tp1_grupo7_pa2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

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
            String valor1 = etPrimerNumero.getText().toString();
            String valor2 = etSegundoNumero.getText().toString();
            int suma;


            if(valor1.isEmpty() || valor2.isEmpty())
            {
                tvResultado.setText("");
                Toast.makeText(this, "Faltan completar numeros", Toast.LENGTH_SHORT).show();

            }
            else
            {
                int num1= Integer.parseInt(valor1);
                int num2= Integer.parseInt(valor2);
                suma = num1+num2;
                String resultado =  "RESULTADO: " + suma;
                tvResultado.setText(resultado);
            }
        });
    }

}