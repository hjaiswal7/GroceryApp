package com.example.groceryapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.groceryapp.R;
import com.example.groceryapp.model.BestSelling;



import java.util.List;

public class BestSellingAdapter extends RecyclerView.Adapter<BestSellingAdapter.BestSellingViewHolder>{
    Context context;
    List<BestSelling> bestSellingList;

    public BestSellingAdapter(Context context, List<BestSelling> bestSellingList) {
        this.context = context;
        this.bestSellingList = bestSellingList;
    }

    @NonNull
    @Override
    public BestSellingViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.bestselling_row_items,parent,false);
        return new BestSellingAdapter.BestSellingViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BestSellingViewHolder holder, int position) {
        holder.name.setText(bestSellingList.get(position).getName());
        holder.price.setText(bestSellingList.get(position).getPrice());
        holder.qty.setText(bestSellingList.get(position).getQuantity());
        holder.bestSellingImageView.setImageResource(bestSellingList.get(position).getImageurl());

    }

    @Override
    public int getItemCount() {
        return bestSellingList.size();

    }

    public static class BestSellingViewHolder extends RecyclerView.ViewHolder{

        ImageView bestSellingImageView;
        TextView name, price, qty;
        public BestSellingViewHolder(@NonNull View itemView) {
            super(itemView);

            bestSellingImageView = itemView.findViewById(R.id.bestSellingImageView);
            name = itemView.findViewById(R.id.product_name);
            price = itemView.findViewById(R.id.price);
            qty = itemView.findViewById(R.id.qty);
        }
    }

}
