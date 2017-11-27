package mx.itesm.maldi.proyecto_arquitectura;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Catalogo extends AppCompatActivity implements View.OnClickListener {

    private CheckBox cbSillon1, cbSillon2, cbSillon3, cbSillon4, cbSillon5, cbSillon6;
    int[] arreglo = new int[15];
    private ImageView imagen, imagen2, imagen3, imagen4, imagen5, imagen6, imagen7, imagen8, imagen9, imagen10, imagen11, imagen12, imagen13, imagen14, imagen15, top;
    private ImageButton item1, item2, item3, item4, item5, item6;
    private Button atras, siguiente, omitir;
    int bandera = 0;
    private TextView precio, precio2, precio3, precio4, precio5, precio6, precio7, precio8, precio9, precio10, precio11, precio12, precio13, precio14, precio15, total_txt;
    int total = 3000000;
    int check = 0;
    int temporal = 0;
    int temporal2 = 0;
    int temporal3 = 0;
    int temporal4 = 0;
    int temporal5 = 0;
    int temporal6 = 0;
    int temporal7 = 0;
    int temporal8 = 0;
    int temporal9 = 0;
    int temporal10 = 0;
    int temporal11 = 0;
    int temporal12 = 0;
    int temporal13 = 0;
    int temporal14 = 0;
    int contador = 0; //¿Que hace esto?
    int contador1 = 0; //¿Que hace esto?


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo);
        //Declatro las check box
        cbSillon1 = (CheckBox) findViewById(R.id.cb1);
        cbSillon2 = (CheckBox) findViewById(R.id.cb2);
        cbSillon3 = (CheckBox) findViewById(R.id.cb3);
        cbSillon4 = (CheckBox) findViewById(R.id.cb4);
        cbSillon5 = (CheckBox) findViewById(R.id.cb5);
        cbSillon6 = (CheckBox) findViewById(R.id.cb6);
        //IMagenes que aparecen en la columna derecha del intent
        imagen = (ImageView) findViewById(R.id.carrito_seleccion);
        imagen2 = (ImageView) findViewById(R.id.carrito_seleccion2);
        imagen3 = (ImageView) findViewById(R.id.carrito_seleccion3);
        imagen4 = (ImageView) findViewById(R.id.carrito_seleccion4);
        imagen5 = (ImageView) findViewById(R.id.carrito_seleccion5);
        imagen6 = (ImageView) findViewById(R.id.carrito_seleccion6);
        imagen7 = (ImageView) findViewById(R.id.carrito_seleccion7);
        imagen8 = (ImageView) findViewById(R.id.carrito_seleccion8);
        imagen9 = (ImageView) findViewById(R.id.carrito_seleccion9);
        imagen10 = (ImageView) findViewById(R.id.carrito_seleccion10);
        imagen11 = (ImageView) findViewById(R.id.carrito_seleccion11);
        imagen12 = (ImageView) findViewById(R.id.carrito_seleccion12);
        imagen13 = (ImageView) findViewById(R.id.carrito_seleccion13);
        imagen14 = (ImageView) findViewById(R.id.carrito_seleccion14);
        imagen15 = (ImageView) findViewById(R.id.carrito_seleccion15);
        //Botones y más
        top = (ImageView) findViewById(R.id.top); //La imagen que muestra donde esta el mueble. Banner de arriba
        atras = (Button) findViewById(R.id.bn_atras_catalogo);
        siguiente = (Button) findViewById(R.id.bn_siguiente_catalogo);
        omitir = (Button) findViewById(R.id.omitir);
        total_txt = (TextView) findViewById(R.id.tv_total); //La suma de los precios TV.
        //str.insert(str.length() - 4, ",");
        //System.out.println(str + "MIRAMEEEEEEEEEEEEEEEE");
        //total_txt.setText(str);
        //Los precios individuales del lado derecho del carrito
        precio = (TextView) findViewById(R.id.precio1);
        precio2 = (TextView) findViewById(R.id.precio2);
        precio3 = (TextView) findViewById(R.id.precio3);
        precio4 = (TextView) findViewById(R.id.precio4);
        precio5 = (TextView) findViewById(R.id.precio5);
        precio6 = (TextView) findViewById(R.id.precio6);
        precio7 = (TextView) findViewById(R.id.precio7);
        precio8 = (TextView) findViewById(R.id.precio8);
        precio9 = (TextView) findViewById(R.id.precio9);
        precio10 = (TextView) findViewById(R.id.precio10);
        precio11 = (TextView) findViewById(R.id.precio11);
        precio12 = (TextView) findViewById(R.id.precio12);
        precio13 = (TextView) findViewById(R.id.precio13);
        precio14 = (TextView) findViewById(R.id.precio14);
        precio15 = (TextView) findViewById(R.id.precio15);
        //IMagenes que aparecen en la columna izquierda del intent
        item1 = (ImageButton) findViewById(R.id.item1);
        item2 = (ImageButton) findViewById(R.id.item2);
        item3 = (ImageButton) findViewById(R.id.item3);
        item4 = (ImageButton) findViewById(R.id.item4);
        item5 = (ImageButton) findViewById(R.id.item5);
        item6 = (ImageButton) findViewById(R.id.item6);
        //Les agrego su OnClickListener
        cbSillon1.setOnClickListener(this);
        cbSillon2.setOnClickListener(this);
        cbSillon3.setOnClickListener(this);
        cbSillon4.setOnClickListener(this);
        cbSillon5.setOnClickListener(this);
        cbSillon6.setOnClickListener(this);
        //Botones siguiente, atras y omitir
        atras.setOnClickListener(this);
        siguiente.setOnClickListener(this);
        omitir.setOnClickListener(this);
        //Botones de items
        item1.setOnClickListener(this);
        item2.setOnClickListener(this);
        item3.setOnClickListener(this);
        item4.setOnClickListener(this);
        item5.setOnClickListener(this);
        item6.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.item1: //zoom a estilo 1
                if (contador == 0) {
                    System.out.println("entre al zoom 0 ------------------------------");
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item1_cont0);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 1) {
                    System.out.println("entre al zoom 1 ------------------------------");
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item1_cont1);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 2) {
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item1_cont2);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 3) {
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item1_cont3);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();

                } else if (contador == 4) {
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item1_cont4);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 5) {
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item1_cont5);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 6) {
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item1_cont6);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 7) {
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item1_cont7);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 8) {
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item1_cont8);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 9) {
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item1_cont9);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 10) {
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item1_cont10);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 11) {
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item1_cont11);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                }
                break;
            case R.id.item2: //zoom a estilo 1
                if (contador == 0) { //Sofas
                    System.out.println("entre al zoom 0 ------------------------------");
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item2_cont0);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 1) {
                    System.out.println("entre al zoom 1 ------------------------------");
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item2_cont1);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 2) { //Pufs
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item2_cont2);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 3) { //Mesa lateral
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item2_cont3);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();

                } else if (contador == 4) { //Mesa de centro
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item2_cont4);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 5) { //Trinchador
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item2_cont5);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 6) { //sillas
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item2_cont6);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 7) { //Mesa
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item2_cont7);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 8) {//camas
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item2_cont8);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 9) { //Muebles
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item2_cont9);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 10) {
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item2_cont10);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 11) {
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item2_cont11);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                }
                break;
            case R.id.item3: //zoom a estilo 1
                if (contador == 0) { //Sofas
                    System.out.println("entre al zoom 0 ------------------------------");
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item3_count0);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 1) {
                    System.out.println("entre al zoom 1 ------------------------------");
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item3_count1);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 2) { //Pufs
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item3_count2);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 3) { //Mesa lateral
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item3_count3);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();

                } else if (contador == 4) { //Mesa de centro
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item3_count4);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 5) { //Trinchador
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item3_count5);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 6) { //sillas
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item3_count6);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 7) { //Mesa
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item3_count7);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 9) { //Muebles ULTIMO
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item3_count9);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 10) { //Bancos
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item3_count10);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 11) {
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item3_count11);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                }
                break;
            case R.id.item4: //zoom a estilo 1
                if (contador == 0) { //Sofas
                    System.out.println("entre al zoom 0 ------------------------------");
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item4_cont0);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 1) { //sillones
                    System.out.println("entre al zoom 1 ------------------------------");
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item4_cont1);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 3) { //Mesa lateral
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item4_cont3);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();

                } else if (contador == 4) { //Mesa de centro
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item4_cont4);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 5) { //Trinchador
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item4_cont5);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 6) { //sillas
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item4_cont6);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 7) { //Mesa
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item4_cont7);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 10) { //1
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item4_cont10);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 11) {
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item4_cont11);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                }
                break;
            case R.id.item5: //zoom a estilo 1
                if (contador == 0) { //Sofas
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item5_cont0);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 1) { //sillones ULTIMA
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item5_cont1);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 4) { //Mesa de centro
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item5_cont4);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 6) { //sillas
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item5_cont6);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 7) { //Mesa
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item5_cont7);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                }
                break;
            case R.id.item6: //zoom a estilo 1
                if (contador == 0) { //Sofas
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item6_cont0);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 6) { //sillas
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item6_cont6);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                } else if (contador == 7) { //Mesa
                    Custom_alert_layout cdd = new Custom_alert_layout(Catalogo.this, R.drawable.item6_cont7);
                    cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                    cdd.show();
                }
                break;

            case R.id.cb1: //Deseleccionar las otras en caso de seleccionar cb1
                check = 1;
                set_checkbuttons_invisible(check);
                if (cbSillon1.isChecked() == false) {
                    checkbox_catalogo(contador1);
                } else {
                    Drawable asistente = item1.getDrawable();
                    carrito_image_fill(contador1, asistente);

                }
                break;
            case R.id.cb2: //Deseleccionar la A en caso de haberla seleccionado antes
                check = 2;
                set_checkbuttons_invisible(check);
                if (cbSillon2.isChecked() == false) {
                    checkbox_catalogo(contador1);
                } else {
                    Drawable asistente = item2.getDrawable();
                    carrito_image_fill(contador1, asistente);


                }
                break;
            case R.id.cb3: //Deseleccionar la A en caso de haberla seleccionado antes
                check = 3;
                set_checkbuttons_invisible(check);
                if (cbSillon3.isChecked() == false) {
                    checkbox_catalogo(contador1);
                } else {
                    Drawable asistente = item3.getDrawable();
                    carrito_image_fill(contador1, asistente);
                }
                break;
            case R.id.cb4: //Deseleccionar la A en caso de haberla seleccionado antes
                check = 4;
                set_checkbuttons_invisible(check);
                if (cbSillon4.isChecked() == false) {
                    checkbox_catalogo(contador1);
                } else {
                    Drawable asistente = item4.getDrawable();
                    carrito_image_fill(contador1, asistente);
                }
                break;
            case R.id.cb5: //Deseleccionar la A en caso de haberla seleccionado antes
                check = 5;
                set_checkbuttons_invisible(check);
                if (cbSillon5.isChecked() == false) {
                    checkbox_catalogo(contador1);
                } else {
                    Drawable asistente = item5.getDrawable();
                    carrito_image_fill(contador1, asistente);
                }
                break;
            case R.id.cb6: //Deseleccionar la A en caso de haberla seleccionado antes
                check = 6;
                set_checkbuttons_invisible(check);
                if (cbSillon6.isChecked() == false) {
                   checkbox_catalogo(contador1);
                } else {
                    Drawable asistente = item6.getDrawable();
                    carrito_image_fill(contador1, asistente);
                }
                break;
            case R.id.bn_atras_catalogo: //Deseleccionar la A en caso de haberla seleccionado antes
                image_visibility_to_visible();
                image_visibility_to_invisible(contador);
                if (contador == 0) {
                    i = new Intent(Catalogo.this, Cotizacion.class);
                    startActivity(i);
                } else {
                    if (contador == 1) {
                            total = 0;
                        //String x = Integer.toString(total);
                        //StringBuilder str = new StringBuilder(x);
                        //str.insert(str.length() - 3, ",");
                        total_txt.setText("0.0");
                            //  total_txt.setText("$ " + str); //antes decia: total_txt.setText("$ "+total);
                    }else{
                        total = arreglo[contador - 2];
                        String x = Integer.toString(total);
                        StringBuilder str = new StringBuilder(x);
                        str.insert(str.length() - 3, ",");
                        total_txt.setText("" + str);
                    }
                    contador1 = contador;
                    contador--;
                    contador1--;

                    image_fill(contador);
                }
                break;
            case R.id.bn_siguiente_catalogo:

                if (cbSillon1.isChecked() == false && cbSillon2.isChecked() == false && cbSillon3.isChecked() == false && cbSillon4.isChecked() == false && cbSillon5.isChecked() == false && cbSillon6.isChecked() == false) //en caso de no haber seleccionado alguna
                {
                    Toast.makeText(this, "Seleccione un articulo a agregar", Toast.LENGTH_SHORT).show();
                } else {
                    if (contador < 14) {
                        String x = Integer.toString(total);
                        StringBuilder str = new StringBuilder(x);
                        str.insert(str.length() - 3, ",");
                        total_txt.setText("" + str);
                        contador++;
                        contador1++;
                    } else {
                        i = new Intent(Catalogo.this, Check_cuenta.class);
                        i.putExtra("int_value", total);
                        startActivity(i);
                    }
                    image_visibility_to_visible();
                    image_fill(contador);
                }
                break;
            case R.id.omitir:
                contador++;
                image_fill(contador);
                image_visibility_to_visible();
                break;
        }

    }

    //Rellenador de imagenes en el catalogo
    public void image_fill(int contador) {
        switch (contador) {
            case 0:

                top.setImageResource(R.drawable.recamara2_top);
                item1.setImageResource(R.drawable.sofa1);
                item2.setImageResource(R.drawable.sofa2);
                item3.setImageResource(R.drawable.sofa3);
                //item1.setImageResource(R.drawable.recamara2_mueble1);
                //item2.setImageResource(R.drawable.recamara2_mueble2);
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
                item4.setVisibility(View.INVISIBLE);
                item5.setVisibility(View.INVISIBLE);
                item6.setVisibility(View.INVISIBLE);
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
            case 11:
                top.setImageResource(R.drawable.top_sillasymesas_terraza);
                item1.setImageResource(R.drawable.terraza_mesasysillas1);
                item2.setImageResource(R.drawable.terraza_mesasysillas4);
                item3.setImageResource(R.drawable.terraza_mesasysillas3);
                item4.setVisibility(View.INVISIBLE);
                item5.setVisibility(View.INVISIBLE);
                item6.setVisibility(View.INVISIBLE);
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
            case 8:
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
            case 10:
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
            case 12:
                top.setImageResource(R.drawable.recamaraprincipal_top);
                item1.setImageResource(R.drawable.recamaraprincipal_mueble1);
                //item2.setImageResource(R.drawable.recamaraprincipal_mueble2);
                item2.setImageResource(R.drawable.recamaraprincipal_mueble3);
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
            case 13:
                top.setImageResource(R.drawable.recamara2_top);
                item1.setImageResource(R.drawable.recamara2_mueble1);
                item2.setImageResource(R.drawable.recamara2_mueble2);
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
            case 14:
                top.setImageResource(R.drawable.recamara3_top);
                item1.setImageResource(R.drawable.recamara3_mueble1);
                item2.setImageResource(R.drawable.recamara3_mueble2);
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
    }
    //Coloca todas las imagenes en visibles
    public void image_visibility_to_visible() {
        item1.setVisibility(View.VISIBLE);
        item2.setVisibility(View.VISIBLE);
        item3.setVisibility(View.VISIBLE);
        item4.setVisibility(View.VISIBLE);
        item5.setVisibility(View.VISIBLE);
        item6.setVisibility(View.VISIBLE);
        cbSillon1.setVisibility(View.VISIBLE);
        cbSillon2.setVisibility(View.VISIBLE);
        cbSillon3.setVisibility(View.VISIBLE);
        cbSillon4.setVisibility(View.VISIBLE);
        cbSillon5.setVisibility(View.VISIBLE);
        cbSillon6.setVisibility(View.VISIBLE);
    }
    //Dependiendo de que seccion coloca algunas imagenes en invisibles
    public void image_visibility_to_invisible(int contador) {
        switch (contador) {
            //case 0:
              //  imagen.setVisibility(View.INVISIBLE);
               // precio.setVisibility(View.INVISIBLE);
               // break;
            case 1:
                imagen.setVisibility(View.INVISIBLE);
                precio.setVisibility(View.INVISIBLE);
                imagen2.setVisibility(View.INVISIBLE);
                precio2.setVisibility(View.INVISIBLE);
                break;
            case 2:
                imagen2.setVisibility(View.INVISIBLE);
                precio2.setVisibility(View.INVISIBLE);
                imagen3.setVisibility(View.INVISIBLE);
                precio3.setVisibility(View.INVISIBLE);
                break;
            case 3:
                imagen3.setVisibility(View.INVISIBLE);
                precio3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                imagen4.setVisibility(View.INVISIBLE);
                precio4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                imagen5.setVisibility(View.INVISIBLE);
                precio5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                imagen6.setVisibility(View.INVISIBLE);
                precio6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                imagen7.setVisibility(View.INVISIBLE);
                precio7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                imagen8.setVisibility(View.INVISIBLE);
                precio8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                imagen9.setVisibility(View.INVISIBLE);
                precio9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                imagen10.setVisibility(View.INVISIBLE);
                precio10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                imagen11.setVisibility(View.INVISIBLE);
                precio11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                imagen12.setVisibility(View.INVISIBLE);
                precio12.setVisibility(View.INVISIBLE);
                break;
            case 13:
                imagen13.setVisibility(View.INVISIBLE);
                precio13.setVisibility(View.INVISIBLE);
                break;
            case 14:
                imagen14.setVisibility(View.INVISIBLE);
                precio14.setVisibility(View.INVISIBLE);
                break;

        }
    }
    //Rellana la imgaen en el catalogo cuando el usuario selecione una imagen
    public void carrito_image_fill(int contador, Drawable asistente){
        switch (contador1) {
            case 0:
                imagen.setVisibility(View.VISIBLE);
                imagen.setImageDrawable(asistente);
                arreglo[contador1] = 10000;
                total = arreglo[contador];
                precio.setText("10,000");
                precio.setVisibility(View.VISIBLE);
                break;
            case 1:
                arreglo[contador1] = 12500;
                total = arreglo[contador1]+arreglo[contador1-1];
                arreglo[contador1] = total;
                imagen2.setVisibility(View.VISIBLE);
                imagen2.setImageDrawable(asistente);
                precio2.setText("12,500");
                precio2.setVisibility(View.VISIBLE);
                break;
            case 2:
                arreglo[contador1] = 30500;
                total = arreglo[contador1]+arreglo[contador1-1] ;
                arreglo[contador1] = total;
                imagen3.setVisibility(View.VISIBLE);
                imagen3.setImageDrawable(asistente);
                precio3.setText("30,500");
                precio3.setVisibility(View.VISIBLE);
                break;
            case 3:
                arreglo[contador1] = 25000;
                total = arreglo[contador1]+arreglo[contador1-1] ;
                arreglo[contador1] = total;
                imagen4.setVisibility(View.VISIBLE);
                imagen4.setImageDrawable(asistente);
                precio4.setText("25,000");
                precio4.setVisibility(View.VISIBLE);
                break;
            case 4:
                arreglo[contador1] = 10000;
                total = arreglo[contador1]+arreglo[contador1-1] ;
                arreglo[contador1] = total;
                imagen5.setVisibility(View.VISIBLE);
                imagen5.setImageDrawable(asistente);
                precio5.setText("10,000");
                precio5.setVisibility(View.VISIBLE);
                break;
            case 5:
                arreglo[contador1] = 18000;
                total = arreglo[contador1]+arreglo[contador1-1] ;
                arreglo[contador1] = total;
                imagen6.setVisibility(View.VISIBLE);
                imagen6.setImageDrawable(asistente);
                precio6.setText("18,000");
                precio6.setVisibility(View.VISIBLE);
                break;
            case 6:
                arreglo[contador1] = 50000;
                total = arreglo[contador1]+arreglo[contador1-1] ;
                arreglo[contador1] = total;
                imagen7.setVisibility(View.VISIBLE);
                imagen7.setImageDrawable(asistente);
                precio7.setText("50,000");
                precio7.setVisibility(View.VISIBLE);
                break;
            case 7:
                arreglo[contador1] = 13000;
                total = arreglo[contador1]+arreglo[contador1-1] ;
                arreglo[contador1] = total;
                imagen8.setVisibility(View.VISIBLE);
                imagen8.setImageDrawable(asistente);
                precio8.setText("13,000");
                precio8.setVisibility(View.VISIBLE);
                break;
            case 8:
                arreglo[contador1] = 30500;
                total = arreglo[contador1]+arreglo[contador1-1] ;
                arreglo[contador1] = total;
                imagen9.setVisibility(View.VISIBLE);
                imagen9.setImageDrawable(asistente);
                precio9.setText("30,500");
                precio9.setVisibility(View.VISIBLE);
                break;
            case 9:
                arreglo[contador1] = 20500;
                total = arreglo[contador1]+arreglo[contador1-1] ;
                arreglo[contador1] = total;
                imagen10.setVisibility(View.VISIBLE);
                imagen10.setImageDrawable(asistente);
                precio10.setText("20,500");
                precio10.setVisibility(View.VISIBLE);
                break;
            case 10:
                arreglo[contador1] = 12550;
                total = arreglo[contador1]+arreglo[contador1-1] ;
                arreglo[contador1] = total;
                imagen11.setVisibility(View.VISIBLE);
                imagen11.setImageDrawable(asistente);
                precio11.setText("12,550");
                precio11.setVisibility(View.VISIBLE);
                break;
            case 11:
                arreglo[contador1] = 17000;
                total = arreglo[contador1]+arreglo[contador1-1] ;
                arreglo[contador1] = total;
                imagen12.setVisibility(View.VISIBLE);
                imagen12.setImageDrawable(asistente);
                precio12.setText("17,000");
                precio12.setVisibility(View.VISIBLE);
                break;
            case 12:
                arreglo[contador1] = 7000;
                total = arreglo[contador1]+arreglo[contador1-1] ;
                arreglo[contador1] = total;
                imagen13.setVisibility(View.VISIBLE);
                imagen13.setImageDrawable(asistente);
                precio13.setText("7,000");
                precio13.setVisibility(View.VISIBLE);
                break;
            case 13:
                arreglo[contador1] = 8000;
                total = arreglo[contador1]+arreglo[contador1-1] ;
                arreglo[contador1] = total;
                imagen14.setVisibility(View.VISIBLE);
                imagen14.setImageDrawable(asistente);
                precio14.setText("8,000");
                precio14.setVisibility(View.VISIBLE);
                break;
            case 14:
                arreglo[contador1] = 11000;
                total = arreglo[contador1]+arreglo[contador1-1] ;
                arreglo[contador1] = total;
                imagen15.setVisibility(View.VISIBLE);
                imagen15.setImageDrawable(asistente);
                precio15.setText("11,000");
                precio15.setVisibility(View.VISIBLE);
                break;
        }
    }
    //Dependiendo de que cacilla se selecciono en caso de seleccio continua cabia la imagen por la que selecciono
    public void checkbox_catalogo(int contador) {
        switch (contador1) {
            case 1:
                imagen.setBackgroundResource(R.drawable.blanco);
                //total -= temporal;
                precio.setVisibility(View.INVISIBLE);
                break;
            case 2:
                //total -= temporal2;
                imagen2.setBackgroundResource(R.drawable.blanco);
                precio2.setVisibility(View.INVISIBLE);
                break;
            case 3:
                //total -= temporal3;
                imagen3.setBackgroundResource(R.drawable.blanco);
                precio3.setVisibility(View.INVISIBLE);
                break;
            case 4:
                //total -= temporal4;
                imagen4.setBackgroundResource(R.drawable.blanco);
                precio4.setVisibility(View.INVISIBLE);
                break;
            case 5:
                //total -= temporal5;
                imagen5.setBackgroundResource(R.drawable.blanco);
                precio5.setVisibility(View.INVISIBLE);
                break;
            case 6:
                //total -= temporal6;
                imagen6.setBackgroundResource(R.drawable.blanco);
                precio6.setVisibility(View.INVISIBLE);
                break;
            case 7:
                //total -= temporal7;
                imagen7.setBackgroundResource(R.drawable.blanco);
                precio7.setVisibility(View.INVISIBLE);
                break;
            case 8:
                //total -= temporal8;
                imagen8.setBackgroundResource(R.drawable.blanco);
                precio8.setVisibility(View.INVISIBLE);
                break;
            case 9:
                //total += temporal9;
                imagen9.setBackgroundResource(R.drawable.blanco);
                precio9.setVisibility(View.INVISIBLE);
                break;
            case 10:
                //total -= temporal10;
                imagen10.setBackgroundResource(R.drawable.blanco);
                precio10.setVisibility(View.INVISIBLE);
                break;
            case 11:
                //total -= temporal11;
                imagen11.setBackgroundResource(R.drawable.blanco);
                precio11.setVisibility(View.INVISIBLE);
                break;
            case 12:
                //total -= temporal12;
                imagen11.setBackgroundResource(R.drawable.blanco);
                precio11.setVisibility(View.INVISIBLE);
                break;
            case 13:
                //total -= temporal13;
                imagen11.setBackgroundResource(R.drawable.blanco);
                precio11.setVisibility(View.INVISIBLE);
                break;
            case 14:
                //total -= temporal14;
                imagen11.setBackgroundResource(R.drawable.blanco);
                precio11.setVisibility(View.INVISIBLE);
                break;
        }

    }
    //Zoom a las imagenes en los items
    public void set_checkbuttons_invisible (int asistente) {
        switch(asistente)
        {
            case 1:
                cbSillon2.setChecked(false);
                cbSillon3.setChecked(false);
                cbSillon4.setChecked(false);
                cbSillon5.setChecked(false);
                cbSillon6.setChecked(false);
                break;
            case 2:
                cbSillon1.setChecked(false);
                cbSillon3.setChecked(false);
                cbSillon4.setChecked(false);
                cbSillon5.setChecked(false);
                cbSillon6.setChecked(false);
                break;
            case 3:
                cbSillon1.setChecked(false);
                cbSillon2.setChecked(false);
                cbSillon4.setChecked(false);
                cbSillon5.setChecked(false);
                cbSillon6.setChecked(false);
                break;
            case 4:
                cbSillon1.setChecked(false);
                cbSillon3.setChecked(false);
                cbSillon2.setChecked(false);
                cbSillon5.setChecked(false);
                cbSillon6.setChecked(false);
                break;
            case 5:
                cbSillon1.setChecked(false);
                cbSillon3.setChecked(false);
                cbSillon4.setChecked(false);
                cbSillon2.setChecked(false);
                cbSillon6.setChecked(false);
                break;
            case 6:
                cbSillon1.setChecked(false);
                cbSillon3.setChecked(false);
                cbSillon4.setChecked(false);
                cbSillon5.setChecked(false);
                cbSillon2.setChecked(false);
                break;
        }

    }
}