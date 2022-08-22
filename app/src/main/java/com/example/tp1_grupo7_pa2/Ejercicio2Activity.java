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
    private boolean operatorClick = false;

    // Controles númericos:
    private Button [] btnNum = new Button[10] ;

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
        btnNum[0] = findViewById(R.id.btnNro0);
        btnNum[1] = findViewById(R.id.btnNro1);
        btnNum[2] = findViewById(R.id.btnNro2);
        btnNum[3] = findViewById(R.id.btnNro3);
        btnNum[4] = findViewById(R.id.btnNro4);
        btnNum[5] = findViewById(R.id.btnNro5);
        btnNum[6] = findViewById(R.id.btnNro6);
        btnNum[7] = findViewById(R.id.btnNro7);
        btnNum[8] = findViewById(R.id.btnNro8);
        btnNum[9] = findViewById(R.id.btnNro9);
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

    private void onClickNumber(Button btn)
    {   String valor = btn.getText().toString();
        int number = Integer.parseInt(valor);
        tvExpresion.setText(tvExpresion.getText().toString()+number);
    }

    private void SetListenerNumeros()
    {
        btnNum[0].setOnClickListener(view ->
        {
            onClickNumber(btnNum[0]);
        });
        btnNum[1].setOnClickListener(view ->
        {
            onClickNumber(btnNum[1]);
        });
        btnNum[2].setOnClickListener(view ->
        {
            onClickNumber(btnNum[2]);
        });
        btnNum[3].setOnClickListener(view ->
        {
            onClickNumber(btnNum[3]);
        });
        btnNum[4].setOnClickListener(view ->
        {
            onClickNumber(btnNum[4]);
        });
        btnNum[5].setOnClickListener(view ->
        {
            onClickNumber(btnNum[5]);
        });
        btnNum[6].setOnClickListener(view ->
        {
            onClickNumber(btnNum[6]);
        });
        btnNum[7].setOnClickListener(view ->
        {
            onClickNumber(btnNum[7]);
        });
        btnNum[8].setOnClickListener(view ->
        {
            onClickNumber(btnNum[8]);
        });
        btnNum[9].setOnClickListener(view ->
        {
            onClickNumber(btnNum[9]);
        });
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
        if(tvExpresion.getText().toString().isEmpty())
        {
            Toast.makeText(this, "El formato usado no es valido", Toast.LENGTH_SHORT).show();
        }
        else{
            if (operatorClick)
            {
                //TODO: Calcular el resultado
            }
            operatorClick = true;
            tvExpresion.setText(tvExpresion.getText().toString()+operador);
        }
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