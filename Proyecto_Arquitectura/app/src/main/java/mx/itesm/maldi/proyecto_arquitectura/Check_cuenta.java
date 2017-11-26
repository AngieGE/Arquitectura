package mx.itesm.maldi.proyecto_arquitectura;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class Check_cuenta extends AppCompatActivity implements View.OnClickListener {

    private TextView total, iva, sumatoria;
    private Button atras, confirmar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_cuenta);
        total = (TextView) findViewById(R.id.Total);
        iva = (TextView) findViewById(R.id.iva);
        sumatoria = (TextView) findViewById(R.id.total_final);
        atras = (Button) findViewById(R.id.atras);
        confirmar = (Button) findViewById(R.id.confirmar);
        Intent intent = getIntent();
        int temp = intent.getIntExtra("int_value", 0);
        String x = Integer.toString(temp);
        StringBuilder str = new StringBuilder(x);
        str.insert(str.length() - 3, ",");
        total.setText("$ " + str);
        int asist_iva = (temp * 16) / 100;
        String y = Integer.toString(asist_iva);
        StringBuilder stry = new StringBuilder(y);
        stry.insert(stry.length() - 3, ",");
        iva.setText("$ " + stry);
        int asist_sumatoria = temp + asist_iva;
        String z = Integer.toString(asist_sumatoria);
        StringBuilder strz = new StringBuilder(z);
        strz.insert(strz.length() - 3, ",");
        sumatoria.setText("$ " + strz);

        atras.setOnClickListener(this);
        confirmar.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.atras:
                i = new Intent(Check_cuenta.this, Catalogo.class);
                startActivity(i);
                break;

            case R.id.confirmar:
                i = new Intent(Check_cuenta.this, Final.class);
                startActivity(i);
                break;

        }
    }
}
