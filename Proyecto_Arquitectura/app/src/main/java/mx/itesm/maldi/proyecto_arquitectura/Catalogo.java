package mx.itesm.maldi.proyecto_arquitectura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.Toast;

public class Catalogo extends AppCompatActivity implements View.OnClickListener  {

    private CheckBox articulo1, articulo2, articulo3;
    private ImageView imagen;
    private Button agrega;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);
        //Declatro las check box y el boton
        articulo1=(CheckBox)findViewById(R.id.check1);
        articulo2=(CheckBox)findViewById(R.id.check2);
        articulo3=(CheckBox)findViewById(R.id.check3);
        imagen=(ImageView) findViewById(R.id.carrito_seleccion);
        agrega=(Button)findViewById(R.id.agregar);

        //Les agrego su OnClickListener
        articulo1.setOnClickListener(this);
        articulo2.setOnClickListener(this);
        articulo3.setOnClickListener(this);
        agrega.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.check1: //Deseleccionar la B en caso de haberla seleccionado antes
                if(articulo2.isChecked()==true){
                    articulo2.setChecked(false);
                }
                if(articulo3.isChecked()==true){
                    articulo3.setChecked(false);
                }
                break;
            case R.id.check2: //Deseleccionar la A en caso de haberla seleccionado antes
                if(articulo1.isChecked()==true){
                    articulo1.setChecked(false);
                }
                if(articulo3.isChecked()==true){
                    articulo3.setChecked(false);
                }
                break;
            case R.id.check3: //Deseleccionar la A en caso de haberla seleccionado antes
                if(articulo1.isChecked()==true){
                    articulo1.setChecked(false);
                }
                if(articulo2.isChecked()==true){
                    articulo2.setChecked(false);
                }
                break;
            case R.id.agregar:
                if(articulo1.isChecked()==false && articulo2.isChecked()==false && articulo3.isChecked()==false) //en caso de no haber seleccionado alguna
                {
                    Toast.makeText(this, "Seleccione un articulo a agregar", Toast.LENGTH_SHORT).show();
                }else if(articulo1.isChecked())//En caso de haber seleccionado opcion Tipo A
                {
                    imagen.setImageResource(R.drawable.imagen1);
                }else if(articulo2.isChecked())//En caso de haber seleccionado opcion Tipo B
                {
                    imagen.setImageResource(R.drawable.zoom2);
                }else if(articulo3.isChecked())//En caso de haber seleccionado opcion Tipo A
                {

                }
                break;
        }

    }
}
