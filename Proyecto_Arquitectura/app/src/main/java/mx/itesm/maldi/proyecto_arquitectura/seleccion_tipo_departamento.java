package mx.itesm.maldi.proyecto_arquitectura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class seleccion_tipo_departamento extends AppCompatActivity implements View.OnClickListener {

    private CheckBox depaA, depaB;
    private Button siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seleccion_tipo_departamento);

        //Declatro las check box y el boton
        depaA=(CheckBox)findViewById(R.id.cb_selTipoA);
        depaB=(CheckBox)findViewById(R.id.cb_selTipoB);
        siguiente=(Button)findViewById(R.id.bn_aceptar);

        //Les agrego su OnClickListener
        depaA.setOnClickListener(this);
        depaB.setOnClickListener(this);
        siguiente.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.cb_selTipoA: //Deseleccionar la B en caso de haberla seleccionado antes
                if(depaB.isChecked()==true){
                    depaB.setChecked(false);
                }
                break;
            case R.id.cb_selTipoB: //Deseleccionar la A en caso de haberla seleccionado antes
                if(depaA.isChecked()==true){
                    depaA.setChecked(false);
                }
                break;
            case R.id.bn_aceptar:
                if(depaA.isChecked()==false && depaB.isChecked()==false) //en caso de no haber seleccionado alguna
                {
                    Toast.makeText(this, "Seleccione un tipo de departamento", Toast.LENGTH_SHORT).show();
                }else if(depaA.isChecked())//En caso de haber seleccionado opcion Tipo A
                {
                    i = new Intent(seleccion_tipo_departamento.this, Basic_department.class);
                    startActivity(i);
                }else if(depaB.isChecked())//En caso de haber seleccionado opcion Tipo B
                {
                    i = new Intent(seleccion_tipo_departamento.this, Penthouse.class);
                    startActivity(i);
                }
                break;
        }

    }
}
