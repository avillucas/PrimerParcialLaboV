package ar.com.avillucas.parcial1test.usuario.listar;


import android.app.Activity;
import android.content.Intent;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import ar.com.avillucas.parcial1test.R;
import ar.com.avillucas.parcial1test.UsuarioModificarActivity;
import ar.com.avillucas.parcial1test.usuario.core.Usuario;

public class UsuarioListarVista {

    RecyclerView lista;
    Activity actividad;

    UsuarioListarControlador controlador;

    public UsuarioListarVista(Activity actividad) {
        this.actividad = actividad;
    }

    public void setControlador(UsuarioListarControlador controlador) {
        this.controlador = controlador;
        this.cargarElementos();
    }

    public void cargarElementos() {
        List<Usuario> productos = this.controlador.traerListaProductos();
        UsuarioAdapter adaptador = new UsuarioAdapter(productos, this.controlador);
        lista = actividad.findViewById(R.id.usuarioslistarRecyclerView);
        lista.setAdapter(adaptador);
        LinearLayoutManager manejador = new LinearLayoutManager(this.actividad, LinearLayoutManager.VERTICAL, false);
        lista.setLayoutManager(manejador);
    }

}
