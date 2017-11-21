package mx.itesm.maldi.proyecto_arquitectura;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView img= (ImageView) findViewById(R.id.imageView);
        img.setImageResource(R.drawable.logo_first);
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                i = new Intent(MainActivity.this, Password.class);
                startActivity(i);
                overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
            }
        }, 3000);

    }



}