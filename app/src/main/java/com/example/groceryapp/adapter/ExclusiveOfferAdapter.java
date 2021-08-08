package com.example.groceryapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.groceryapp.MainActivity;
import com.example.groceryapp.R;
import com.example.groceryapp.model.ExclusiveOffer;

import java.util.List;

public class ExclusiveOfferAdapter extends RecyclerView.Adapter<ExclusiveOfferAdapter.ExclusiveOfferViewHolder> {

   Context context;
   List<ExclusiveOffer> exclusiveOfferList;

    public ExclusiveOfferAdapter(Context context, List<ExclusiveOffer> exclusiveOfferList) {
        this.context = context;
        this.exclusiveOfferList = exclusiveOfferList;
    }

    @NonNull
    @Override
    public ExclusiveOfferViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.exclusive_row_items,parent,false);
        return new ExclusiveOfferViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ExclusiveOfferViewHolder holder, int position) {
        holder.name.setText(exclusiveOfferList.get(position).getName());
        holder.price.setText(exclusiveOfferList.get(position).getPrice());
        holder.qty.setText(exclusiveOfferList.get(position).getQuantity());
//        holder.unit.setText(exclusiveOfferList.get(position).getUnit());
        holder.exclusiveImageView.setImageResource(exclusiveOfferList.get(position).getImageurl());

    }

    @Override
    public int getItemCount() {
        return exclusiveOfferList.size();

    }

    public static class ExclusiveOfferViewHolder extends RecyclerView.ViewHolder{

        ImageView exclusiveImageView;
        TextView name, description, price, qty, unit;
       public ExclusiveOfferViewHolder(@NonNull View itemView) {
           super(itemView);

           exclusiveImageView = itemView.findViewById(R.id.exclusiveImageView);
           name = itemView.findViewById(R.id.product_name);
           price = itemView.findViewById(R.id.price);
           qty = itemView.findViewById(R.id.qty);
//           unit = itemView.findViewById(R.id.unit);
       }
   }
}
