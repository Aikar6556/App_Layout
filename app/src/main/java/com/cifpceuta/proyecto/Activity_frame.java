package com.cifpceuta.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.VideoView;

public class Activity_frame extends AppCompatActivity {


    private VideoView videoView;

    private ImageButton btnPlay, btnPause;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame);

        videoView = (VideoView) findViewById(R.id.videoView);
        btnPlay = findViewById(R.id.imageButtonPlay);
        btnPause = findViewById(R.id.imageButtonPause);

        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.tortuga));

    btnPlay.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            play(view);
        }
    });

    btnPause.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            pausebtn(view);
        }
    });



    }

    public void play (View v){

        if (videoView.isPlaying()){
            videoView.pause();
        }else{
            videoView.start();
        }
        btnPlay.setVisibility(View.INVISIBLE);
        btnPause.setVisibility(View.VISIBLE);


    }

    public void pausebtn (View v){

        videoView.pause();
        btnPlay.setVisibility(View.VISIBLE);
        btnPause.setVisibility(View.INVISIBLE);
    }
}