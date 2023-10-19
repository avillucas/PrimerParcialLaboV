package ar.com.avillucas.parcial1test.usuario.listar;

import android.app.Activity;
import android.content.Intent;

import java.util.List;

import ar.com.avillucas.parcial1test.UsuarioModificarActivity;
import ar.com.avillucas.parcial1test.usuario.core.Usuario;


public class UsuarioListarControlador  implements RecyclerViewInterface{

    private UsuarioListarVista vista;
    private Activity actividad;
    private UsuarioListarModelo modelo;

    private List<Usuario> usuarios;

    public UsuarioListarControlador(UsuarioListarModelo modelo, UsuarioListarVista vista, Activity actividad) {
        this.vista = vista;
        this.actividad = actividad;
        this.modelo = modelo;
        this.usuarios = this.modelo.traerLista();
    }

    public List<Usuario> traerListaProductos() {
        return this.usuarios;
    }


    @Override
    public void onItemClick(int posicion) {
        Intent intencion = new Intent(this.actividad, UsuarioModificarActivity.class);
        intencion.putExtra(UsuarioModificarActivity.posicionActivityParameter, posicion);
        this.actividad.startActivity(intencion);
    }
}