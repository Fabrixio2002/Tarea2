package hn.uth.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Informacion extends AppCompatActivity {
    TextView nombre,apellido,correo,edad;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_informacion);
        nombre=findViewById(R.id.nombre);
        apellido=findViewById(R.id.apellido);
        correo=findViewById(R.id.correo);
        edad=findViewById(R.id.edad);
        Intent intent = getIntent();
        String name = intent.getStringExtra("Nombre");
        String ape = intent.getStringExtra("Apellido");
        String eda = intent.getStringExtra("Edad");
        String corre = intent.getStringExtra("Correo");

        nombre.setText(name);
        apellido.setText(ape);
        correo.setText(corre);
        edad.setText(eda);




    }
}