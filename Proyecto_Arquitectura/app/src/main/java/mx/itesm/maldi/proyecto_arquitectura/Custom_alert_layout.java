package mx.itesm.maldi.proyecto_arquitectura;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Custom_alert_layout extends Dialog implements View.OnClickListener {

    private Button close, enter;
    public Activity c;
    public Dialog d;
    public Button yes, no;

    public Custom_alert_layout(Activity a) {
        super(a);
        this.c = a;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_alert_layout);
        close = (Button) findViewById(R.id.cerrar);
        enter = (Button) findViewById(R.id.siguiente);

        close.setOnClickListener(this);
        enter.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.cerrar: //Enter
                dismiss();
                break;
            case R.id.siguiente: //Enter
                c.finish();
                break;
        }


    }
}
