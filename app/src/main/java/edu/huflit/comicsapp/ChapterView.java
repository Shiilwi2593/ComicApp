package edu.huflit.comicsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.github.barteksc.pdfviewer.PDFView;


public class ChapterView extends AppCompatActivity {

    PDFView pdfView;
    ImageButton btnBack;

    TextView tvName;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter_view);
        pdfView = findViewById(R.id.pdfView);
        btnBack = findViewById(R.id.btnBackCV);
        tvName = findViewById(R.id.tvName);

        Bundle bundle = getIntent().getExtras();
        if(bundle == null){
            return;
        }
        Comics comics = (Comics)bundle.get("comics");

        tvName.setText(comics.getName());
        pdfView.fromAsset(comics.getChapter()).load();


        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }
}