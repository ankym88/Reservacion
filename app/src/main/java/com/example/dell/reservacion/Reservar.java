package com.example.dell.reservacion;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Date;

public class Reservar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservar);


        Bundle datos = this.getIntent().getExtras();
        String recu = datos.getString("variable");

        TextView err = (TextView)findViewById(R.id.noparqueo);
        err.setText(recu);

        TextView inicio = (TextView)findViewById(R.id.inicio);

        String datee = (DateFormat.format("dd-MM-yyyy hh:mm:ss", new java.util.Date()).toString());
        inicio.setText(datee);



    }
}
