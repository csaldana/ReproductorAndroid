package com.example.jonathan.reproductor;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by jonathan on 2/04/15.
 */
public class Cancion2 extends Activity {

    MediaPlayer player = new MediaPlayer();
    Button btnpause, btnstop;


    private int Estado = 1;
    private final int Reproducir = 1;
    private final int Pausar = 2;

    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.cancion2);

        btnpause = (Button) findViewById(R.id.btnpause);
        btnstop = (Button) findViewById(R.id.btnstop);

        player = MediaPlayer.create(this, R.drawable.cancion2);
        player.setLooping(true);

    }

    public void onclickpause(View view) {

        if (view == btnpause) {
            switch (Estado) {
                case Reproducir:
                    player.start();
                    Estado = Pausar;
                    btnpause.setText("Pause");
                    break;
                case Pausar:
                    player.pause();
                    Estado = Reproducir;
                    btnpause.setText("Play");
                    break;
            }
        }
    }

    public void onclickstop(View view) {

        if (view == btnstop) {
            player.stop();
        }
    }
}
