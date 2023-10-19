package ar.com.avillucas.parcial1test.usuario.modificar;

import ar.com.avillucas.parcial1test.usuario.core.Usuario;
import ar.com.avillucas.parcial1test.usuario.data.UsuarioSeed;

public class UsuarioModificarModelo {


    private int posicion;

    public UsuarioModificarModelo() {
        this.posicion = 0;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public Usuario traerUsuarioActual() {
        return UsuarioSeed.traerUno(posicion);
    }

    public void salvarActual(Usuario usuario) {
        UsuarioSeed.guardarUno(this.posicion, usuario);
    }
}
