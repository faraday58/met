package com.temas.selectos.metc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public  void onClickCrear(View v)
    {
        Intent intentRegistro = new Intent(this,MainActivity.class);
        startActivity(intentRegistro);

    }


}
