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

    private CheckBox cbSillon1, cbSillon2, cbSillon3, cbSillon4, cbSillon5, cbSillon6 ;
    private ImageView imagen;
    private Button atras, siguiente;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);
        //Declatro las check box y el boton
        cbSillon1=(CheckBox)findViewById(R.id.check1);
        cbSillon2=(CheckBox)findViewById(R.id.check2);
        cbSillon3=(CheckBox)findViewById(R.id.check3);

        imagen=(ImageView) findViewById(R.id.carrito_seleccion);
        atras=(Button) findViewById(R.id.bn_atras_catalogo);
        siguiente=(Button) findViewById(R.id.bn_siguiente_catalogo);

        //Les agrego su OnClickListener
        cbSillon1.setOnClickListener(this);
        cbSillon2.setOnClickListener(this);
        cbSillon3.setOnClickListener(this);
        atras.setOnClickListener(this);
        siguiente.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.check1: //Deseleccionar la B en caso de haberla seleccionado antes
                if(cbSillon2.isChecked()==true){
                    cbSillon2.setChecked(false);
                }
                if(cbSillon3.isChecked()==true){
                    cbSillon3.setChecked(false);
                }
                break;
            case R.id.check2: //Deseleccionar la A en caso de haberla seleccionado antes
                if(cbSillon1.isChecked()==true){
                    cbSillon1.setChecked(false);
                }
                if(cbSillon3.isChecked()==true){
                    cbSillon3.setChecked(false);
                }
                break;
            case R.id.check3: //Deseleccionar la A en caso de haberla seleccionado antes
                if(cbSillon1.isChecked()==true){
                    cbSillon1.setChecked(false);
                }
                if(cbSillon2.isChecked()==true){
                    cbSillon2.setChecked(false);
                }
                break;
            case R.id.bn_siguiente_catalogo:
                if(cbSillon1.isChecked()==false && cbSillon2.isChecked()==false && cbSillon3.isChecked()==false) //en caso de no haber seleccionado alguna
                {
                    Toast.makeText(this, "Seleccione un articulo a agregar", Toast.LENGTH_SHORT).show();
                }else if(cbSillon1.isChecked())//En caso de haber seleccionado opcion Tipo A
                {
                    imagen.setImageResource(R.drawable.imagen1);
                }else if(cbSillon2.isChecked())//En caso de haber seleccionado opcion Tipo B
                {
                    imagen.setImageResource(R.drawable.zoom2);
                }else if(cbSillon3.isChecked())//En caso de haber seleccionado opcion Tipo A
                {

                }
                break;
        }

    }
}
