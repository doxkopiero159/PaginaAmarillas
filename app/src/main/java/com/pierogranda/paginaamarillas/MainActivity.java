package com.pierogranda.paginaamarillas;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    private Button buscador;
    private Button ciudades;
    private Button cerca;
    private EditText ditBusca;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ditBusca=(EditText)findViewById(R.id.editBusqueda);
        buscador=(Button)findViewById(R.id.imgButon);
        ciudades=(Button)findViewById(R.id.butCiudad);
        cerca=(Button)findViewById(R.id.cerca);







    }
}
