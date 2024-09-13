package edu.huflit.comicsapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity  {


    RecyclerView rvComics;

    ComicsAdapter comicsAdapter;

    ArrayList<Comics> lstComics;

    FloatingActionButton btnDarkLight;
    boolean isDark = false;
    ConstraintLayout main_layout;



    ComicsDB comicsDB;

    ImageButton btnMenu;
    ImageButton btnSort;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnMenu = findViewById(R.id.btnMenu);
        btnSort = findViewById(R.id.btnSort);


        comicsDB = new ComicsDB(MainActivity.this);

        rvComics = findViewById(R.id.rvComics);


        lstComics = comicsDB.getComics();

        comicsAdapter = new ComicsAdapter(this, lstComics);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(MainActivity.this,
                                                                            LinearLayoutManager.VERTICAL,
                                                                            false);
        rvComics.setLayoutManager(linearLayoutManager);

        rvComics.addItemDecoration(new DividerItemDecoration(MainActivity.this,DividerItemDecoration.VERTICAL));

        rvComics.setAdapter(comicsAdapter);


        //Menu
        btnMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this,view);

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()){
                            case R.id.search:
                                Intent searchIntent = new Intent(MainActivity.this,SearchComics.class);
                                startActivity(searchIntent);
                                return true;
                            case R.id.likeComics:
                                Intent likedIntent = new Intent(MainActivity.this, LikedComics.class);
                                startActivity(likedIntent);
                                return true;

                        }
                        return false;
                    }
                });
                popupMenu.inflate(R.menu.menu);
                popupMenu.show();
            }
        });


        //Sort
        btnSort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(MainActivity.this,view);

                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()){
                            case R.id.no_Sort:
                                lstComics = comicsDB.getComics();


                                comicsAdapter = new ComicsAdapter(MainActivity.this, lstComics,isDark);

                                LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(MainActivity.this,
                                        LinearLayoutManager.VERTICAL,
                                        false);
                                rvComics.setLayoutManager(linearLayoutManager1);

                                rvComics.addItemDecoration(new DividerItemDecoration(MainActivity.this,DividerItemDecoration.VERTICAL));

                                rvComics.setAdapter(comicsAdapter);
                                break;
                            case R.id.sort_az:
                                lstComics = comicsDB.sortAZ();
                                comicsAdapter = new ComicsAdapter(MainActivity.this,lstComics,isDark);
                                LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(MainActivity.this,
                                        LinearLayoutManager.VERTICAL,
                                        false);
                                rvComics.setLayoutManager(linearLayoutManager2);

                                rvComics.addItemDecoration(new DividerItemDecoration(MainActivity.this,DividerItemDecoration.VERTICAL));

                                rvComics.setAdapter(comicsAdapter);
                                break;
                            case R.id.sort_za:
                                lstComics = comicsDB.sortZA();
                                comicsAdapter = new ComicsAdapter(MainActivity.this,lstComics,isDark);
                                LinearLayoutManager linearLayoutManager3 = new LinearLayoutManager(MainActivity.this,
                                        LinearLayoutManager.VERTICAL,
                                        false);
                                rvComics.setLayoutManager(linearLayoutManager3);

                                rvComics.addItemDecoration(new DividerItemDecoration(MainActivity.this,DividerItemDecoration.VERTICAL));

                                rvComics.setAdapter(comicsAdapter);
                                break;



                        }
                        return false;
                    }
                });
                popupMenu.inflate(R.menu.sort_menu);
                popupMenu.show();
            }
        });








        //Dark/light Mode
        btnDarkLight = findViewById(R.id.btnDarkLight);
        main_layout = findViewById(R.id.main_layout);

        btnDarkLight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                isDark = !isDark;
                if(isDark){
                    main_layout.setBackgroundColor(getResources().getColor(R.color.Dark));
                }
                else{
                    main_layout.setBackgroundColor(getResources().getColor(R.color.white));
                }
                comicsAdapter = new ComicsAdapter(MainActivity.this,lstComics,isDark);
                rvComics.setAdapter(comicsAdapter);
            }
        });
    }



}