package mx.itesm.maldi.proyecto_arquitectura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Selecion_Torre extends AppCompatActivity implements View.OnClickListener {

    private Button torreA, torreB, torreC;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecion__torre);

        torreA=(Button)findViewById(R.id.bn_a);
        torreB=(Button)findViewById(R.id.bn_b);
        torreC=(Button)findViewById(R.id.bn_c);

        torreA.setOnClickListener(this);
        torreB.setOnClickListener(this);
        torreC.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.bn_a: //Enter
                i = new Intent(Selecion_Torre.this, seleccion_tipo_departamento.class);
                startActivity(i);
                break;
            case R.id.bn_b: //Enter
                i = new Intent(Selecion_Torre.this, seleccion_tipo_departamento.class);
                startActivity(i);
                break;
            case R.id.bn_c: //Enter
                i = new Intent(Selecion_Torre.this, seleccion_tipo_departamento.class);
                startActivity(i);
                break;
        }
    }
}
