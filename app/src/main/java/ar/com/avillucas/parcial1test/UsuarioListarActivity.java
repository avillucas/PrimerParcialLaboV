package ar.com.avillucas.parcial1test;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.snackbar.Snackbar;

import java.util.List;

import ar.com.avillucas.parcial1test.databinding.ActivityUsuarioListarBinding;
import ar.com.avillucas.parcial1test.usuario.core.Usuario;
import ar.com.avillucas.parcial1test.usuario.listar.UsuarioListarControlador;
import ar.com.avillucas.parcial1test.usuario.listar.UsuarioListarModelo;
import ar.com.avillucas.parcial1test.usuario.listar.UsuarioListarVista;

public class UsuarioListarActivity extends AppCompatActivity {


    private AppBarConfiguration appBarConfiguration;
    private ActivityUsuarioListarBinding actividadUsuarioListar;

    @Override
    protected void onResume() {
        super.onResume();
        //TODO  quedaria hacer que el adatapter notifyDatachange  o notify itemChange en caso de poder determiar cual es


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        actividadUsuarioListar = ActivityUsuarioListarBinding.inflate(getLayoutInflater());
        setContentView(actividadUsuarioListar.getRoot());


        UsuarioListarModelo modelo = new UsuarioListarModelo();
        UsuarioListarVista vista = new UsuarioListarVista(this);
        UsuarioListarControlador controlador = new UsuarioListarControlador(modelo, vista, this);
        vista.setControlador(controlador);
}

}