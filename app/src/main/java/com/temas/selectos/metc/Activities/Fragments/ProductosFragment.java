package com.temas.selectos.metc.Activities.Fragments;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.temas.selectos.metc.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ProductosFragment extends Fragment {
    TextView txtvTituloFragProd;
    String Titulo;

    public ProductosFragment(String Titulo)
    {
        this.Titulo=Titulo;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_productos,container,false);
        txtvTituloFragProd= v.findViewById(R.id.txtvProductosFragment);
        txtvTituloFragProd.setText(Titulo);

        return v;

    }


}
