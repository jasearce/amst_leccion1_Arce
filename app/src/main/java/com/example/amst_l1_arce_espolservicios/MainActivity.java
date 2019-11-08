package com.example.amst_l1_arce_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button) findViewById(R.id.sidweb);
        Button btn2 = (Button) findViewById(R.id.academico);
        Button btn3 = (Button) findViewById(R.id.vinculos);
        Button btn4 = (Button) findViewById(R.id.bienestar);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toSidweb = new Intent(MainActivity.this, Sidweb.class);
                startActivity(toSidweb);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toAcademico = new Intent(MainActivity.this, Academico.class);
                startActivity(toAcademico);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toVinculos = new Intent(MainActivity.this, Vinculos.class);
                startActivity(toVinculos);
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent toBienestar = new Intent(MainActivity.this, Bienestar.class);
                startActivity(toBienestar);
            }
        });
    }
}
