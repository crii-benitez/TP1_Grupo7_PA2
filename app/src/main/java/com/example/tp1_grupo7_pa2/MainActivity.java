package com.example.tp1_grupo7_pa2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);
    }

    public void OnTouchActividad1(View view)
    {
        startActivity(new Intent(MainActivity.this, Ejercicio1Activity.class));
    }

    public void OnTouchActividad2(View view)
    {
        startActivity(new Intent(MainActivity.this, Ejercicio2Activity.class));
    }
}