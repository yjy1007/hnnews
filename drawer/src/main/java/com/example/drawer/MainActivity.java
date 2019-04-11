package com.example.drawer;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private NavigationView naview;
    private DrawerLayout drawlayout;
    private RecyclerView review;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        naview = (NavigationView) findViewById(R.id.naview);
        drawlayout = (DrawerLayout) findViewById(R.id.drawlayout);
        setupDrawerContent(naview);

        review = (RecyclerView) findViewById(R.id.review);
        //review.setOnClickListener(this);
    }

    private void setupDrawerContent(NavigationView navigationView) {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                menuItem.setCheckable(true);
                drawlayout.closeDrawers();
                Snackbar.make(drawlayout, menuItem.getTitle(), Snackbar.LENGTH_INDEFINITE).show();


                return true;
            }
        });
    }
}
