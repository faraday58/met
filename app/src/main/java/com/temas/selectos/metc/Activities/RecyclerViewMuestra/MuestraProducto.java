package com.temas.selectos.metc.Activities.RecyclerViewMuestra;

public class MuestraProducto {

    private String tittulo;

    public String getTittulo() {
        return tittulo;
    }

    public void setTittulo(String tittulo) {
        this.tittulo = tittulo;
    }

    public int getImagenProducto() {
        return imagenProducto;
    }

    public void setImagenProducto(int imagenProducto) {
        this.imagenProducto = imagenProducto;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    private int  imagenProducto;
    private String descripción;

    public MuestraProducto()
    {

    }

    public MuestraProducto(String tittulo, int imagenProducto, String descripción) {
        this.tittulo = tittulo;
        this.imagenProducto = imagenProducto;
        this.descripción = descripción;
    }
}
