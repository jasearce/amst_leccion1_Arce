package com.example.amst_l1_arce_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class Bienestar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienestar);

        Toast toast = Toast.makeText(getApplicationContext(), "Lunes a Viernes: 08:00-16:00", Toast.LENGTH_LONG);
        toast.show();
    }
}
