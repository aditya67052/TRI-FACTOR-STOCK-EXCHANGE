package com.example.winindo1.smallmedium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cart extends AppCompatActivity {
    EditText edit_product,edit_quality;
    String product,quality;
    DBAdapter dbAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        edit_product = (EditText) findViewById(R.id.editText_name);
        edit_quality = (EditText) findViewById(R.id.editText_quality);
        dbAdapter = new DBAdapter(getApplicationContext());
    }
    public void submit(View view) {
        product = edit_product.getText().toString();
        quality = edit_quality.getText().toString();
        long response = dbAdapter.insertValues(product,quality);
        if (response == 1) {
            Toast.makeText(getApplicationContext(),"Insertion failed",Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(getApplicationContext(),"Inserted successfully",Toast.LENGTH_SHORT).show();
            Intent i = new Intent(getApplicationContext(),Cart.class);
            startActivity(i);
        }
        finish();
    }
    public void viewAll(View view){
        Intent intent = new Intent(getApplicationContext(),ViewAllItems.class);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        dbAdapter.closeConnection();
    }
}