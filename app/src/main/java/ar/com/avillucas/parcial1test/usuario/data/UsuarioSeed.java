package ar.com.avillucas.parcial1test.usuario.data;

import java.util.ArrayList;
import java.util.List;

import ar.com.avillucas.parcial1test.usuario.core.Rol;
import ar.com.avillucas.parcial1test.usuario.core.Usuario;

public class UsuarioSeed {

    private static List<Usuario> usuarios;

    public static void cargarInformacion() {
        if (usuarios == null) {
            usuarios = new ArrayList<Usuario>();
            usuarios.add(new Usuario("JPerez", "236456", Rol.ADMINISTRADOR));
            usuarios.add(new Usuario("APerez", "236457", Rol.SUSCRIPTOR));
            usuarios.add(new Usuario("FSanchez ", "233456", Rol.SUSCRIPTOR));
            usuarios.add(new Usuario("JGON", "236456", Rol.SUSCRIPTOR));
            usuarios.add(new Usuario("JPasad", "236356", Rol.SUSCRIPTOR));
            usuarios.add(new Usuario("JPuytr", "236556", Rol.SUSCRIPTOR));
            usuarios.add(new Usuario("JDer", "236458", Rol.ADMINISTRADOR));
            usuarios.add(new Usuario("AFernandez", "256456", Rol.SUSCRIPTOR));
            usuarios.add(new Usuario("YHecheverria", "276456", Rol.SUSCRIPTOR));
            usuarios.add(new Usuario("Auyuyuu", "233456", Rol.SUSCRIPTOR));
        }
    }

    public static List<Usuario> traerLista() {
        cargarInformacion();
        return usuarios;
    }

    public static Usuario traerUno(int posicion) {
        cargarInformacion();
        return usuarios.get(posicion);
    }

    public static Usuario guardarUno(int posicion, Usuario usuario) {
        cargarInformacion();
        return usuarios.set(posicion,usuario);
    }
}
