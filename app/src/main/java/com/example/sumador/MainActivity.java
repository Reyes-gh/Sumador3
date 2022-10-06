package com.example.sumador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;
    TextView tv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=findViewById(R.id.editTextNumber);
        et2=findViewById(R.id.editTextNumber2);
        tv1=findViewById(R.id.textView);
        et1.setText("0");
        et2.setText("0");
    }

    public void sumar(View view) {

        // Obtenemos los números
        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());

        // Hacemos la suma
        int suma=n1+n2;

            // Establecemos el resultado en el TextView
            tv1.setText("" + suma);
    }

    public void restar(View view) {

        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());

        // Hacemos la resta
        int resta=n1-n2;

            tv1.setText("" + resta);

    }

    public void multiplicar(View view) {

        int n1=Integer.parseInt(et1.getText().toString());
        int n2=Integer.parseInt(et2.getText().toString());

        //Hacemos la multiplicación
        int multiplicar=n1*n2;

            tv1.setText("" + multiplicar);

    }

    public void dividir(View view) {

        double dividir;

        int n1 = Integer.parseInt(et1.getText().toString());
        int n2 = Integer.parseInt(et2.getText().toString());

        // Hacemos la división
        if (n1 == 0 && n2 == 0) {
            dividir = 0;
        } else {
            dividir = n1 / n2;
        }
        tv1.setText("" + dividir);

    }

}