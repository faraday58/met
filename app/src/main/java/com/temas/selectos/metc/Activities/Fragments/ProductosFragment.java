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

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_productos,container,false);
        txtvTituloFragProd= v.findViewById(R.id.txtvProductosFragment);

        return v;

    }

    public void SetTituloFrag(String titulo){
        txtvTituloFragProd.setText("Titulo");
    }
}
