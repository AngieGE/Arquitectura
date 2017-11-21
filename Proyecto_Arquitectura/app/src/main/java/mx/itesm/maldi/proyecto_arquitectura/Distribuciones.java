
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
import android.widget.ImageView;
import android.widget.Toast;

public class Distribuciones extends AppCompatActivity implements View.OnClickListener  {

    private Button siguiente, atras;
    private CheckBox cb_dis1, cb_dis2,cb_dis3;
    private ImageButton dis1, dis2, dis3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distribuciones);
        //Declaro variables
        dis1= (ImageButton) findViewById(R.id.distribucion1);
        dis2= (ImageButton) findViewById(R.id.distribucion2);
        dis3= (ImageButton) findViewById(R.id.distribucion3);
        cb_dis1=(CheckBox) findViewById(R.id.cb_distribucion1);
        cb_dis2=(CheckBox) findViewById(R.id.cb_distribucion2);
        cb_dis3=(CheckBox) findViewById(R.id.cb_distribucion3);
        siguiente=(Button) findViewById(R.id.bn_siguiente);
        atras=(Button) findViewById(R.id.bn_atras);
        //Son clickable
        dis1.setOnClickListener(this);
        dis2.setOnClickListener(this);
        dis3.setOnClickListener(this);
        cb_dis1.setOnClickListener(this);
        cb_dis2.setOnClickListener(this);
        cb_dis3.setOnClickListener(this);
        siguiente.setOnClickListener(this);
        atras.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.distribucion1: //zoom a distribucion 1
                Custom_alert_layout cdd = new Custom_alert_layout(Distribuciones.this, R.drawable.zoom1);
                cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cdd.show();
                break;
            case R.id.distribucion2: //zoom a distribucion 2
                Custom_alert_layout cdd2 = new Custom_alert_layout(Distribuciones.this, R.drawable.zoom2);
                cdd2.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cdd2.show();
                break;
            case R.id.distribucion3: //zoom a distribucion 3
                Custom_alert_layout cdd3 = new Custom_alert_layout(Distribuciones.this, R.drawable.zoom3);
                cdd3.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cdd3.show();
                break;
            case R.id.cb_distribucion1: //Se des-selecciona el checkbox 2 y 3
                if((cb_dis2.isChecked()==true)|| (cb_dis3.isChecked()==true)){
                    cb_dis2.setChecked(false);
                    cb_dis3.setChecked(false);
                }
                break;
            case R.id.cb_distribucion2: //Se des-selecciona el checkbox 1 y 3
                if((cb_dis1.isChecked()==true)|| (cb_dis3.isChecked()==true)){
                    cb_dis1.setChecked(false);
                    cb_dis3.setChecked(false);
                }
                break;
            case R.id.cb_distribucion3: //Se des-selecciona el checkbox 1 y 2
                if((cb_dis1.isChecked()==true)|| (cb_dis2.isChecked()==true)){
                    cb_dis1.setChecked(false);
                    cb_dis2.setChecked(false);
                }
                break;
            case R.id.bn_siguiente: //Enter
                Intent i;
                i = new Intent(Distribuciones.this, Seleccion_distribucion_screenload.class);
                if (cb_dis1.isChecked()==false && cb_dis2.isChecked()==false && cb_dis3.isChecked()==false){
                    Toast.makeText(this, "Seleccione un tipo de distribución", Toast.LENGTH_SHORT).show();
                }else{
                    int distribucion;
                    if (cb_dis1.isChecked()==true)
                    {
                         distribucion = 1;
                    }
                    else {

                        if (cb_dis2.isChecked() == true) {
                             distribucion = 2;
                        }
                        else
                        {
                             distribucion = 3;
                        }
                    }
                    i.putExtra("int_value", distribucion);
                    startActivity(i);
                    overridePendingTransition(R.anim.zoom_in, R.anim.zoom_out);
                }
                break;
            case R.id.bn_atras: //Enter
                i = new Intent(Distribuciones.this, seleccion_tipo_departamento.class);
                startActivity(i);
                break;
        }
    }
}

