package com.unam.unica.adonahi.segundaaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class PaginaWebActivity extends AppCompatActivity {

    WebView wvPagina;
    String URL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_web);

        wvPagina = findViewById(R.id.wvPagina);

        URL = getIntent().getStringExtra("url");

        //Inicializando el Web View
        wvPagina.setWebViewClient(new WebViewClient());

        //Se carga la URL enviada
        wvPagina.loadUrl("https://" + URL);


    }
}