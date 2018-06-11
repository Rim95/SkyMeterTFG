package com.skymeter.skymeter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button empezar; //Boton para la siguiente actividad
    Button instructions; //Boton para ir a la actividad de instrucciones

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Actividad dark
        //Para acceder a la actividad de DARK (comenzar a usar la aplicacion)
        empezar=(Button)findViewById(R.id.start);
        empezar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main3Activity.class));
            }
        });

        //Instrucciones
        //Para acceder a la actividad instrucciones
        instructions = (Button)findViewById(R.id.instructions);
        instructions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, Main2Activity.class));
            }
        });
    }
}
