package com.temas.selectos.metc.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.temas.selectos.metc.R;



import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    EditText edtCorreo;
    EditText edtContraseña;
    TextView txtvBienvenido;
    Button btnIngresar;
    String correo;
    String contraseña;
    String nombre;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edtCorreo= findViewById(R.id.edtCorreoLogin);
        edtContraseña= findViewById(R.id.edtContraseñaLogin);
        btnIngresar = findViewById(R.id.btnIngresarLogin);

        txtvBienvenido= findViewById(R.id.textView2);

        /*Obteniendo los parámetros
        de un activity
         */
        Bundle extras= getIntent().getExtras();
        correo = extras.getString(getString(R.string.strEdtCorreo));
        contraseña = extras.getString(getString(R.string.strEdtContraseña));
        nombre = extras.getString(getString(R.string.strEdtNombre));
        btnIngresar.setOnClickListener(onClickIngresar);
        //edtCorreo.setText(correo);
        //edtContraseña.setText(contraseña);



    }

    public  void onClickCrear(View v)
    {
        Intent intentRegistro = new Intent(this, RegistroActivity.class);
        startActivity(intentRegistro);

    }

    View.OnClickListener onClickIngresar = new View.OnClickListener() {

        @Override
        public void onClick(View view) {


            //Toast.makeText(getApplicationContext(),correo +" "+ contraseña,Toast.LENGTH_SHORT).show();
            if(  edtCorreo.getText().toString().equals(correo) && edtContraseña.getText().toString().equals(contraseña)  )
            {
                txtvBienvenido.setText(txtvBienvenido.getText().toString() + " " +nombre);
            }
            else
            {
                Toast.makeText(getApplicationContext(),"Verifique sus datos",Toast.LENGTH_SHORT).show();
            }

        }
    };


}
