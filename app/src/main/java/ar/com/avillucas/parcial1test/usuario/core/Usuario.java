package ar.com.avillucas.parcial1test.usuario.core;

import java.io.Serializable;

import ar.com.avillucas.parcial1test.producto.core.Producto;

public class Usuario implements Serializable {

    private String nombre;
    private String contrasenia;
    private Rol tipo;

    public Usuario() {
    }

    public Usuario(String nombre, String contrasenia, Rol tipo) {
        this.nombre = nombre;
        this.contrasenia = contrasenia;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public Rol getTipo() {
        return tipo;
    }

    public void setTipo(Rol tipo) {
        this.tipo = tipo;
    }

    @Override
    public int hashCode() {
        return this.nombre.hashCode() * 15;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
        Usuario u = (Usuario) obj;
        return this.nombre.equals(u.nombre);
    }
}
