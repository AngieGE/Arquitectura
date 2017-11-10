package mx.itesm.maldi.proyecto_arquitectura;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Distribuciones extends AppCompatActivity implements View.OnClickListener{

    private ImageButton dis1, dis2, dis3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distribuciones);
        //declaro mis botones
         dis1= (ImageButton) findViewById(R.id.distribucion1);
         dis2= (ImageButton) findViewById(R.id.distribucion2);
         dis3= (ImageButton) findViewById(R.id.distribucion3);
        //Les agrego imagen
        dis1.setImageResource(R.drawable.distribucion1);
        dis2.setImageResource(R.drawable.distribucion2);
        dis3.setImageResource(R.drawable.distribucion3);
        //accesibilidad para hacer click


    }

    @Override
    public void onClick(View v) {

    }

}
