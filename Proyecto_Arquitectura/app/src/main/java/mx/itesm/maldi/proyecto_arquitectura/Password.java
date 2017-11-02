package mx.itesm.maldi.proyecto_arquitectura;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by maldi on 31/10/2017.
 */

public class Password extends AppCompatActivity implements View.OnClickListener {

    Button enter_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.password);
    enter_button = (Button) findViewById(R.id.enter);
    enter_button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i;
        switch (v.getId()) {
            case R.id.enter: //Enter
                EditText pass = (EditText) findViewById(R.id.password);
                String pass_temporal_pass = "admin";
                String pass_content = pass.getText().toString();
                if (pass_content.equals(pass_temporal_pass)) {
                    Toast.makeText(getApplication(),"Password valid", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplication(),"Password not valid", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }

}
