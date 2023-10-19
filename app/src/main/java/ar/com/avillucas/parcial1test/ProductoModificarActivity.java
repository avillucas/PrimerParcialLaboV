package ar.com.avillucas.parcial1test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ar.com.avillucas.parcial1test.producto.core.Producto;
import ar.com.avillucas.parcial1test.producto.listar.ProductoListaModelo;
import ar.com.avillucas.parcial1test.producto.modificar.ProductoModificarControlador;
import ar.com.avillucas.parcial1test.producto.modificar.ProductoModificarModelo;
import ar.com.avillucas.parcial1test.producto.modificar.ProductoModificarVista;

public class ProductoModificarActivity extends AppCompatActivity {
    public static final String posicionActivityParameter = "POSICION";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_modificar);
        Integer posicion = getIntent().getIntExtra(posicionActivityParameter, 0);
        ProductoModificarModelo productoModificarModelo = new ProductoModificarModelo();
        ProductoModificarVista productoModificarVista = new ProductoModificarVista(this);
        ProductoModificarControlador productoModificarControlador = new ProductoModificarControlador(posicion, productoModificarModelo, productoModificarVista, this);
        productoModificarVista.setControlador(productoModificarControlador);
    }
}