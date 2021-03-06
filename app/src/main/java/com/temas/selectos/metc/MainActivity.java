package com.temas.selectos.metc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnCrear;
    EditText edtNombre;
    EditText edtCorreo;
    EditText edtContraseña;

    String Nombre;
    String Correo;
    String Contraseña;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtNombre = findViewById(R.id.edtNombre);
        edtCorreo = findViewById(R.id.edtCorreo);
        edtContraseña= findViewById(R.id.edtContraseña);
        btnCrear = findViewById(R.id.btnCrear);



        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Nombre= edtNombre.getText().toString();
                Contraseña= edtNombre.getText().toString();
                Correo= edtCorreo.getText().toString();

                if(Nombre.length() == 0)
                {
                    Toast.makeText(getApplicationContext(),"Debes ingresar un nombre",Toast.LENGTH_LONG).show();
                }
                if(Contraseña.length() == 0)
                {
                    Toast.makeText(getApplicationContext(),"Debes ingresar una contraseña",Toast.LENGTH_LONG).show();
                }
                if(Correo.length() == 0)
                {
                    Toast.makeText(getApplicationContext(),"Debes ingresar un correo",Toast.LENGTH_LONG).show();
                }
                if( Nombre.length() !=0 && Contraseña.length() !=0 && Correo.length() !=0)
                {
                    Toast.makeText(getApplicationContext(),"Se está registrando al usuario " + Nombre,Toast.LENGTH_LONG ).show();
                }

            }
        });


    }
}
