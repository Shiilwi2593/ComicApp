package edu.huflit.comicsapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;


public class ComicsAdapter extends RecyclerView.Adapter<ComicsAdapter.ComicsVH>{


    ArrayList<Comics> lstComics;
    private Context context;

    boolean isDark = false;


    public ComicsAdapter(Context context, ArrayList<Comics> lstComics) {
        this.lstComics = lstComics;
        this.context = context;
    }

    public ComicsAdapter( Context context,ArrayList<Comics> lstComics, boolean isDark) {
        this.lstComics = lstComics;
        this.context = context;
        this.isDark = isDark;
    }

    @NonNull
    @Override
    public ComicsVH onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.comics_rows,parent,false);
        return new ComicsVH(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ComicsVH holder, int position) {
        Comics comics = lstComics.get(position);
        holder.titleComics.setText(comics.getName());
        Glide.with(this.context)
                .load(comics.getImage())
                .into(holder.imgComics);
        holder.categoryComics.setText(comics.getCategory());
        holder.authorComics.setText(comics.getAuthor());

        holder.rowLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onClickGoToDetail(comics);
            }
        });
    }

    private void onClickGoToDetail(Comics comics) {
        Intent intent = new Intent(this.context, DetailComics.class);
        Bundle bundle = new Bundle();
        bundle.putSerializable("comics",comics);
        intent.putExtras(bundle);
        context.startActivity(intent);
    }


    @Override
    public int getItemCount() {
        return lstComics.size();
    }






    public class ComicsVH extends RecyclerView.ViewHolder{

        ImageView imgComics;
        TextView titleComics;
        TextView categoryComics;

        TextView authorComics;
        ConstraintLayout rowLayout;
        public ComicsVH(@NonNull View itemView) {
            super(itemView);

            rowLayout = itemView.findViewById(R.id.row_layout);
            imgComics = itemView.findViewById(R.id.imgComics);
            titleComics = itemView.findViewById(R.id.titleComics);
            categoryComics = itemView.findViewById(R.id.tvCategory);
            authorComics = itemView.findViewById(R.id.tvAuthor);

            if(isDark){
                setDarkTheme();
            }

        }
        public void setDarkTheme(){
            rowLayout.setBackgroundResource(R.drawable.row_bg_dark);
        }


    }




}

