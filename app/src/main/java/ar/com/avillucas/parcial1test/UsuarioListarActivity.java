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

    protected UsuarioListarVista vista;

    private AppBarConfiguration appBarConfiguration;
    private ActivityUsuarioListarBinding actividadUsuarioListar;

    @Override
    protected void onResume() {
        super.onResume();
        this.vista.adaptador.notifyDataSetChanged();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        actividadUsuarioListar = ActivityUsuarioListarBinding.inflate(getLayoutInflater());
        setContentView(actividadUsuarioListar.getRoot());

        //TODO agregar toolbar
        // setSupportActionBar(ActivityUsuarioListarBinding.toolbar);
        // NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        // appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        // NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);


        UsuarioListarModelo modelo = new UsuarioListarModelo();
        this.vista = new UsuarioListarVista(this);
        UsuarioListarControlador controlador = new UsuarioListarControlador(modelo, vista, this);
        vista.setControlador(controlador);
    }

    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        return NavigationUI.navigateUp(navController, appBarConfiguration)
                || super.onSupportNavigateUp();
    }
*/

}