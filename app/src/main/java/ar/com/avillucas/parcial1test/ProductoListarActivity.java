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

import ar.com.avillucas.parcial1test.databinding.ActivityProductoListarBinding;
import ar.com.avillucas.parcial1test.producto.core.Producto;
import ar.com.avillucas.parcial1test.producto.data.ProductoSeed;
import ar.com.avillucas.parcial1test.producto.listar.ProductoListaControlador;
import ar.com.avillucas.parcial1test.producto.listar.ProductoListaModelo;
import ar.com.avillucas.parcial1test.producto.listar.ProductoListaVista;

import java.util.List;

public class ProductoListarActivity extends AppCompatActivity {


    private AppBarConfiguration appBarConfiguration;
    private ActivityProductoListarBinding actividadProductoListar;

    @Override
    protected void onResume() {
        super.onResume();
        //TODO  quedaria hacer que el adatapter notifyDatachange  o notify itemChange en caso de poder determiar cual es


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        actividadProductoListar = ActivityProductoListarBinding.inflate(getLayoutInflater());
        setContentView(actividadProductoListar.getRoot());


        ProductoListaModelo modelo = new ProductoListaModelo();
        ProductoListaVista vista = new ProductoListaVista(this);
        ProductoListaControlador controlador = new ProductoListaControlador( modelo, vista, this);
        vista.setControlador(controlador);
/*
      setSupportActionBar(ActivityProductoListarBinding.toolbar);

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_main);
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);

       actividadProductoListar.fab.setOnClickListener(new View().OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAnchorView(R.id.fab)
                        .setAction("Action", null).show();
            }
        });*/
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
    }*/
}