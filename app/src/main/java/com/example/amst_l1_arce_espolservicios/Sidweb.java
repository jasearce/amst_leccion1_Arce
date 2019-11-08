package com.example.amst_l1_arce_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Sidweb extends AppCompatActivity {
    String horario = "Todos los días";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sidweb);

        Toast toast = Toast.makeText(getApplicationContext(), "Todos los días", Toast.LENGTH_LONG);
        toast.show();
    }
}
