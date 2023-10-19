package ar.com.avillucas.parcial1test.producto.listar;

import android.app.Activity;
import android.content.Intent;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import ar.com.avillucas.parcial1test.ProductoModificarActivity;
import ar.com.avillucas.parcial1test.R;
import ar.com.avillucas.parcial1test.producto.core.Producto;

public class ProductoListaVista implements RecyclerViewInterface {

    RecyclerView lista;
    Activity actividad;

    ProductoListaControlador controlador;

    public ProductoListaVista(Activity actividad) {
        this.actividad = actividad;
    }

    public void setControlador(ProductoListaControlador controlador) {
        this.controlador = controlador;
        this.cargarElementos();
    }

    public void cargarElementos() {
        List<Producto> productos = this.controlador.traerListaProductos();
        ProductoAdapter adaptador = new ProductoAdapter(productos, this);
        lista = actividad.findViewById(R.id.productoslistarRecyclerView);
        lista.setAdapter(adaptador);
        LinearLayoutManager manejador = new LinearLayoutManager(this.actividad, LinearLayoutManager.VERTICAL, false);
        lista.setLayoutManager(manejador);
    }

    @Override
    public void onItemClick(int posicion) {
        Intent intencion = new Intent(this.actividad, ProductoModificarActivity.class);
        intencion.putExtra(ProductoModificarActivity.posicionActivityParameter, posicion);
        this.actividad.startActivity(intencion);
    }
}
