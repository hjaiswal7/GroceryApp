package com.example.groceryapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.groceryapp.MainActivity;
import com.example.groceryapp.ProductDetail;
import com.example.groceryapp.R;
import com.example.groceryapp.model.Groceries;

import java.util.List;

public class GroceriesAdapter extends RecyclerView.Adapter<GroceriesAdapter.GroceriesViewHolder> {

    Context context;
    List<Groceries> groceriesList;

    public GroceriesAdapter(Context context, List<Groceries> groceriesList) {
        this.context = context;
        this.groceriesList = groceriesList;
    }

    @NonNull
    @Override
    public GroceriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.groceries_row_items, parent,false);
        return new GroceriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GroceriesViewHolder holder,final int position) {

       holder.groceriesImage.setImageResource(groceriesList.get(position).getImageurl());
       holder.name.setText(groceriesList.get(position).getName());
       holder.bg.setBackgroundResource(groceriesList.get(position).getBg());

       holder.itemView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(context, ProductDetail.class);
               intent.putExtra("name",groceriesList.get(position).getName());
               intent.putExtra("groceriesImage",groceriesList.get(position).getImageurl());
               intent.putExtra("bg",groceriesList.get(position).getBg());
               context.startActivity(intent);
           }
       });
    }

    @Override
    public int getItemCount() {
        return groceriesList.size();
    }

    public static class GroceriesViewHolder extends RecyclerView.ViewHolder{
        TextView name;
        ImageView groceriesImage;
        LinearLayout bg;
        public GroceriesViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            groceriesImage = itemView.findViewById(R.id.groceriesImageView);
            bg = itemView.findViewById(R.id.groceriesLinearLayout);
        }
    }
}
