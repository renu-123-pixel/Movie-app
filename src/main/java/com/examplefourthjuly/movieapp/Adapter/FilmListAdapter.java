package com.examplefourthjuly.movieapp.Adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.examplefourthjuly.movieapp.Activity.DetailActivity;
import com.examplefourthjuly.movieapp.Domain.ListFilm;
import com.examplefourthjuly.movieapp.R;

public class FilmListAdapter extends RecyclerView.Adapter<FilmListAdapter.ViewHolder> {
    ListFilm items;
    Context context;
    public FilmListAdapter(ListFilm items){
        this.items=items;
    }

    @NonNull
    @Override
    public FilmListAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(parent.getContext()).inflate(R.layout.viewholder_film,parent,false);
        context=parent.getContext();
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull FilmListAdapter.ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        holder.pic.setImageDrawable(null);
holder.titleTxt.setText(items.getData().get(position).getTitle());
holder.ScoreTxt.setText(""+ items.getData().get(position).getImdbRating());

Glide.with(holder.itemView.getContext()).load(items.getData().get(position).getPoster()).into(holder.pic);

holder.itemView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        Intent i = new Intent(holder.itemView.getContext(), DetailActivity.class);
        i.putExtra("id",items.getData().get(position).getId());
        holder.itemView.getContext().startActivity(i);
    }
});
    }

    @Override
    public int getItemCount() {
        return items.getData().size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView titleTxt,ScoreTxt;
        ImageView pic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            titleTxt = itemView.findViewById(R.id.TitleTxt);
            ScoreTxt=itemView.findViewById(R.id.scoreTxt);
            pic=itemView.findViewById(R.id.pic);
        }
    }
}
