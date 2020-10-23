package com.example.spotify;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class MainActivity extends AppCompatActivity {

    ImageView imagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         imagem = (ImageView) findViewById(R.id.imageView);

        Glide.with(this).load("https://img.youtube.com/vi/j7zBBM6z4E4/0.jpg").into(imagem);
    }

    }

