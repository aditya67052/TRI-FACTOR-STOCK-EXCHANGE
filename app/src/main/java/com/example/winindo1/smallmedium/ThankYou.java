package com.example.winindo1.smallmedium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThankYou extends AppCompatActivity implements View.OnClickListener {
    Button b, b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);
        b = (Button) findViewById(R.id.continu);
//        b1 = (Button) findViewById(R.id.LogOut);
        b.setOnClickListener(this);
//        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.continu:
                startActivity(new Intent(ThankYou.this, Products.class));
                break;
//            case R.id.LogOut:
//                startActivity(new Intent(ThankYou.this, LoginActivity.class));
//                break;
        }
    }
}
