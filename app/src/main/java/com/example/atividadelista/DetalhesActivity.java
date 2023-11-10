package com.example.atividadelista;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetalhesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalhes);

        Intent intent = getIntent();
        if (intent != null) {
            String nomeAnime = intent.getStringExtra("anime");
            String nome = intent.getStringExtra("nome");
            String idadeAnime = intent.getStringExtra("idade");
            String sexo = intent.getStringExtra("sexo");
            String raca = intent.getStringExtra("raca");
            String voz = intent.getStringExtra("voz");
            String altura = intent.getStringExtra("altura");
            String peso = intent.getStringExtra("peso");
            int imagemId = intent.getIntExtra("imagemId", 0);
            // Recupere outros extras conforme necessário

            // Atualize a UI com os detalhes do item
            ImageView imageView = findViewById(R.id.imageView);
            TextView textViewNomeAnime = findViewById(R.id.textViewNomeAnime);
            TextView textViewIdadeAnime = findViewById(R.id.textViewIdadeAnime);
            TextView textViewNome = findViewById(R.id.textViewNome);
            TextView textViewSexo = findViewById(R.id.textViewSexo);
            TextView textViewRaca = findViewById(R.id.textViewRaca);
            TextView textViewAltura = findViewById(R.id.textViewAltura);
            TextView textViewPeso = findViewById(R.id.textViewPeso);
            TextView textViewVoz = findViewById(R.id.textViewVoz);
            // Atualize outros TextViews conforme necessário





            textViewNomeAnime.setText(nomeAnime);
            textViewIdadeAnime.setText(idadeAnime);
            textViewNome.setText(nome);
            textViewSexo.setText(sexo);
            textViewRaca.setText(raca);
            textViewVoz.setText(voz);
            textViewAltura.setText(altura);
            textViewPeso.setText(peso);
            imageView.setImageResource(imagemId);
            // Atualize outros TextViews conforme necessário
        }
    }
}