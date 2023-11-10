package com.example.atividadelista;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
ListView listViewAnime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewAnime = findViewById(R.id.listViewAnime);



        ModelAnime anime1 = new ModelAnime();
        anime1.Anime = "NieR:Automata Ver1.1a";
        anime1.Age = "3";
        anime1.Name = "YoRHa 2-gou B-gata 2B";
        anime1.Sex = "Mulher";
        anime1.Voice = "Ishikawa, Yui";
        anime1.Race = "Android";
        anime1.weight = "228 kg";
        anime1.Altura = "2 Metros";
        anime1.ImageId = R.drawable.androidnier;

        ModelAnime anime2 = new ModelAnime();
        anime2.Anime = "Onna Shinkan";
        anime2.Age = "17";
        anime2.Name = "Goblin Slayer";
        anime2.Sex = "Mulher";
        anime2.Voice = "Ogura, Yui";
        anime2.Race = "Humana";
        anime2.weight = "52 kg";
        anime2.Altura = "1,50 M";
        anime2.ImageId = R.drawable.onnashinkan;

        ModelAnime anime3 = new ModelAnime();
        anime3.Anime = "Megumi";
        anime3.Age = "14";
        anime3.Name = "Kono Subarashii Sekai ni Bakuen wo!";
        anime3.Sex = "Mulher";
        anime3.Voice = "Takahashi, Rie";
        anime3.Race = "Demônio";
        anime3.weight = "65 kg";
        anime3.Altura = "1,60 Metros";
        anime3.ImageId = R.drawable.megumin;

        ModelAnime anime4 = new ModelAnime();
        anime4.Anime = "Sora Kasugano";
        anime4.Age = "17";
        anime4.Name = "Yosuga no Sora";
        anime4.Sex = "Mulher";
        anime4.Voice = "Taguchi, Hiroko";
        anime4.Race = "Android";
        anime4.weight = "54 kg";
        anime4.Altura = "1,52 M";
        anime4.ImageId = R.drawable.sorakasugano;

        ModelAnime anime5 = new ModelAnime();
        anime5.Anime = "Youjo Senki";
        anime5.Age = "13";
        anime5.Name = "Tanya";
        anime5.Sex = "Mulher";
        anime5.Voice = "yuuki, Aoi";
        anime5.Race = "Humana";
        anime5.weight = "52 kg";
        anime5.Altura = "1,50 M";
        anime5.ImageId = R.drawable.tanya;

        ArrayList<ModelAnime> animeArrayList = new ArrayList<>();
        animeArrayList.add(anime1);
        animeArrayList.add(anime2);
        animeArrayList.add(anime3);
        animeArrayList.add(anime4);
        animeArrayList.add(anime5);

        CustomListAdapter adapter =
                new CustomListAdapter(MainActivity.this, animeArrayList);

        listViewAnime.setAdapter(adapter);
    }
}