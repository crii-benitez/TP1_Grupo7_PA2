package com.example.tp1_grupo7_pa2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Ejercicio2Activity extends AppCompatActivity {

    private static String SumaConst = "+";
    private static String RestaConst = "-";
    private static String DivicionConst = "/";
    private static String MultiplicacionConst = "*";

    // Controles de operaciones:
    private Button btnSumar;
    private Button btnRestar;
    private Button btnDividir;
    private Button btnMultiplicar;
    private Button btnBorrar;
    private Button btnIgual;
    private TextView tvExpresion;

    // Controles númericos:

    private void SetViewControls()
    {
        // Controles de operaciones.
        btnSumar = findViewById(R.id.btnSumar);
        btnRestar = findViewById(R.id.btnRestar);
        btnDividir = findViewById(R.id.btnDividir);
        btnMultiplicar = findViewById(R.id.btnMultiplicar);
        btnIgual = findViewById(R.id.btnIgual);
        btnBorrar = findViewById(R.id.btnBorrar);
        tvExpresion = findViewById(R.id.tvExpresion);

        // Controles númericos.
        // TODO: Obtener también todas las view (Buttons) de los controles númericos
    }

    private void SetListenerOperadores()
    {
        btnSumar.setOnClickListener(view ->
        {
            ModificarOperador(SumaConst);
        });

        btnRestar.setOnClickListener(view ->
        {
            ModificarOperador(RestaConst);
        });

        btnDividir.setOnClickListener(view ->
        {
            ModificarOperador(DivicionConst);
        });

        btnMultiplicar.setOnClickListener(view ->
        {
            ModificarOperador(MultiplicacionConst);
        });

        // Igual
        btnIgual.setOnClickListener(view -> {

            String expression = tvExpresion.getText().toString();

            if (ValidarFormato(expression))
            {
                CalcularResultado(expression);
            }
            // TODO: Realizar el calculo de suma / divición / multiplicación / resta dependiendo lo ingresado.
        });

        btnBorrar.setOnClickListener(view -> {
            tvExpresion.setText("");
        });
    }

    private void SetListenerNumeros()
    {
        // TODO: Agregar la funcionalidad a los botones numericos (ver SetListenerOperadores())
    }

    private void SetListener()
    {
        // Acá vamos a crear los eventos OnClick de los controles.
        SetListenerOperadores();
        SetListenerNumeros();
    }

    private boolean ValidarFormato(String expression)
    {
        // TODO: Validar formato correcto. Por ejemplo, no se podría sumar '4+', o '0*'.
        if (expression.isEmpty())
        {
            // Muestra un mensaje más restrictivo en pantalla.
            Toast.makeText(this, "Ingrese un calculo", Toast.LENGTH_SHORT).show();
            return false;
        }

        return true;
    }

    private void CalcularResultado(String expression)
    {
        // TODO: En este metodo vamos a analizar la expression para entenderla y llevarla a números y operaciones.
        tvExpresion.setText("RESULTADO!!!!");
    }

    private void ModificarOperador(String operador)
    {
        // TODO: Validaciones, no se puede agregar el mismo operador 2 veces por ejemplo.
        // TODO: Debería agregar o cambiar el signo del cálculo.
        tvExpresion.setText(operador);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_ejercicio2);

        SetViewControls();
        SetListener();
    }
}