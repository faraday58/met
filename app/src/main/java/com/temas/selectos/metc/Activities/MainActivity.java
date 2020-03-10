package com.temas.selectos.metc.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.temas.selectos.metc.Activities.Fragments.FragmentBuscar;
import com.temas.selectos.metc.Activities.Fragments.FragmentCarrito;
import com.temas.selectos.metc.Activities.Fragments.FragmentInicio;
import com.temas.selectos.metc.Activities.Fragments.FragmentLoginSign;
import com.temas.selectos.metc.Activities.Fragments.ProductosFragment;
import com.temas.selectos.metc.Activities.RecyclerViewMuestra.AdaptadorMuestraProducto;
import com.temas.selectos.metc.R;

public class MainActivity extends AppCompatActivity implements AdaptadorMuestraProducto.IColecProduccion {

    BottomNavigationView btmNavPrincipal;
    Fragment fragmentSeleccionado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragmentSeleccionado= new FragmentInicio();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContenedor,fragmentSeleccionado).commit();
        btmNavPrincipal = findViewById(R.id.btmNavPrincipal);
        btmNavPrincipal.setOnNavigationItemSelectedListener(navListener);

    }

    //Creando un objeto de escucha
    BottomNavigationView.OnNavigationItemSelectedListener navListener = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {

            switch (menuItem.getItemId())
            {
                case R.id.nav_home:
                    fragmentSeleccionado= new FragmentInicio();
                    break;
                case R.id.nav_buscar:
                    fragmentSeleccionado= new FragmentBuscar();
                    break;
                case R.id.nav_car:
                    fragmentSeleccionado= new FragmentCarrito();
                    break;
                case R.id.nav_login:
                    fragmentSeleccionado= new FragmentLoginSign();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContenedor,fragmentSeleccionado).commit();
            return true;
        }
    };

    @Override
    public void ClickProduccion(String Titulo) {
        fragmentSeleccionado = new ProductosFragment(Titulo);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragmentContenedor,fragmentSeleccionado).commit();




    }
}
