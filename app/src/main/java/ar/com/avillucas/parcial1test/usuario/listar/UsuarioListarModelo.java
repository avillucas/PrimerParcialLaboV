package ar.com.avillucas.parcial1test.usuario.listar;

import java.util.List;

import ar.com.avillucas.parcial1test.usuario.core.Usuario;
import ar.com.avillucas.parcial1test.usuario.data.UsuarioSeed;

public class UsuarioListarModelo{

    private List<Usuario> usuarios;

    public UsuarioListarModelo() {
        this.usuarios = UsuarioSeed.traerLista();
    }

    public List<Usuario> traerLista() {
        return this.usuarios;
    }

    public Usuario traerUno(Integer posicion) {
        return this.usuarios.get(posicion);
    }

}