package mx.itesm.maldi.proyecto_arquitectura;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class Cotizacion extends AppCompatActivity implements View.OnClickListener {

    CheckBox c1, c2, c3;
    Button atrasCot, sigCot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cotizacion);
        c1=(CheckBox)findViewById(R.id.cb_basico);
        c2=(CheckBox)findViewById(R.id.cb_medium);
        c3=(CheckBox)findViewById(R.id.cb_premium);
        atrasCot=(Button)findViewById(R.id.bn_atras_cot);
        sigCot=(Button)findViewById(R.id.bn_siguiente_cot);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        sigCot.setOnClickListener(this);
        atrasCot.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.cb_basico: //Se des-selecciona el checkbox 1 y 2
                if((c2.isChecked()==true)|| (c3.isChecked()==true)){
                    c2.setChecked(false);
                    c3.setChecked(false);
                }
                break;
            case R.id.cb_medium: //Se des-selecciona el checkbox 1 y 2
                if((c1.isChecked()==true)|| (c3.isChecked()==true)){
                    c1.setChecked(false);
                    c3.setChecked(false);
                }
                break;
            case R.id.cb_premium: //Se des-selecciona el checkbox 1 y 2
                if((c2.isChecked()==true)|| (c1.isChecked()==true)){
                    c2.setChecked(false);
                    c1.setChecked(false);
                }
                break;
            case R.id.bn_siguiente_cot: //Enter
                Intent i;
                i = new Intent(Cotizacion.this, Catalogo.class);
                if (c1.isChecked()==false && c2.isChecked()==false && c3.isChecked()==false){
                    Toast.makeText(this, "Seleccione un paquete", Toast.LENGTH_SHORT).show();
                }else{
                    if (c2.isChecked()==true)
                    {
                        startActivity(i);
                    }
                }
                break;
            case R.id.bn_atras_cot: //Enter
                i = new Intent(Cotizacion.this, Estilos.class);
                startActivity(i);
                break;

        }
    }
}
