package mx.itesm.maldi.proyecto_arquitectura;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;

public class Estilos extends AppCompatActivity implements View.OnClickListener{

    private Button siguiente, atras;
    private CheckBox cb_est1, cb_est2,cb_est3;
    private ImageButton est1, est2, est3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_estilos);
        //Declaro variables
        est1= (ImageButton) findViewById(R.id.ib_estilo1);
        est2= (ImageButton) findViewById(R.id.ib_estilo2);
        est3= (ImageButton) findViewById(R.id.ib_estilo3);
        cb_est1=(CheckBox) findViewById(R.id.cb_estilo1);
        cb_est2=(CheckBox) findViewById(R.id.cb_estilo2);
        cb_est3=(CheckBox) findViewById(R.id.cb_estilo3);
        siguiente=(Button) findViewById(R.id.bn_siguiente_estilos);
        atras=(Button) findViewById(R.id.bn_atras_estilos);
        //Son clickable
        est1.setOnClickListener(this);
        est2.setOnClickListener(this);
        est3.setOnClickListener(this);
        cb_est1.setOnClickListener(this);
        cb_est2.setOnClickListener(this);
        cb_est3.setOnClickListener(this);
        siguiente.setOnClickListener(this);
        atras.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.ib_estilo1: //zoom a estilo 1
                Custom_alert_layout cdd = new Custom_alert_layout(Estilos.this, R.drawable.zoom_tradicional);
                cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cdd.show();
                break;
            case R.id.ib_estilo2: //zoom a estilo 2
                Custom_alert_layout cdd2 = new Custom_alert_layout(Estilos.this, R.drawable.zoom_contemporaneo);
                cdd2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cdd2.show();
                break;
            case R.id.ib_estilo3: //zoom a estilo 3
                Custom_alert_layout cdd3 = new Custom_alert_layout(Estilos.this, R.drawable.zoom_moderno);
                cdd3.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cdd3.show();
                break;
            case R.id.cb_estilo1: //Se des-selecciona el checkbox 2 y 3
                if((cb_est2.isChecked()==true)|| (cb_est3.isChecked()==true)){
                    cb_est2.setChecked(false);
                    cb_est3.setChecked(false);
                }
                break;
            case R.id.cb_estilo2: //Se des-selecciona el checkbox 1 y 3
                if((cb_est1.isChecked()==true)|| (cb_est3.isChecked()==true)){
                    cb_est1.setChecked(false);
                    cb_est3.setChecked(false);
                }
                break;
            case R.id.cb_estilo3: //Se des-selecciona el checkbox 1 y 2
                if((cb_est1.isChecked()==true)|| (cb_est2.isChecked()==true)){
                    cb_est1.setChecked(false);
                    cb_est2.setChecked(false);
                }
                break;
            case R.id.bn_atras_estilos: //Se des-selecciona el checkbox 1 y 2
                i = new Intent(Estilos.this, Distribuciones.class);
                startActivity(i);
                break;
            case R.id.bn_siguiente_estilos: //Enter
                if (cb_est1.isChecked()==false && cb_est2.isChecked()==false && cb_est3.isChecked()==false){
                    Toast.makeText(this, "Seleccione un tipo de estilo", Toast.LENGTH_SHORT).show();
                }else{
                    i = new Intent(Estilos.this, Seleccion_distribucion_screenload.class);
                    startActivity(i);
                }
                break;
        }
    }
}
