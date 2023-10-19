package ar.com.avillucas.parcial1test.producto.listar;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;

import java.util.List;

import ar.com.avillucas.parcial1test.ProductoModificarActivity;
import ar.com.avillucas.parcial1test.producto.core.Producto;

public class ProductoListaControlador  {

    private ProductoListaVista vista;
    private Activity actividad;
    private ProductoListaModelo modelo;

    private List<Producto> productos;

    public ProductoListaControlador(ProductoListaModelo modelo, ProductoListaVista vista, Activity actividad) {
        this.vista = vista;
        this.actividad = actividad;
        this.modelo = modelo;
        this.productos = this.modelo.traerLista();
    }

    public List<Producto> traerListaProductos() {
        return this.productos;
    }


}
