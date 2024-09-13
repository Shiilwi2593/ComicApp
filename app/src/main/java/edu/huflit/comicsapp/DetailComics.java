package edu.huflit.comicsapp;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailComics extends AppCompatActivity {

    ImageView imgComicsDetail;
    TextView titleDetail;
    TextView cateDetail;
    TextView infoDetail;
    TextView authorDetail;

    ImageButton btnLike;
    Button btnRead;

    ComicsDB comicsDB;

    ImageButton btnBack;

    Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_comics);


        Bundle bundle = getIntent().getExtras();
        if(bundle == null){
            return;
        }
        Comics comics = (Comics)bundle.get("comics");

        imgComicsDetail = findViewById(R.id.imgComicsDetail);
        titleDetail = findViewById(R.id.tvTitleDetail);
        cateDetail = findViewById(R.id.tvCateDetail);
        infoDetail = findViewById(R.id.tvInfoDetail);
        authorDetail = findViewById(R.id.tvAuthorDetail);
        btnLike = findViewById(R.id.btnLike);
        btnBack = findViewById(R.id.btnBack);
        btnRead = findViewById(R.id.btnRead);

        String img = comics.getImage();
        Glide.with(getApplicationContext())
                .load(img)
                .into(imgComicsDetail);
        titleDetail.setText(comics.getName());
        cateDetail.setText(comics.getCategory());
        infoDetail.setText(comics.getInfo());
        authorDetail.setText(comics.getAuthor());

        comicsDB = new ComicsDB(getApplicationContext());

        if(comics.getLikes() == 1){
            btnLike.setBackgroundColor(getResources().getColor(R.color.pink));
        }

        btnLike.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(comics.getLikes() == 1){
                    btnLike.setBackgroundColor(getResources().getColor(R.color.white));
                    btnLike.setBackground(getResources().getDrawable(R.drawable.border_buttonlike));
                    comicsDB.unlike(comics.getId());
                }
                else if(comics.getLikes() == 0){

                    btnLike.setBackgroundColor(getResources().getColor(R.color.pink));
                    btnLike.setBackground(getResources().getDrawable(R.drawable.border_buttonlike2));
                    comicsDB.like(comics.getId());
                }
            }
        });
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(DetailComics.this,MainActivity.class);
                startActivity(i);
            }
        });

        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailComics.this, ChapterView.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("comics",comics);
                intent.putExtras(bundle);
                DetailComics.this.startActivity(intent);
            }
        });

    }



}