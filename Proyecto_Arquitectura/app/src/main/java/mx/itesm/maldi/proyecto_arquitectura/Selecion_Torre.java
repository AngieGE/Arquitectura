package mx.itesm.maldi.proyecto_arquitectura;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

public class Selecion_Torre extends AppCompatActivity implements View.OnClickListener {

    private Button torreA, torreB, torreC, sig, atras;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selecion__torre);

        torreA=(Button)findViewById(R.id.bn_a);
        torreB=(Button)findViewById(R.id.bn_b);
        torreC=(Button)findViewById(R.id.bn_c);
        sig=(Button) findViewById(R.id.bn_siguiente_dis);
        atras=(Button) findViewById(R.id.bn_atras_dis);


        torreA.setOnClickListener(this);
        torreB.setOnClickListener(this);
        torreC.setOnClickListener(this);
        sig.setOnClickListener(this);
        atras.setOnClickListener(this);

        //Poner la imagen torre_arreglada de fondo en el relative layout
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.bn_a: //Seleccionó torre a
                //Cambiar el fondo del relative layout a img_torre_a
                i = new Intent(Selecion_Torre.this, seleccion_tipo_departamento.class);
                startActivity(i);
                break;
            case R.id.bn_b: //Seleccionó torre b
                //Cambiar el fondo del relative layout a img_torre_b
                i = new Intent(Selecion_Torre.this, seleccion_tipo_departamento.class);
                startActivity(i);
                break;
            case R.id.bn_c: //Seleccionó torre c
                //Cambiar el fondo del relative layout a img_torre_c
                i = new Intent(Selecion_Torre.this, seleccion_tipo_departamento.class);
                startActivity(i);
                break;
            case R.id.bn_atras_dis: //Seleccionó atras
                i = new Intent(Selecion_Torre.this, Seleccion_resinto.class);
                startActivity(i);
                break;
            case R.id.bn_siguiente_dis: //Seleccionó siguiente
                i = new Intent(Selecion_Torre.this, seleccion_tipo_departamento.class);
                //if (fondo del layout NO es "torre_arreglada"){
                // startActivity(i)
                // }else{
                // Toast.makeText(getApplication(),"Seleccione una torre", Toast.LENGTH_SHORT).show();
                // }
                startActivity(i);
                break;
        }
    }
}
