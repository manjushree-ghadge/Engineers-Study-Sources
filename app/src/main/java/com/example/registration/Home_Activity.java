package com.example.registration;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import com.example.registration.Department.AgricultureActivity;
import com.example.registration.Department.Civil_Activity;
import com.example.registration.Department.Computer_Activity;
import com.example.registration.Department.ElectricalActivity;
import com.example.registration.Department.ElectronicsActivity;
import com.example.registration.Department.MechanicalActivity;
import com.google.android.material.navigation.NavigationView;

public class Home_Activity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;
    TextView textView;
    CardView civilcard,compcard,electricalcard,electronicscard, mechcard, agricard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        drawerLayout = findViewById(R.id.drawer_layout);
        navigationView = findViewById(R.id.nav_view);
        textView = findViewById(R.id.textView);
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Menu menu = navigationView.getMenu();
        menu.findItem(R.id.nav_logout).setVisible(true);
        menu.findItem(R.id.nav_profile).setVisible(true);

        navigationView.bringToFront();
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(this);
        navigationView.setCheckedItem(R.id.nav_home);

        civilcard = findViewById(R.id.civilcard);
        civilcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Civil_Activity.class);
                startActivity(intent);
            }
        });
        compcard = findViewById(R.id.compcard);
        compcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Computer_Activity.class);
                startActivity(intent);
            }
        });
        mechcard = findViewById(R.id.mechcard);
        mechcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), MechanicalActivity.class);
                startActivity(intent);
            }
        });
        electricalcard = findViewById(R.id.electricalcard);
        electricalcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ElectricalActivity.class);
                startActivity(intent);
            }
        });
        electronicscard = findViewById(R.id.electronicscard);
        electronicscard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ElectronicsActivity.class);
                startActivity(intent);
            }
        });
        agricard = findViewById(R.id.agricard);
        agricard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), AgricultureActivity.class);
                startActivity(intent);
            }
        });

    }
    @Override
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull  MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_home:
                break;
                case R.id.nav_pdf:
                Intent intent = new Intent(Home_Activity.this,PdfActivity.class);
                startActivity(intent);
                break;

            case R.id.nav_imp:
                intent = new Intent(Home_Activity.this, ImpActivity.class);
                startActivity(intent);
                break;

            case R.id.nav_share:
                Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
                 break;
            case R.id.nav_logout:

                SharedPreferences preferences = getSharedPreferences("checked", MODE_PRIVATE);
                SharedPreferences.Editor editor = preferences.edit();
                editor.putString("remember","false");
                editor.apply();
                finish();

        }
        drawerLayout.closeDrawer(GravityCompat.START);


        return true;
    }




}

