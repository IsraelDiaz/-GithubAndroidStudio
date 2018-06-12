package com.example.israel.ifdccurriculum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datos);
    }

    public void clickSiguiente(View view){
        Intent intent = new Intent( this, Ref_Rec.class);
        startActivity(intent);

    }

    public void clickAnterior(View view){
        Intent intent = new Intent( this,Datos.class);
        startActivity(intent);

    }




}
