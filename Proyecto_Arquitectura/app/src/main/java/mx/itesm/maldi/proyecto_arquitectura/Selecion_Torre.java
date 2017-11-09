package mx.itesm.maldi.proyecto_arquitectura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Selecion_Torre extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecion__torre);

    }

    /*public void onClick(View v) {
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
    }*/
}
