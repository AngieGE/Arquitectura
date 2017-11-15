package mx.itesm.maldi.proyecto_arquitectura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Catalogo extends AppCompatActivity implements View.OnClickListener  {

    private CheckBox cbSillon1, cbSillon2, cbSillon3, cbSillon4, cbSillon5, cbSillon6 ;
    private ImageView imagen;
    private Button atras, siguiente;
    private TextView precio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);
        //Declatro las check box y el boton
        cbSillon1=(CheckBox)findViewById(R.id.cb_sillon1);
        cbSillon2=(CheckBox)findViewById(R.id.cb_sillon2);
        cbSillon3=(CheckBox)findViewById(R.id.cb_sillon3);
        cbSillon4=(CheckBox)findViewById(R.id.cb_sillon4);
        cbSillon5=(CheckBox)findViewById(R.id.cb_sillon5);
        cbSillon6=(CheckBox)findViewById(R.id.cb_sillon6);

        imagen=(ImageView) findViewById(R.id.carrito_seleccion);
        atras=(Button) findViewById(R.id.bn_atras_catalogo);
        siguiente=(Button) findViewById(R.id.bn_siguiente_catalogo);
        precio=(TextView) findViewById(R.id.precio1);

        //Les agrego su OnClickListener
        cbSillon1.setOnClickListener(this);
        cbSillon2.setOnClickListener(this);
        cbSillon3.setOnClickListener(this);
        cbSillon4.setOnClickListener(this);
        cbSillon5.setOnClickListener(this);
        cbSillon6.setOnClickListener(this);

        atras.setOnClickListener(this);
        siguiente.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.cb_sillon1: //Deseleccionar la B en caso de haberla seleccionado antes
                cbSillon2.setChecked(false);
                cbSillon3.setChecked(false);
                cbSillon4.setChecked(false);
                cbSillon5.setChecked(false);
                cbSillon6.setChecked(false);
                if (  cbSillon1.isChecked()==false  ){
                    imagen.setBackgroundResource(R.drawable.blanco);
                    precio.setVisibility(View.INVISIBLE);
                }else{
                    imagen.setBackgroundResource(R.drawable.compra_sofa1);
                    precio.setText("30,500");
                    precio.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.cb_sillon2: //Deseleccionar la A en caso de haberla seleccionado antes
                cbSillon1.setChecked(false);
                cbSillon3.setChecked(false);
                cbSillon4.setChecked(false);
                cbSillon5.setChecked(false);
                cbSillon6.setChecked(false);
                if (  cbSillon2.isChecked()==false  ){
                    imagen.setBackgroundResource(R.drawable.blanco);
                    precio.setVisibility(View.INVISIBLE);
                }else{
                    imagen.setBackgroundResource(R.drawable.compra_sofa2);
                    precio.setText("18,500");
                    precio.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.cb_sillon3: //Deseleccionar la A en caso de haberla seleccionado antes
                cbSillon1.setChecked(false);
                cbSillon2.setChecked(false);
                cbSillon4.setChecked(false);
                cbSillon5.setChecked(false);
                cbSillon6.setChecked(false);
                if (  cbSillon3.isChecked()==false  ){
                    imagen.setBackgroundResource(R.drawable.blanco);
                    precio.setVisibility(View.INVISIBLE);
                }else{
                    imagen.setBackgroundResource(R.drawable.compra_sofa3);
                    precio.setText("31,860");
                    precio.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.cb_sillon4: //Deseleccionar la A en caso de haberla seleccionado antes
                cbSillon1.setChecked(false);
                cbSillon2.setChecked(false);
                cbSillon3.setChecked(false);
                cbSillon5.setChecked(false);
                cbSillon6.setChecked(false);
                if (  cbSillon4.isChecked()==false  ){
                    imagen.setBackgroundResource(R.drawable.blanco);
                    precio.setVisibility(View.INVISIBLE);
                }else{
                    imagen.setBackgroundResource(R.drawable.compra_sofa4);
                    precio.setText("22,000");
                    precio.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.cb_sillon5: //Deseleccionar la A en caso de haberla seleccionado antes
                cbSillon1.setChecked(false);
                cbSillon2.setChecked(false);
                cbSillon4.setChecked(false);
                cbSillon3.setChecked(false);
                cbSillon6.setChecked(false);
                if (  cbSillon5.isChecked()==false  ){
                    imagen.setBackgroundResource(R.drawable.blanco);
                    precio.setVisibility(View.INVISIBLE);
                }else{
                    imagen.setBackgroundResource(R.drawable.compra_sofa5);
                    precio.setText("15,300");
                    precio.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.cb_sillon6: //Deseleccionar la A en caso de haberla seleccionado antes
                cbSillon1.setChecked(false);
                cbSillon2.setChecked(false);
                cbSillon4.setChecked(false);
                cbSillon5.setChecked(false);
                cbSillon3.setChecked(false);
                if (  cbSillon6.isChecked()==false  ){
                    imagen.setBackgroundResource(R.drawable.blanco);
                    precio.setVisibility(View.INVISIBLE);
                }else{
                    imagen.setBackgroundResource(R.drawable.compra_sofa6);
                    precio.setText("11,000");
                    precio.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.bn_atras_catalogo: //Deseleccionar la A en caso de haberla seleccionado antes
                i = new Intent(Catalogo.this, Estilos.class);
                startActivity(i);
                break;
            case R.id.bn_siguiente_catalogo:
                if(cbSillon1.isChecked()==false && cbSillon2.isChecked()==false && cbSillon3.isChecked()==false && cbSillon4.isChecked()==false && cbSillon5.isChecked()==false && cbSillon6.isChecked()==false) //en caso de no haber seleccionado alguna
                {
                    Toast.makeText(this, "Seleccione un articulo a agregar", Toast.LENGTH_SHORT).show();
                }else {
                    //PASAR AL SIG ACTIVITY
                    i = new Intent(Catalogo.this, LastActivity.class);
                    startActivity(i);
                }
                break;
        }

    }
}
