package mx.itesm.maldi.proyecto_arquitectura;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Distribuciones extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distribuciones);
        ImageButton dis1= (ImageButton) findViewById(R.id.distribucion1);
        ImageButton dis2= (ImageButton) findViewById(R.id.distribucion2);
        ImageButton dis3= (ImageButton) findViewById(R.id.distribucion3);
        dis1.setImageResource(R.drawable.distribucion1);
        dis2.setImageResource(R.drawable.distribucion2);
        dis3.setImageResource(R.drawable.distribucion3);


    }
}
