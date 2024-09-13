package edu.huflit.comicsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class LikedComics extends AppCompatActivity {

    RecyclerView rvLikedlist;
    ArrayList<Comics> lstComicsLiked;
    ComicsAdapter comicsAdapter;
    ComicsDB comicsDB;

    ImageButton btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comics_liked);
        rvLikedlist = findViewById(R.id.rvLikedList);
        comicsDB = new ComicsDB(LikedComics.this);
        lstComicsLiked = comicsDB.getComicsWhereLikes();

        comicsAdapter = new ComicsAdapter(this,lstComicsLiked);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL,
                false);
        rvLikedlist.setLayoutManager(linearLayoutManager);

        rvLikedlist.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));

        rvLikedlist.setAdapter(comicsAdapter);


         btnBack = findViewById(R.id.btnBackFromLikedPage);
         btnBack.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent i = new Intent(LikedComics.this, MainActivity.class);
                 startActivity(i);
             }
         });
    }
}