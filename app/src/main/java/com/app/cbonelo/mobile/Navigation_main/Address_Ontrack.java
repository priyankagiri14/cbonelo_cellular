package com.app.cbonelo.mobile.Navigation_main;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.google.android.material.navigation.NavigationView;
import com.app.cbonelo.mobile.AboutActivity;
import com.app.cbonelo.mobile.R;

public class Address_Ontrack extends AppCompatActivity  implements NavigationView.OnNavigationItemSelectedListener {
Toolbar toolbar;
    /**
     * This method is initializing all the design components which will be used further for some functionalty.
     * @param savedInstanceState
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.address_ontrack);
        DrawerLayout drawer = findViewById(R.id.address_drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        toolbar=findViewById(R.id.toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        navigationView.setNavigationItemSelectedListener(this);

    }

    /**
     * This function will return the boolean value for the menu item to performm some functionality according to the code written in the conditions.
     * @param item
     * @return this function returns the boolean value (true or false)
     */
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_login) {
            // Handle the camera action
            Intent i=new Intent(this, Navigation_Main.class);
            startActivity(i);
        } else if (id == R.id.nav_contacts) {
            Intent i1=new Intent(this, Contact_Ontrack.class);
            startActivity(i1);

        } else if (id == R.id.nav_address) {

        }else if (id == R.id.aboutdrawer) {
            Intent i1=new Intent(this, AboutActivity.class);
            startActivity(i1);

        }

        DrawerLayout drawer = findViewById(R.id.address_drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}