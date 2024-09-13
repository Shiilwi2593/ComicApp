package edu.huflit.comicsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.util.ArrayList;

public class SearchComics extends AppCompatActivity {

    ImageButton btnSearch;

    RecyclerView rvSearch;

    EditText edtSearch;

    ComicsDB comicsDB;
    

    ArrayList<Comics> lstComicsSearch;
    
    ComicsAdapter comicsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_comics);
        btnSearch = findViewById(R.id.btnSearch);

        rvSearch = findViewById(R.id.rvSearch);

        edtSearch = findViewById(R.id.edtSearch);
        
        comicsDB = new ComicsDB(SearchComics.this);
        
        
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String searchdata = edtSearch.getText().toString().toLowerCase();
                lstComicsSearch = comicsDB.getComicsWhereName(searchdata);
                comicsAdapter = new ComicsAdapter(SearchComics.this,lstComicsSearch);
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(SearchComics.this,
                        LinearLayoutManager.VERTICAL,
                        false);
                rvSearch.setLayoutManager(linearLayoutManager);
                rvSearch.addItemDecoration(new DividerItemDecoration(SearchComics.this,DividerItemDecoration.VERTICAL));
                rvSearch.setAdapter(comicsAdapter);
            }
        });

    }


    public void btnBackHome_OnClick(View view) {
        Intent intent = new Intent(SearchComics.this,MainActivity.class);
        startActivity(intent);
    }
}