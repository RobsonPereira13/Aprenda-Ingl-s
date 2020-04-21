package com.example.aprendaingles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.WindowManager;

public class SplashScreen extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN

        );
        setContentView(R.layout.activity_splash_screen);
        //inicando o audio
        mediaPlayer = MediaPlayer.create(SplashScreen.this,R.raw.novo);
        tocarSom();
        //Abrindo a Thread
        Thread timeThread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3700); // Colocando a thread pra dormir

                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                } finally {
                    Intent i = new Intent(SplashScreen.this, MainActivity.class);
                    startActivity(i);
                }
            }
        }; // fechando a thread
        timeThread.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        //encerrando o audio
        mediaPlayer.release();
        finish();
    }
    public  void tocarSom(){
        if(mediaPlayer !=null)
        {

            mediaPlayer.start();
            mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                @Override
                public void onCompletion(MediaPlayer mp) {
                    mp.release();
                }
            });
        }

    }
}
