package ar.com.avillucas.parcial1test;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import ar.com.avillucas.parcial1test.usuario.modificar.UsuarioModificarControlador;
import ar.com.avillucas.parcial1test.usuario.modificar.UsuarioModificarModelo;
import ar.com.avillucas.parcial1test.usuario.modificar.UsuarioModificarVista;

public class UsuarioModificarActivity extends AppCompatActivity {
    public static final String posicionActivityParameter = "POSICION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario_modificar);
        Integer posicion = getIntent().getIntExtra(posicionActivityParameter, 0);
        UsuarioModificarModelo modelo = new UsuarioModificarModelo();
        UsuarioModificarVista vista = new UsuarioModificarVista(this);
        UsuarioModificarControlador controlador = new UsuarioModificarControlador(posicion, modelo, vista, this);
        vista.setControlador(controlador);
    }
}