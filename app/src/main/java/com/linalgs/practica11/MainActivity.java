package com.linalgs.practica11;

import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private double numero, perimetro, area,volumen;
    private EditText eLado, eRadio;
    private RadioButton cCuadro, cCirculo, cTriangulo, cCubo;
    private TextView tResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        eLado = (EditText) findViewById(R.id.eLado);
        eRadio = (EditText) findViewById(R.id.eRadio);
        cCuadro = (RadioButton) findViewById(R.id.cCuadro);
        cCirculo = (RadioButton) findViewById(R.id.cCirculo);
        cTriangulo = (RadioButton) findViewById(R.id.cTriangulo);
        cCubo = (RadioButton) findViewById(R.id.cCubo);
        tResultado = (TextView)  findViewById(R.id.tResultado);


    }

    public void Calcular(View view){

        if (cCuadro.isChecked()){
            numero= Double.parseDouble(eLado.getText().toString());
            area = numero*numero;
            perimetro=4*numero;
            tResultado.setText("Area: "+area+" \nPerimetro: "+perimetro);}

        if (cCirculo.isChecked()){
            numero= Double.parseDouble(eRadio.getText().toString());
            area=3.1415926535*numero*numero;
            perimetro=2*3.1416*numero;
            tResultado.setText("Area: "+area+" \nPerimetro: "+perimetro);
        }
        if (cTriangulo.isChecked()){
            numero= Double.parseDouble(eLado.getText().toString());
            area=(0.43301270189)*numero*numero;
            perimetro=3*numero;
            tResultado.setText("Area: "+area+" \nPerimetro: "+perimetro);
        }
        if (cCubo.isChecked()){
            numero= Double.parseDouble(eLado.getText().toString());
            area=6*numero*numero;
            volumen=numero*numero*numero;
            tResultado.setText("Area: "+area+" \nVolumen: "+volumen);
        }
    }
}


