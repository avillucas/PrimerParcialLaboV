package ar.com.avillucas.parcial1test.producto.modificar;


import java.util.List;

import ar.com.avillucas.parcial1test.producto.core.Producto;
import ar.com.avillucas.parcial1test.producto.data.ProductoSeed;

public class ProductoModificarModelo {


    private int posicion;

    public ProductoModificarModelo() {
        this.posicion = 0;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Producto traerProductoActual() {
        return ProductoSeed.traerUno(posicion);
    }

    public void salvarActual(Producto producto) {
        ProductoSeed.guardarUno(this.posicion, producto);
    }
}
