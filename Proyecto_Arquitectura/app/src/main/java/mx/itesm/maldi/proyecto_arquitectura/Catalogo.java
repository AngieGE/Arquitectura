package mx.itesm.maldi.proyecto_arquitectura;

import android.content.Intent;
import android.graphics.drawable.Drawable;
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
    private ImageView imagen,imagen2,imagen3,imagen4,imagen5,imagen6,imagen7,imagen8,imagen9,imagen10,imagen11,imagen12, top, item1, item2, item3, item4, item5, item6;
    private Button atras, siguiente;
    private TextView precio;
    int contador = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);
        //Declatro las check box y el boton
        cbSillon1=(CheckBox)findViewById(R.id.cb1);
        cbSillon2=(CheckBox)findViewById(R.id.cb2);
        cbSillon3=(CheckBox)findViewById(R.id.cb3);
        cbSillon4=(CheckBox)findViewById(R.id.cb4);
        cbSillon5=(CheckBox)findViewById(R.id.cb5);
        cbSillon6=(CheckBox)findViewById(R.id.cb6);

        imagen=(ImageView) findViewById(R.id.carrito_seleccion);
        imagen2=(ImageView) findViewById(R.id.carrito_seleccion2);
        imagen3=(ImageView) findViewById(R.id.carrito_seleccion3);
        imagen4=(ImageView) findViewById(R.id.carrito_seleccion4);
        imagen5=(ImageView) findViewById(R.id.carrito_seleccion5);
        imagen6=(ImageView) findViewById(R.id.carrito_seleccion6);
        imagen7=(ImageView) findViewById(R.id.carrito_seleccion7);
        imagen8=(ImageView) findViewById(R.id.carrito_seleccion8);
        imagen9=(ImageView) findViewById(R.id.carrito_seleccion9);
        imagen10=(ImageView) findViewById(R.id.carrito_seleccion10);
        imagen11=(ImageView) findViewById(R.id.carrito_seleccion11);
        imagen12=(ImageView) findViewById(R.id.carrito_seleccion12);

        top = (ImageView) findViewById(R.id.top);
        atras=(Button) findViewById(R.id.bn_atras_catalogo);
        siguiente=(Button) findViewById(R.id.bn_siguiente_catalogo);
        precio=(TextView) findViewById(R.id.precio1);

        item1 = (ImageView) findViewById(R.id.item1);
        item2 = (ImageView) findViewById(R.id.item2);
        item3 = (ImageView) findViewById(R.id.item3);
        item4 = (ImageView) findViewById(R.id.item4);
        item5 = (ImageView) findViewById(R.id.item5);
        item6 = (ImageView) findViewById(R.id.item6);

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
            case R.id.cb1: //Deseleccionar la B en caso de haberla seleccionado antes
                cbSillon2.setChecked(false);
                cbSillon3.setChecked(false);
                cbSillon4.setChecked(false);
                cbSillon5.setChecked(false);
                cbSillon6.setChecked(false);
                if (  cbSillon1.isChecked()==false  ){
                    switch (contador)
                    {
                        case 1:
                            imagen.setBackgroundResource(R.drawable.blanco);
                            precio.setVisibility(View.INVISIBLE);
                        break;
                        case 2:
                            imagen2.setBackgroundResource(R.drawable.blanco);
                            precio.setVisibility(View.INVISIBLE);
                        break;
                    }

                }else{
                    if (contador==0) {
                        Drawable asistente = item1.getDrawable();
                        imagen.setImageDrawable(asistente);
                        precio.setText("30,500");
                        precio.setVisibility(View.VISIBLE);
                    }else if (contador == 1)
                    {
                        Drawable asistente = item1.getDrawable();
                        imagen2.setImageDrawable(asistente);
                        precio.setText("30,500");
                        precio.setVisibility(View.VISIBLE);
                    }
                }
                break;
            case R.id.cb2: //Deseleccionar la A en caso de haberla seleccionado antes
                cbSillon1.setChecked(false);
                cbSillon3.setChecked(false);
                cbSillon4.setChecked(false);
                cbSillon5.setChecked(false);
                cbSillon6.setChecked(false);
                if (  cbSillon2.isChecked()==false  ){
                    imagen.setBackgroundResource(R.drawable.blanco);
                    precio.setVisibility(View.INVISIBLE);
                }else{
                    Drawable asistente = item2.getDrawable();
                    imagen.setImageDrawable(asistente);
                    precio.setText("18,500");
                    precio.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.cb3: //Deseleccionar la A en caso de haberla seleccionado antes
                cbSillon1.setChecked(false);
                cbSillon2.setChecked(false);
                cbSillon4.setChecked(false);
                cbSillon5.setChecked(false);
                cbSillon6.setChecked(false);
                if (  cbSillon3.isChecked()==false  ){
                    imagen.setBackgroundResource(R.drawable.blanco);
                    precio.setVisibility(View.INVISIBLE);
                }else{
                    Drawable asistente = item3.getDrawable();
                    imagen.setImageDrawable(asistente);
                    precio.setText("31,860");
                    precio.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.cb4: //Deseleccionar la A en caso de haberla seleccionado antes
                cbSillon1.setChecked(false);
                cbSillon2.setChecked(false);
                cbSillon3.setChecked(false);
                cbSillon5.setChecked(false);
                cbSillon6.setChecked(false);
                if (  cbSillon4.isChecked()==false  ){
                    imagen.setBackgroundResource(R.drawable.blanco);
                    precio.setVisibility(View.INVISIBLE);
                }else{
                    Drawable asistente = item4.getDrawable();
                    imagen.setImageDrawable(asistente);
                    precio.setText("22,000");
                    precio.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.cb5: //Deseleccionar la A en caso de haberla seleccionado antes
                cbSillon1.setChecked(false);
                cbSillon2.setChecked(false);
                cbSillon4.setChecked(false);
                cbSillon3.setChecked(false);
                cbSillon6.setChecked(false);
                if (  cbSillon5.isChecked()==false  ){
                    imagen.setBackgroundResource(R.drawable.blanco);
                    precio.setVisibility(View.INVISIBLE);
                }else{
                    Drawable asistente = item5.getDrawable();
                    imagen.setImageDrawable(asistente);
                    precio.setText("15,300");
                    precio.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.cb6: //Deseleccionar la A en caso de haberla seleccionado antes
                cbSillon1.setChecked(false);
                cbSillon2.setChecked(false);
                cbSillon4.setChecked(false);
                cbSillon5.setChecked(false);
                cbSillon3.setChecked(false);
                if (  cbSillon6.isChecked()==false  ){
                    imagen.setBackgroundResource(R.drawable.blanco);
                    precio.setVisibility(View.INVISIBLE);
                }else{
                    Drawable asistente = item6.getDrawable();
                    imagen.setImageDrawable(asistente);
                    precio.setText("11,000");
                    precio.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.bn_atras_catalogo: //Deseleccionar la A en caso de haberla seleccionado antes

                if (contador == 0)
                {
                    i = new Intent(Catalogo.this, Estilos.class);
                    startActivity(i);
                }
                else
                {
                    contador--;
                }
                switch(contador) {
                    case 0:
                        top.setImageResource(R.drawable.top_sofas_sala);
                        item1.setImageResource(R.drawable.sofa1);
                        item2.setImageResource(R.drawable.sofa2);
                        item3.setImageResource(R.drawable.sofa3);
                        item4.setImageResource(R.drawable.img_sofa4);
                        item5.setImageResource(R.drawable.sofa5);
                        item6.setImageResource(R.drawable.sofa6);
                        cbSillon1.setChecked(false);
                        cbSillon2.setChecked(false);
                        cbSillon3.setChecked(false);
                        cbSillon4.setChecked(false);
                        cbSillon5.setChecked(false);
                        cbSillon6.setChecked(false);
                        break;
                    case 1:
                        top.setImageResource(R.drawable.top_sillones_sala);
                        item1.setImageResource(R.drawable.sillon1);
                        item2.setImageResource(R.drawable.sillon2);
                        item3.setImageResource(R.drawable.sillon4);
                        item4.setImageResource(R.drawable.sillon5);
                        item5.setImageResource(R.drawable.sillon6);
                        item6.setVisibility(View.INVISIBLE);
                        cbSillon6.setVisibility(View.INVISIBLE);
                        cbSillon1.setChecked(false);
                        cbSillon2.setChecked(false);
                        cbSillon3.setChecked(false);
                        cbSillon4.setChecked(false);
                        cbSillon5.setChecked(false);
                        cbSillon6.setChecked(false);

                        break;
                    case 2:
                        top.setImageResource(R.drawable.top_pufs_sala);
                        item1.setImageResource(R.drawable.sala_puf1);
                        item2.setImageResource(R.drawable.sala_puf2);
                        item3.setImageResource(R.drawable.sala_puf3);
                        item4.setImageResource(R.drawable.sala_puf4);
                        item5.setVisibility(View.INVISIBLE);
                        item6.setVisibility(View.INVISIBLE);
                        cbSillon5.setVisibility(View.INVISIBLE);
                        cbSillon6.setVisibility(View.INVISIBLE);
                        cbSillon1.setChecked(false);
                        cbSillon2.setChecked(false);
                        cbSillon3.setChecked(false);
                        cbSillon4.setChecked(false);
                        cbSillon5.setChecked(false);
                        cbSillon6.setChecked(false);
                        break;
                    case 3:
                        top.setImageResource(R.drawable.top_mesalateral_sala);
                        item1.setImageResource(R.drawable.sala_mesalateral1);
                        item2.setImageResource(R.drawable.sala_mesalateral2);
                        item3.setImageResource(R.drawable.sala_mesalateral3);
                        item4.setImageResource(R.drawable.sala_mesalateral4);
                        item5.setVisibility(View.INVISIBLE);
                        item6.setVisibility(View.INVISIBLE);
                        cbSillon5.setVisibility(View.INVISIBLE);
                        cbSillon6.setVisibility(View.INVISIBLE);
                        cbSillon1.setChecked(false);
                        cbSillon2.setChecked(false);
                        cbSillon3.setChecked(false);
                        cbSillon4.setChecked(false);
                        cbSillon5.setChecked(false);
                        cbSillon6.setChecked(false);
                        break;
                    case 4:
                        top.setImageResource(R.drawable.top_mesadecentro_sala);
                        item1.setImageResource(R.drawable.sala_mesacentro1);
                        item2.setImageResource(R.drawable.sala_mesacentro2);
                        item3.setImageResource(R.drawable.sala_mesacentro3);
                        item4.setImageResource(R.drawable.sala_mesacentro4);
                        item5.setImageResource(R.drawable.sala_mesacentro5);
                        item6.setVisibility(View.INVISIBLE);
                        cbSillon6.setVisibility(View.INVISIBLE);
                        cbSillon1.setChecked(false);
                        cbSillon2.setChecked(false);
                        cbSillon3.setChecked(false);
                        cbSillon4.setChecked(false);
                        cbSillon5.setChecked(false);
                        cbSillon6.setChecked(false);
                        break;
                    case 5:
                        top.setImageResource(R.drawable.top_trinchador_comedor);
                        item1.setImageResource(R.drawable.com_trinchador1);
                        item2.setImageResource(R.drawable.com_trinchador2);
                        item3.setImageResource(R.drawable.com_trinchador3);
                        item4.setImageResource(R.drawable.com_trinchador4);
                        item5.setVisibility(View.INVISIBLE);
                        item6.setVisibility(View.INVISIBLE);
                        cbSillon5.setVisibility(View.INVISIBLE);
                        cbSillon6.setVisibility(View.INVISIBLE);
                        cbSillon1.setChecked(false);
                        cbSillon2.setChecked(false);
                        cbSillon3.setChecked(false);
                        cbSillon4.setChecked(false);
                        cbSillon5.setChecked(false);
                        cbSillon6.setChecked(false);
                        break;
                    case 6:
                        top.setImageResource(R.drawable.top_sillas_comedor);
                        item1.setImageResource(R.drawable.com_silla1);
                        item2.setImageResource(R.drawable.com_silla2);
                        item3.setImageResource(R.drawable.com_silla3);
                        item4.setImageResource(R.drawable.com_silla4);
                        item5.setImageResource(R.drawable.com_silla5);
                        item6.setImageResource(R.drawable.com_silla6);
                        cbSillon1.setChecked(false);
                        cbSillon2.setChecked(false);
                        cbSillon3.setChecked(false);
                        cbSillon4.setChecked(false);
                        cbSillon5.setChecked(false);
                        cbSillon6.setChecked(false);
                        break;
                    case 7:
                        top.setImageResource(R.drawable.top_mesa_comedor);
                        item1.setImageResource(R.drawable.com_mesa1);
                        item2.setImageResource(R.drawable.com_mesa2);
                        item3.setImageResource(R.drawable.com_mesa3);
                        item4.setImageResource(R.drawable.com_mesa4);
                        item5.setImageResource(R.drawable.com_mesa5);
                        item6.setImageResource(R.drawable.com_mesa6);
                        cbSillon1.setChecked(false);
                        cbSillon2.setChecked(false);
                        cbSillon3.setChecked(false);
                        cbSillon4.setChecked(false);
                        cbSillon5.setChecked(false);
                        cbSillon6.setChecked(false);
                        break;
                    case 8:
                        top.setImageResource(R.drawable.top_sillasymesas_terraza);
                        item1.setImageResource(R.drawable.terraza_mesasysillas1);
                        item2.setImageResource(R.drawable.terraza_mesasysillas2);
                        item3.setImageResource(R.drawable.terraza_mesasysillas3);
                        item4.setImageResource(R.drawable.terraza_mesasysillas4);
                        item5.setVisibility(View.INVISIBLE);
                        item6.setVisibility(View.INVISIBLE);
                        cbSillon5.setVisibility(View.INVISIBLE);
                        cbSillon6.setVisibility(View.INVISIBLE);
                        cbSillon1.setChecked(false);
                        cbSillon2.setChecked(false);
                        cbSillon3.setChecked(false);
                        cbSillon4.setChecked(false);
                        cbSillon5.setChecked(false);
                        cbSillon6.setChecked(false);
                        break;
                    case 9:
                        top.setImageResource(R.drawable.top_mubles_terraza);
                        item1.setImageResource(R.drawable.terraza_muebles2);
                        item2.setImageResource(R.drawable.terraza_muebles3);
                        item3.setVisibility(View.INVISIBLE);
                        item4.setVisibility(View.INVISIBLE);
                        item5.setVisibility(View.INVISIBLE);
                        item6.setVisibility(View.INVISIBLE);
                        cbSillon3.setVisibility(View.INVISIBLE);
                        cbSillon4.setVisibility(View.INVISIBLE);
                        cbSillon5.setVisibility(View.INVISIBLE);
                        cbSillon6.setVisibility(View.INVISIBLE);
                        cbSillon1.setChecked(false);
                        cbSillon2.setChecked(false);
                        cbSillon3.setChecked(false);
                        cbSillon4.setChecked(false);
                        cbSillon5.setChecked(false);
                        cbSillon6.setChecked(false);
                        break;
                    case 10:
                        top.setImageResource(R.drawable.top_muebles_recamara);
                        item1.setImageResource(R.drawable.recamara_mueble1);
                        item2.setImageResource(R.drawable.recamara_mueble2);
                        item3.setVisibility(View.INVISIBLE);
                        item4.setVisibility(View.INVISIBLE);
                        item5.setVisibility(View.INVISIBLE);
                        item6.setVisibility(View.INVISIBLE);
                        cbSillon3.setVisibility(View.INVISIBLE);
                        cbSillon4.setVisibility(View.INVISIBLE);
                        cbSillon5.setVisibility(View.INVISIBLE);
                        cbSillon6.setVisibility(View.INVISIBLE);
                        cbSillon1.setChecked(false);
                        cbSillon2.setChecked(false);
                        cbSillon3.setChecked(false);
                        cbSillon4.setChecked(false);
                        cbSillon5.setChecked(false);
                        cbSillon6.setChecked(false);
                        break;

                }
                break;
            case R.id.bn_siguiente_catalogo:
                if (contador <= 10) {
                    contador++;
                }
                if(cbSillon1.isChecked()==false && cbSillon2.isChecked()==false && cbSillon3.isChecked()==false && cbSillon4.isChecked()==false && cbSillon5.isChecked()==false && cbSillon6.isChecked()==false) //en caso de no haber seleccionado alguna
                {
                    Toast.makeText(this, "Seleccione un articulo a agregar", Toast.LENGTH_SHORT).show();
                }else {
                    switch(contador) {
                        case 1:
                            top.setImageResource(R.drawable.top_sillones_sala);
                            item1.setImageResource(R.drawable.sillon1);
                            item2.setImageResource(R.drawable.sillon2);
                            item3.setImageResource(R.drawable.sillon4);
                            item4.setImageResource(R.drawable.sillon5);
                            item5.setImageResource(R.drawable.sillon6);
                            item6.setVisibility(View.INVISIBLE);
                            cbSillon6.setVisibility(View.INVISIBLE);
                            cbSillon1.setChecked(false);
                            cbSillon2.setChecked(false);
                            cbSillon3.setChecked(false);
                            cbSillon4.setChecked(false);
                            cbSillon5.setChecked(false);
                            cbSillon6.setChecked(false);

                            break;
                        case 2:
                            top.setImageResource(R.drawable.top_pufs_sala);
                            item1.setImageResource(R.drawable.sala_puf1);
                            item2.setImageResource(R.drawable.sala_puf2);
                            item3.setImageResource(R.drawable.sala_puf3);
                            item4.setImageResource(R.drawable.sala_puf4);
                            item5.setVisibility(View.INVISIBLE);
                            item6.setVisibility(View.INVISIBLE);
                            cbSillon5.setVisibility(View.INVISIBLE);
                            cbSillon6.setVisibility(View.INVISIBLE);
                            cbSillon1.setChecked(false);
                            cbSillon2.setChecked(false);
                            cbSillon3.setChecked(false);
                            cbSillon4.setChecked(false);
                            cbSillon5.setChecked(false);
                            cbSillon6.setChecked(false);
                            break;
                        case 3:
                            top.setImageResource(R.drawable.top_mesalateral_sala);
                            item1.setImageResource(R.drawable.sala_mesalateral1);
                            item2.setImageResource(R.drawable.sala_mesalateral2);
                            item3.setImageResource(R.drawable.sala_mesalateral3);
                            item4.setImageResource(R.drawable.sala_mesalateral4);
                            item5.setVisibility(View.INVISIBLE);
                            item6.setVisibility(View.INVISIBLE);
                            cbSillon5.setVisibility(View.INVISIBLE);
                            cbSillon6.setVisibility(View.INVISIBLE);
                            cbSillon1.setChecked(false);
                            cbSillon2.setChecked(false);
                            cbSillon3.setChecked(false);
                            cbSillon4.setChecked(false);
                            cbSillon5.setChecked(false);
                            cbSillon6.setChecked(false);
                            break;
                        case 4:
                            top.setImageResource(R.drawable.top_mesadecentro_sala);
                            item1.setImageResource(R.drawable.sala_mesacentro1);
                            item2.setImageResource(R.drawable.sala_mesacentro2);
                            item3.setImageResource(R.drawable.sala_mesacentro3);
                            item4.setImageResource(R.drawable.sala_mesacentro4);
                            item5.setImageResource(R.drawable.sala_mesacentro5);
                            item6.setVisibility(View.INVISIBLE);
                            cbSillon6.setVisibility(View.INVISIBLE);
                            cbSillon1.setChecked(false);
                            cbSillon2.setChecked(false);
                            cbSillon3.setChecked(false);
                            cbSillon4.setChecked(false);
                            cbSillon5.setChecked(false);
                            cbSillon6.setChecked(false);
                            break;
                        case 5:
                            top.setImageResource(R.drawable.top_trinchador_comedor);
                            item1.setImageResource(R.drawable.com_trinchador1);
                            item2.setImageResource(R.drawable.com_trinchador2);
                            item3.setImageResource(R.drawable.com_trinchador3);
                            item4.setImageResource(R.drawable.com_trinchador4);
                            item5.setVisibility(View.INVISIBLE);
                            item6.setVisibility(View.INVISIBLE);
                            cbSillon5.setVisibility(View.INVISIBLE);
                            cbSillon6.setVisibility(View.INVISIBLE);
                            cbSillon1.setChecked(false);
                            cbSillon2.setChecked(false);
                            cbSillon3.setChecked(false);
                            cbSillon4.setChecked(false);
                            cbSillon5.setChecked(false);
                            cbSillon6.setChecked(false);
                            break;
                        case 6:
                            top.setImageResource(R.drawable.top_sillas_comedor);
                            item1.setImageResource(R.drawable.com_silla1);
                            item2.setImageResource(R.drawable.com_silla2);
                            item3.setImageResource(R.drawable.com_silla3);
                            item4.setImageResource(R.drawable.com_silla4);
                            item5.setImageResource(R.drawable.com_silla5);
                            item6.setImageResource(R.drawable.com_silla6);
                            cbSillon1.setChecked(false);
                            cbSillon2.setChecked(false);
                            cbSillon3.setChecked(false);
                            cbSillon4.setChecked(false);
                            cbSillon5.setChecked(false);
                            cbSillon6.setChecked(false);
                            break;
                        case 7:
                            top.setImageResource(R.drawable.top_mesa_comedor);
                            item1.setImageResource(R.drawable.com_mesa1);
                            item2.setImageResource(R.drawable.com_mesa2);
                            item3.setImageResource(R.drawable.com_mesa3);
                            item4.setImageResource(R.drawable.com_mesa4);
                            item5.setImageResource(R.drawable.com_mesa5);
                            item6.setImageResource(R.drawable.com_mesa6);
                            cbSillon1.setChecked(false);
                            cbSillon2.setChecked(false);
                            cbSillon3.setChecked(false);
                            cbSillon4.setChecked(false);
                            cbSillon5.setChecked(false);
                            cbSillon6.setChecked(false);
                            break;
                        case 8:
                            top.setImageResource(R.drawable.top_sillasymesas_terraza);
                            item1.setImageResource(R.drawable.terraza_mesasysillas1);
                            item2.setImageResource(R.drawable.terraza_mesasysillas2);
                            item3.setImageResource(R.drawable.terraza_mesasysillas3);
                            item4.setImageResource(R.drawable.terraza_mesasysillas4);
                            item5.setVisibility(View.INVISIBLE);
                            item6.setVisibility(View.INVISIBLE);
                            cbSillon5.setVisibility(View.INVISIBLE);
                            cbSillon6.setVisibility(View.INVISIBLE);
                            cbSillon1.setChecked(false);
                            cbSillon2.setChecked(false);
                            cbSillon3.setChecked(false);
                            cbSillon4.setChecked(false);
                            cbSillon5.setChecked(false);
                            cbSillon6.setChecked(false);
                            break;
                        case 9:
                            top.setImageResource(R.drawable.top_mubles_terraza);
                            item1.setImageResource(R.drawable.terraza_muebles2);
                            item2.setImageResource(R.drawable.terraza_muebles3);
                            item3.setVisibility(View.INVISIBLE);
                            item4.setVisibility(View.INVISIBLE);
                            item5.setVisibility(View.INVISIBLE);
                            item6.setVisibility(View.INVISIBLE);
                            cbSillon3.setVisibility(View.INVISIBLE);
                            cbSillon4.setVisibility(View.INVISIBLE);
                            cbSillon5.setVisibility(View.INVISIBLE);
                            cbSillon6.setVisibility(View.INVISIBLE);
                            cbSillon1.setChecked(false);
                            cbSillon2.setChecked(false);
                            cbSillon3.setChecked(false);
                            cbSillon4.setChecked(false);
                            cbSillon5.setChecked(false);
                            cbSillon6.setChecked(false);
                            break;
                        case 10:
                            top.setImageResource(R.drawable.top_muebles_recamara);
                            item1.setImageResource(R.drawable.recamara_mueble1);
                            item2.setImageResource(R.drawable.recamara_mueble2);
                            item3.setVisibility(View.INVISIBLE);
                            item4.setVisibility(View.INVISIBLE);
                            item5.setVisibility(View.INVISIBLE);
                            item6.setVisibility(View.INVISIBLE);
                            cbSillon3.setVisibility(View.INVISIBLE);
                            cbSillon4.setVisibility(View.INVISIBLE);
                            cbSillon5.setVisibility(View.INVISIBLE);
                            cbSillon6.setVisibility(View.INVISIBLE);
                            cbSillon1.setChecked(false);
                            cbSillon2.setChecked(false);
                            cbSillon3.setChecked(false);
                            cbSillon4.setChecked(false);
                            cbSillon5.setChecked(false);
                            cbSillon6.setChecked(false);
                            break;
                        case 11:
                            top.setImageResource(R.drawable.top_bancos_cocina);
                            item1.setImageResource(R.drawable.cocina_banco1);
                            item2.setImageResource(R.drawable.cocina_banco2);
                            item3.setImageResource(R.drawable.cocina_banco3);
                            item4.setImageResource(R.drawable.cocina_banco4);
                            item5.setVisibility(View.INVISIBLE);
                            item6.setVisibility(View.INVISIBLE);
                            cbSillon5.setVisibility(View.INVISIBLE);
                            cbSillon6.setVisibility(View.INVISIBLE);
                            cbSillon1.setChecked(false);
                            cbSillon2.setChecked(false);
                            cbSillon3.setChecked(false);
                            cbSillon4.setChecked(false);
                            cbSillon5.setChecked(false);
                            cbSillon6.setChecked(false);
                            break;
                    }
                }
                break;
        }

    }
}
