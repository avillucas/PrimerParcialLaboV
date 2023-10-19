package ar.com.avillucas.parcial1test.producto.modificar;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;

import ar.com.avillucas.parcial1test.producto.core.Producto;

import ar.com.avillucas.parcial1test.R;

public class ProductoModificarVista {

    Producto producto;
    Activity activity;
    EditText txtNombre;
    EditText txtCantidad;
    EditText txtPrecio;
    Button btnSave;

    ProductoModificarControlador controlador;

    public ProductoModificarVista( Activity activity) {
        this.activity = activity;
    }


    public void setControlador(ProductoModificarControlador controlador) {
        this.controlador = controlador;
        this.producto = this.controlador.traerProductoActual();
        this.cargarElementos();
    }

    public void cargarElementos() {
        this.txtNombre = activity.findViewById(R.id.txtNombre);
        this.txtCantidad = activity.findViewById(R.id.txtCantidad);
        this.txtPrecio = activity.findViewById(R.id.txtPrecio);
        this.mostrarModelo();
        this.btnSave = activity.findViewById(R.id.bnSave);
        btnSave.setOnClickListener(controlador);
    }

    public void cargarModelo() {
        producto.setNombre(txtNombre.getText().toString());
        producto.setCantidad(Integer.parseInt(txtCantidad.getText().toString()));
        producto.setPrecio(Float.parseFloat(txtPrecio.getText().toString()));
    }

    @SuppressLint("DefaultLocale")
    public void mostrarModelo() {
        txtNombre.setText(producto.getNombre());
        txtCantidad.setText(String.format("%d",producto.getCantidad()));
        txtPrecio.setText(String.format("%.2f",producto.getPrecio()));
    }
}
