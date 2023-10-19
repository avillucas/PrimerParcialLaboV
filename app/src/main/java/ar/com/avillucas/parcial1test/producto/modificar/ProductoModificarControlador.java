package ar.com.avillucas.parcial1test.producto.modificar;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;

import ar.com.avillucas.parcial1test.ProductoListarActivity;
import ar.com.avillucas.parcial1test.ProductoModificarActivity;
import ar.com.avillucas.parcial1test.producto.core.Producto;

public class ProductoModificarControlador implements View.OnClickListener {

    private Producto producto;
    private ProductoModificarVista vista;
    private Activity actividad;
    private ProductoModificarModelo productoModificarModelo;

    public ProductoModificarControlador(int posicion, ProductoModificarModelo productoModificarModelo, ProductoModificarVista vista, Activity actividad) {
        this.vista = vista;
        this.actividad = actividad;
        this.productoModificarModelo = productoModificarModelo;
        this.productoModificarModelo.setPosicion(posicion);
        this.producto = this.productoModificarModelo.traerProductoActual();
    }

    public boolean validarDatos() {
        //validar que esten cargados los datos
        if (this.producto.getNombre() == null || this.producto.getNombre().isEmpty()) {
            return false;
        }
        if (this.producto.getCantidad() == null) {
            return false;
        }
        if (this.producto.getPrecio() == null) {
            return false;
        }
        return true;
    }

    public Producto traerProductoActual() {
        return this.producto;
    }

    @Override
    public void onClick(View v) {
        this.vista.cargarModelo();
        if (this.validarDatos()) {
            this.productoModificarModelo.salvarActual(this.producto);
            //TODO mostrar mensaje en el listado
            //finish de esta eactividad
            this.actividad.finish();

            //Intent intencion = new Intent(this.actividad, ProductoListarActivity.class);
            //this.actividad.startActivity(intencion);

        } else {
            Log.d("Error", "error al guardar el modelo");
            //TODO mostrar mensaje
            //actividad.mostrarMensajeError(R.string.invalidMessage)
        }
    }
}
