package com.temas.selectos.metc.Activities.RecyclerViewMuestra;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.temas.selectos.metc.Activities.Fragments.FragmentInicio;
import com.temas.selectos.metc.Activities.Fragments.ProductosFragment;
import com.temas.selectos.metc.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class AdaptadorMuestraProducto extends RecyclerView.Adapter<AdaptadorMuestraProducto.MuestraProductoViewHolder>  {


    private ArrayList<MuestraProducto> muestras;
    IColecProduccion activity;

    public interface IColecProduccion{
        public void ClickProduccion(String Titulo);
    }


    public  AdaptadorMuestraProducto(Context context, ArrayList<MuestraProducto> muestraProductos   )
    {
        this.muestras= muestraProductos;
        activity= (IColecProduccion)context;

    }

    @NonNull
    @Override
    public MuestraProductoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_producto,parent,false);
        return new MuestraProductoViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull final MuestraProductoViewHolder holder, int position) {

        final MuestraProducto muestraProducto=muestras.get(position);


        holder.txtvCVTitle.setText(muestraProducto.getTittulo());
        holder.txtCVDescribe.setText(muestraProducto.getDescripción());
        holder.imgButCVMuestra.setImageResource(muestraProducto.getImagenProducto());
        holder.imgButCVMuestra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.ClickProduccion(muestraProducto.getTittulo());

            }
        });
    }

    @Override
    public int getItemCount() {
        return muestras.size();
    }

    public  static  class MuestraProductoViewHolder extends RecyclerView.ViewHolder{
        private TextView txtvCVTitle;
        private AppCompatImageButton imgButCVMuestra;
        private AppCompatTextView txtCVDescribe;
        private AppCompatButton btnCvColeccion;


        public MuestraProductoViewHolder(@NonNull View itemView) {
            super(itemView);
            txtvCVTitle= itemView.findViewById(R.id.txtvCVTitle);
            imgButCVMuestra= itemView.findViewById(R.id.imgButCVMuestra);
            txtCVDescribe= itemView.findViewById(R.id.txtCVDescribe);
            btnCvColeccion=itemView.findViewById(R.id.btnCvColeccion);
        }
    }


}