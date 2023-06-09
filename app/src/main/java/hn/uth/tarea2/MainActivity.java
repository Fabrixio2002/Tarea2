package hn.uth.tarea2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Nombre2,Apellidos2,Edad2,Correo2;
    Button btnEnviar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nombre2=(EditText)findViewById(R.id.Nombre);
        Apellidos2=findViewById(R.id.Apellido);
        Edad2=findViewById(R.id.Edad);
        Correo2=findViewById(R.id.Correa);
        btnEnviar=findViewById(R.id.btnEnviar)

     ;

     btnEnviar.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             String nombre=Nombre2.getText().toString();
             String apellido=Apellidos2.getText().toString();
             String correo=Correo2.getText().toString();
             String edad=Edad2.getText().toString();
             Toast.makeText(MainActivity.this, ""+nombre, Toast.LENGTH_SHORT).show();

             Intent intent = new Intent(MainActivity.this, Informacion.class);
             intent.putExtra("Nombre", nombre);
             intent.putExtra("Apellido", apellido);
             intent.putExtra("Edad", edad);
             intent.putExtra("Correo", correo);
             startActivity(intent);

         }
     });







    }
}