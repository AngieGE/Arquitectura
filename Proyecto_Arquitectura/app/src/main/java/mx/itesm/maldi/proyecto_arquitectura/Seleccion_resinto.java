package mx.itesm.maldi.proyecto_arquitectura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class Seleccion_resinto extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_resinto);
        ImageButton avenda= (ImageButton) findViewById(R.id.img_averanda);
        ImageButton city= (ImageButton) findViewById(R.id.img_cityTowers);
        /*
        ImageButton grand= (ImageButton) findViewById(R.id.be_grand);
        ImageButton lomas= (ImageButton) findViewById(R.id.lomas_del_rio);
        ImageButton montecito= (ImageButton) findViewById(R.id.montecito);
        ImageButton paraiso= (ImageButton) findViewById(R.id.paraiso);*/
        avenda.setImageResource(R.drawable.logo_averanta);
        city.setImageResource(R.drawable.logo_city);
       /* grand.setImageResource(R.drawable.logo_grand);
        lomas.setImageResource(R.drawable.logo_lomas);
        montecito.setImageResource(R.drawable.logo_montecito);
        paraiso.setImageResource(R.drawable.logo_paraiso);*/
        avenda.setOnClickListener(this);
        /*grand.setOnClickListener(this);
        lomas.setOnClickListener(this);
        montecito.setOnClickListener(this);
        paraiso.setOnClickListener(this);*/
        city.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.img_averanda: //Enter
                Intent i;
                i = new Intent(Seleccion_resinto.this, Avenda_Screen_Load.class);
                startActivity(i);
               break;
        }

    }
}
