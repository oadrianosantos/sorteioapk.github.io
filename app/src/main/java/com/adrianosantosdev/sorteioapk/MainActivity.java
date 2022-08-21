package com.adrianosantosdev.sorteioapk;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void selecionarBotao (View V){
        int x = new Random().nextInt(24);
        x=+ x+1;
        TextView texto = findViewById(R.id.textoResultado);
        texto.setText("A SORTE ESTÁ LANÇADA:   "  +x);
    }
}