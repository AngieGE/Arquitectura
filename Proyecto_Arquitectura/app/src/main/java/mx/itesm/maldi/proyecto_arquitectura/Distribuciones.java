package mx.itesm.maldi.proyecto_arquitectura;

<<<<<<< HEAD
import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
=======
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
>>>>>>> e925fc29eb557115d0c4ea1d1fb5d149254bf9e9
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

<<<<<<< HEAD
public class Distribuciones extends AppCompatActivity implements View.OnClickListener{
=======
public class Distribuciones extends AppCompatActivity implements View.OnClickListener  {
>>>>>>> e925fc29eb557115d0c4ea1d1fb5d149254bf9e9

    private ImageButton dis1, dis2, dis3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_distribuciones);
        //declaro mis botones
         dis1= (ImageButton) findViewById(R.id.distribucion1);
         dis2= (ImageButton) findViewById(R.id.distribucion2);
         dis3= (ImageButton) findViewById(R.id.distribucion3);
        //Les agrego imagen
        dis1.setImageResource(R.drawable.distribucion1);
        dis2.setImageResource(R.drawable.distribucion2);
        dis3.setImageResource(R.drawable.distribucion3);
<<<<<<< HEAD
        //accesibilidad para hacer click
=======
        dis1.setOnClickListener(this);
>>>>>>> e925fc29eb557115d0c4ea1d1fb5d149254bf9e9


    }

<<<<<<< HEAD
    @Override
    public void onClick(View v) {

    }

=======
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.distribucion1: //Enter
                Custom_alert_layout cdd = new Custom_alert_layout(Distribuciones.this);
                cdd.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                cdd.show();
                break;
            case R.id.distribucion2: //Enter

                break;
            case R.id.distribucion3: //Enter

                break;
        }

    }
>>>>>>> e925fc29eb557115d0c4ea1d1fb5d149254bf9e9
}
