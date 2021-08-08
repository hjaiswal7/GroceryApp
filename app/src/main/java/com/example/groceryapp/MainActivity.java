package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.groceryapp.adapter.BestSellingAdapter;
import com.example.groceryapp.adapter.ExclusiveOfferAdapter;
import com.example.groceryapp.adapter.GroceriesAdapter;
import com.example.groceryapp.model.BestSelling;
import com.example.groceryapp.model.ExclusiveOffer;
import com.example.groceryapp.model.Groceries;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView exclusiveRecycleView, groceriesRecycleView, bestSellingRecycleView;
    ExclusiveOfferAdapter exclusiveOfferAdapter;
    List<ExclusiveOffer> exclusiveOfferList;

    GroceriesAdapter groceriesAdapter;
    List<Groceries> groceriesList;

    BestSellingAdapter bestSellingAdapter;
    List<BestSelling> bestSellingList;

//    CardView card_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        exclusiveRecycleView = findViewById(R.id.exclusiveRecycle);
        groceriesRecycleView = findViewById(R.id.groceriesRecycle);
        bestSellingRecycleView = findViewById(R.id.bestSellingRecycle);
//        card_view = findViewById(R.id.card_view);


//        card_view.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this,ProductDetail.class);
//                startActivity(intent);
//            }
//        });


        // adding data to model
        exclusiveOfferList = new ArrayList<>();
        exclusiveOfferList.add(new ExclusiveOffer("Organic Bananas","$4.99","7pcs","1Kg",1,R.drawable.banana));
        exclusiveOfferList.add(new ExclusiveOffer("Apple","$4.99","1kg","1Kg",2,R.drawable.apple));
        exclusiveOfferList.add(new ExclusiveOffer("Organic Bananas","$4.99","7pcs","1Kg",1,R.drawable.banana));


        // adding data to model
        groceriesList = new ArrayList<>();
        groceriesList.add(new Groceries("Pulses",1,R.drawable.pulses,R.drawable.groceries_background));
        groceriesList.add(new Groceries("Rice",2,R.drawable.rice,R.drawable.groceries_bg_rice));
        groceriesList.add(new Groceries("Pulses",3,R.drawable.pulses,R.drawable.groceries_background));
        groceriesList.add(new Groceries("Rice",4,R.drawable.rice,R.drawable.groceries_bg_rice));

        // adding data to model
        bestSellingList = new ArrayList<>();
        bestSellingList.add(new BestSelling("Bell Pepper Red","$4.99","1kg","1",1,R.drawable.redpepper));
        bestSellingList.add(new BestSelling("Ginger","$4.99","1kg","1",1,R.drawable.ginger));
        bestSellingList.add(new BestSelling("Ginger","$4.99","1kg","1",1,R.drawable.ginger));


        setExclusiveRecycler(exclusiveOfferList);
        setGroceriesRecycler(groceriesList);
        setBestSellingRecycler(bestSellingList);
    }

    private void setExclusiveRecycler(List<ExclusiveOffer> dataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        exclusiveRecycleView.setLayoutManager(layoutManager);
        exclusiveOfferAdapter = new ExclusiveOfferAdapter(this,dataList);
        exclusiveRecycleView.setAdapter(exclusiveOfferAdapter);
    }

    private void setGroceriesRecycler(List<Groceries> GroceriesdataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        groceriesRecycleView.setLayoutManager(layoutManager);
        groceriesAdapter = new GroceriesAdapter(this,GroceriesdataList);
        groceriesRecycleView.setAdapter(groceriesAdapter);
    }

    private void setBestSellingRecycler(List<BestSelling> BestSellingdataList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        bestSellingRecycleView.setLayoutManager(layoutManager);
        bestSellingAdapter = new BestSellingAdapter(this,BestSellingdataList);
        bestSellingRecycleView.setAdapter(bestSellingAdapter);
    }
}