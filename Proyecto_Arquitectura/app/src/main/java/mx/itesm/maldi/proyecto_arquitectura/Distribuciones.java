
package mx.itesm.maldi.proyecto_arquitectura;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Distribuciones extends AppCompatActivity implements View.OnClickListener  {

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
        dis1.setOnClickListener(this);


    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.distribucion1: //Enter
                Custom_alert_layout cdd = new Custom_alert_layout(Distribuciones.this);
                cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cdd.show();
                break;
            case R.id.distribucion2: //Enter

                break;
            case R.id.distribucion3: //Enter

                break;
        }

    }
}

