package com.temas.selectos.metc.Activities.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.temas.selectos.metc.Activities.RecyclerViewMuestra.AdaptadorMuestraProducto;
import com.temas.selectos.metc.Activities.RecyclerViewMuestra.MuestraProducto;
import com.temas.selectos.metc.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FragmentInicio extends Fragment {

    ArrayList<MuestraProducto> muestras;
    private RecyclerView rcvListaProductos;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View vista= inflater.inflate(R.layout.fragment_inicio,container,false);

        rcvListaProductos= vista.findViewById(R.id.rcvListaProductos);
        LinearLayoutManager llm= new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        rcvListaProductos.setLayoutManager(llm);
        InicializarListaMuestra();
        IniciarAdaptador();


        return vista;

    }

    private  void IniciarAdaptador()
    {
        AdaptadorMuestraProducto miAdaptador= new AdaptadorMuestraProducto(getActivity(),muestras);
        rcvListaProductos.setAdapter(miAdaptador);
    }

    private void InicializarListaMuestra()
    {
        muestras = new ArrayList<>();
        muestras.add(new MuestraProducto("Entrena",R.drawable.entrena,"Entrena en el lugar que quieras"));
        muestras.add(new MuestraProducto("Compras",R.drawable.compras,"Hasta en las compras luces espectacular"));
        muestras.add(new MuestraProducto("Restaurante",R.drawable.restaurante,"Al comer en tu lugar preferido"));
        muestras.add(new MuestraProducto("Sencillo",R.drawable.sencillo,"En donde quieras debes ser tú"));
    }
}
