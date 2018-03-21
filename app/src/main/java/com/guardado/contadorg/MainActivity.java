package com.guardado.contadorg;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    TextView txtA;
    TextView txtB;
    Button btnA;
    Button btnB;
    Button btnReinicar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       txtA = (TextView) findViewById(R.id.txvMA);
        txtB = (TextView) findViewById(R.id.txvMB);
        btnA = (Button) findViewById(R.id.txvGA);
        btnB = (Button) findViewById(R.id.txvGB);
        btnReinicar = (Button) findViewById(R.id.btnReinicar);
        txtA.setText("0");
        txtB.setText("0");

        // creando los eventos
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int m1=Integer.parseInt((String)txtA.getText());
                m1=m1+1;
                txtA.setText(Integer.toString(m1));
            }
        });

        btnB.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                int m2=Integer.parseInt((String)txtB.getText().toString());
                m2=m2+1;
                txtB.setText(Integer.toString(m2));
            }
        });

        btnReinicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txtA.setText("0");
                txtB.setText("0");
            }
        });
        /*Aca le activamos el evento de click a nuestros botones
        btnA.setOnClickListener(this);
        btnB.setOnClickListener(this);
        btnReinicar.setOnClickListener(this);*/
    }

    /*@Override
    public void onClick(View view) {
        int m1,m2;
        switch (view.getId())
        {
            case R.id.btnEquipoA:
                m1=Integer.parseInt((String)txtA.getText());
                m1=m1+1;
                txtA.setText(Integer.toString(m1));
                break;
            case R.id.btnEquipoB:
                m2=Integer.parseInt((String)txtB.getText().toString());
                m2=m2+1;
                txtB.setText(Integer.toString(m2));
                break;
            case R.id.btnReinicar:
                txtA.setText("0");
                txtB.setText("0");
                break;
        }
    }*/
}
