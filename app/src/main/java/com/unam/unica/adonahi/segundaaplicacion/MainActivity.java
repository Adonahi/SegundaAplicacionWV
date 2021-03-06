package com.unam.unica.adonahi.segundaaplicacion;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.SeekBar;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fabEnlace;
    SeekBar sbEjemplo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabEnlace = findViewById(R.id.fabEnlace);
        sbEjemplo = findViewById(R.id.sbEjemplo);

        fabEnlace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent paginaWeb = new Intent(getApplicationContext(), PaginaWebActivity.class);

                paginaWeb.putExtra("url", "www.google.com");

                startActivity(paginaWeb);

            }
        });

        sbEjemplo.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) { //i -> 0-100
                Toast.makeText(getApplicationContext(), "Moviendo", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "Lo has tocado", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(getApplicationContext(), "Lo has detenido", Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()){

            case R.id.itEvaluacion:
                Intent evaluacion = new Intent(getApplicationContext(), EvaluacionActivity.class);
                startActivity(evaluacion);
                break;

            case R.id.itInformacion:
                Intent informacion = new Intent(getApplicationContext(), InformacionActivity.class);
                startActivity(informacion);
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}