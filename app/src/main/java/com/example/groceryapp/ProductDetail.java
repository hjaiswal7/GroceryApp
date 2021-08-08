package com.example.groceryapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProductDetail extends AppCompatActivity {
     ImageView back,proGroceriesImage;
     ConstraintLayout proBg;
     TextView proName;
    String name,bg;
    int groceriesImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_detail);

        Intent intent = getIntent();
        name = intent.getStringExtra("name");
        groceriesImage = intent.getIntExtra("groceriesImage",R.drawable.pulses);
        bg = intent.getStringExtra("bg");


        proName = findViewById(R.id.name);
        proGroceriesImage = findViewById(R.id.groceriesImage);
        proBg = findViewById(R.id.bg);

        proName.setText(name);
        proGroceriesImage.setImageResource(groceriesImage);



        back = findViewById(R.id.backImg);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProductDetail.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}