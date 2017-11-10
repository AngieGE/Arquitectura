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
import android.widget.ImageView;

public class Custom_alert_layout extends Dialog implements View.OnClickListener {

    private Button close;
    private ImageView zoom;
    public Activity c;
    public int ima;

    public Custom_alert_layout(Activity a, int i) {
        super(a);
        this.c = a;
        this.ima = i;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_alert_layout);
        close = (Button) findViewById(R.id.cerrar);

        zoom = (ImageView) findViewById(R.id.zoom_image);
        zoom.setImageResource(ima);
        close.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.cerrar: //Enter
                dismiss();
                break;
        }


    }
}
