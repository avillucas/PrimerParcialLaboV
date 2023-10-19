package ar.com.avillucas.parcial1test.producto.listar;

import java.util.List;

import ar.com.avillucas.parcial1test.producto.core.Producto;
import ar.com.avillucas.parcial1test.producto.data.ProductoSeed;

public class ProductoListaModelo {

    private List<Producto> productos;

    public ProductoListaModelo() {
        this.productos = ProductoSeed.traerLista();
    }

    public List<Producto> traerLista() {
        return this.productos;
    }

    public Producto traerUno(Integer posicion) {
        return this.productos.get(posicion);
    }

}
