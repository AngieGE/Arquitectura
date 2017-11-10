
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
        dis2.setOnClickListener(this);
        dis3.setOnClickListener(this);


    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.distribucion1: //Enter
                Custom_alert_layout cdd = new Custom_alert_layout(Distribuciones.this, R.drawable.zoom1);
                cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cdd.show();
                break;
            case R.id.distribucion2: //Enter
                Custom_alert_layout cdd2 = new Custom_alert_layout(Distribuciones.this, R.drawable.zoom2);
                cdd2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cdd2.show();
                break;
            case R.id.distribucion3: //Enter
                Custom_alert_layout cdd3 = new Custom_alert_layout(Distribuciones.this, R.drawable.zoom3);
                cdd3.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cdd3.show();
                break;
        }

    }
}

