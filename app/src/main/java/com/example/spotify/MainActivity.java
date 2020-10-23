package com.example.spotify;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class MainActivity extends AppCompatActivity {

    ImageView imagem;
    MediaPlayer player;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         imagem = (ImageView) findViewById(R.id.imageView);
        Glide.with(this).load("https://img.youtube.com/vi/j7zBBM6z4E4/0.jpg").into(imagem);

        player=MediaPlayer.create(getApplicationContext(), R.raw.clocks);
    }

    protected void onResume(){
        super.onResume();
    }
    public void player(View view) {
        player.start();
    }
}

