package mx.itesm.maldi.proyecto_arquitectura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Selecion_Torre extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecion__torre);
        ImageButton torre_basica= (ImageButton) findViewById(R.id.basic_apartment);
        torre_basica.setImageResource(R.drawable.basic_department_averanda);
        torre_basica.setOnClickListener(this);
        ImageButton torre_penthouse= (ImageButton) findViewById(R.id.penthouse_appartment);
        torre_penthouse.setImageResource(R.drawable.penthouse_department_averanda);
        torre_penthouse.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.basic_apartment: //Enter
                i = new Intent(Selecion_Torre.this, Basic_department.class);
                startActivity(i);
                break;
            case R.id.penthouse_appartment: //Enter
                i = new Intent(Selecion_Torre.this, Penthouse.class);
                startActivity(i);
                break;
        }
    }
}
