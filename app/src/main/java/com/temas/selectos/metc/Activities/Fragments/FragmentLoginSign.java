package com.temas.selectos.metc.Activities.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.temas.selectos.metc.Activities.LoginActivity;
import com.temas.selectos.metc.Activities.RegistroActivity;
import com.temas.selectos.metc.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentLoginSign extends Fragment {
    Button  btnCrear;
    Button btnIngresar;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vista= inflater.inflate(R.layout.fragment_login_sign,container,false);

        btnCrear= vista.findViewById(R.id.btnCrearFrag);
        btnCrear.setOnClickListener(onClickCrear);
        btnIngresar= vista.findViewById(R.id.btnIngresarFrag);
        btnIngresar.setOnClickListener(onClickIngresar);
        return vista;
    }

    View.OnClickListener onClickIngresar = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intLogin = new Intent(getActivity(),LoginActivity.class);
            startActivity(intLogin);
        }
    };

    View.OnClickListener onClickCrear = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intCrear = new Intent(getActivity(), RegistroActivity.class);
            startActivity(intCrear);
        }
    };
}
