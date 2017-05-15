package com.example.winindo1.smallmedium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Products extends AppCompatActivity implements View.OnClickListener {
    Button b,b1,b2,b3,b4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_products);
        b=(Button)findViewById(R.id.cig);
        b1=(Button)findViewById(R.id.bee);
        b2=(Button)findViewById(R.id.gum);
        b3=(Button)findViewById(R.id.cand);
        b4=(Button)findViewById(R.id.sod);
        b.setOnClickListener(this);
        b.setOnClickListener(this);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cig:
                startActivity(new Intent(Products.this,Cigarette.class));
                break;
            case R.id.bee:
                startActivity(new Intent(Products.this,Beers.class));
                break;
            case R.id.gum:
                startActivity(new Intent(Products.this,Gums.class));
                break;
            case R.id.cand:
                startActivity(new Intent(Products.this,Candies.class));
                break;
            case R.id.sod:
                startActivity(new Intent(Products.this,SodaAndChips.class));
                break;
        }

    }
}
