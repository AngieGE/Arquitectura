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
        ImageButton avenda= (ImageButton) findViewById(R.id.Avenda);
        avenda.setImageResource(R.drawable.avenda);
        avenda.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.enter: //Enter
                Intent i;
                i = new Intent(Seleccion_resinto.this, Seleccion_resinto.class);
                startActivity(i);
               break;
        }

    }
}
