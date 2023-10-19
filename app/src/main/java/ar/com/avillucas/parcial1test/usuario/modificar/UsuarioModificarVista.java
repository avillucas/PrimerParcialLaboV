package ar.com.avillucas.parcial1test.usuario.modificar;

import android.app.Activity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

import ar.com.avillucas.parcial1test.R;
import ar.com.avillucas.parcial1test.usuario.core.Rol;
import ar.com.avillucas.parcial1test.usuario.core.Usuario;

public class UsuarioModificarVista {

    Usuario usuario;
    Activity activity;
    EditText txtNombre;
    EditText txtContrasenia;
    EditText txtRepetirContrasenia;
    RadioButton rbtAdministrador;
    RadioButton rbtSusucriptor;
    Button btnSave;

    UsuarioModificarControlador controlador;

    public UsuarioModificarVista(Activity activity) {
        this.activity = activity;
    }


    public void setControlador(UsuarioModificarControlador controlador) {
        this.controlador = controlador;
        this.usuario = this.controlador.traerUsuarioActual();
        this.cargarElementos();
    }

    public void cargarElementos() {
        this.txtNombre = activity.findViewById(R.id.txtNombre);
        this.txtContrasenia = activity.findViewById(R.id.txtContrasenia);
        this.txtRepetirContrasenia = activity.findViewById(R.id.txtRepetirContrasenia);
        this.rbtAdministrador = activity.findViewById(R.id.rbtAdministrador);
        this.rbtSusucriptor = activity.findViewById(R.id.rbtSusucriptor);
        this.mostrarModelo();
        this.btnSave = activity.findViewById(R.id.bnSave);
        btnSave.setOnClickListener(controlador);
    }

    public void cargarModelo() {
        usuario.setNombre(txtNombre.getText().toString());
        usuario.setContrasenia(txtContrasenia.getText().toString());
        if (rbtSusucriptor.isChecked()) {
            usuario.setTipo(Rol.ADMINISTRADOR);
        } else {
            usuario.setTipo(Rol.SUSCRIPTOR);
        }

    }

    public void mostrarModelo() {
        txtNombre.setText(usuario.getNombre());
        txtContrasenia.setText(usuario.getContrasenia());
        if (usuario.getTipo().equals(Rol.ADMINISTRADOR)) {
            this.rbtAdministrador.setChecked(true);
        } else {
            this.rbtSusucriptor.setChecked(true);
        }
    }

}