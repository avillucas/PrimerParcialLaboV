package ar.com.avillucas.parcial1test.usuario.modificar;

import android.app.Activity;
import android.util.Log;
import android.view.View;

import ar.com.avillucas.parcial1test.usuario.core.Usuario;


public class UsuarioModificarControlador implements View.OnClickListener {

    private Usuario usuario;
    private UsuarioModificarVista vista;
    private Activity actividad;
    private UsuarioModificarModelo modelo;

    public UsuarioModificarControlador(int posicion, UsuarioModificarModelo modelo, UsuarioModificarVista vista, Activity actividad) {
        this.vista = vista;
        this.actividad = actividad;
        this.modelo = modelo;
        this.modelo.setPosicion(posicion);
        this.usuario = this.modelo.traerUsuarioActual();
    }

    public boolean validarDatos() {
        //validar que esten cargados los datos
        if (this.usuario.getNombre() == null || this.usuario.getNombre().isEmpty()) {
            return false;
        }
        if (this.usuario.getContrasenia() == null) {
            return false;
        }
        if (this.usuario.getTipo() == null) {
            return false;
        }
        return true;
    }

    public Usuario traerUsuarioActual() {
        return this.usuario;
    }

    @Override
    public void onClick(View v) {
        this.vista.cargarModelo();
        if (this.validarDatos()) {
            this.modelo.salvarActual(this.usuario);
            this.actividad.finish();
        } else {
            Log.d("Error", "error al guardar el modelo");
        }
    }
}
