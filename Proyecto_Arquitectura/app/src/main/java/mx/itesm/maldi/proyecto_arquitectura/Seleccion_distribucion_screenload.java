package mx.itesm.maldi.proyecto_arquitectura;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;

public class Seleccion_distribucion_screenload extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_distribucion_screenload);
        Intent intent = getIntent();
        int temp = intent.getIntExtra("int_value", 0);
        ImageView img= (ImageView) findViewById(R.id.imagen_dist);
        if (temp != 0) {
            switch (temp) {

                case 1: img.setImageResource(R.drawable.zoom1); break;
                case 2: img.setImageResource(R.drawable.zoom2); break;
                case 3: img.setImageResource(R.drawable.zoom3); break;
            }
        }
        Handler handler = new Handler();
        handler.postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent i;
                i = new Intent(Seleccion_distribucion_screenload.this, Estilos.class);
                startActivity(i);
                overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
            }
        }, 3000);
    }
}
