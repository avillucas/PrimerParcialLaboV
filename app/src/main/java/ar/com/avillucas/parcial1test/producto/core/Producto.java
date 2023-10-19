package ar.com.avillucas.parcial1test.producto.core;

import java.io.Serializable;

public class Producto implements Serializable {

    private String nombre;
    private Integer cantidad;
    private Float precio;

    public Producto() {
    }

    public Producto(String nombre, Integer cantidad, Float precio) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        return this.nombre.hashCode() * 15;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
        Producto p = (Producto) obj;
        return this.nombre.equals(p.nombre);
    }
}
