package com.example.thuvienphuongnam.Trangchu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;

import com.example.thuvienphuongnam.R;
import com.example.thuvienphuongnam.fragment.LoaiSachFragment;
import com.example.thuvienphuongnam.fragment.PhieuMuonFragment;
import com.example.thuvienphuongnam.fragment.SachFragment;
import com.google.android.material.navigation.NavigationView;

public class TrangchuActivity extends AppCompatActivity {
      Toolbar toolbar;
      NavigationView navigationView;
      DrawerLayout drawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu);
        toolbar = findViewById(R.id.toolBar);
        navigationView = findViewById(R.id.navigation);
        drawerLayout = findViewById(R.id.drawerLayout);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        toolbar.setNavigationIcon(R.drawable.baseline_menu_24);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                drawerLayout = findViewById(R.id.drawerLayout);
                drawerLayout.openDrawer(GravityCompat.START);
            }
        });
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;
                if (item.getItemId()==R.id.mQLPhieuMuon){
                    fragment = new PhieuMuonFragment();
                }
                if (item.getItemId()==R.id.mQLLoaiSach){
                    fragment = new LoaiSachFragment();

                }
                if (item.getItemId()==R.id.mQLSach){
                    fragment = new SachFragment();

                }
                FragmentManager fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction()
                        .replace(R.id.frameLayout,fragment)
                        .commit();
                drawerLayout.closeDrawer(GravityCompat.START);
                setTitle(item.getTitle());
                return false;
            }
        });
    }
}