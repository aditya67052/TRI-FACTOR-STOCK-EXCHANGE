package com.example.winindo1.smallmedium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Confirm extends AppCompatActivity {
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirm);
        b=(Button)findViewById(R.id.confirm);
        TextView editText_disp = (TextView)findViewById(R.id.second_textView_disp);
        Intent i = getIntent();
        String name= i.getStringExtra("Name");
        String mobile = i.getStringExtra("MobileNo");
        String address= i.getStringExtra("Address");
        String state = i.getStringExtra("State");
        String coun = i.getStringExtra("country");
        editText_disp.append("Name : " +  name + "\n");
        editText_disp.append("MobileNo : " + mobile + "\n" );
        editText_disp.append("Address : " +  address + "\n");
        editText_disp.append("State : " + state + "\n" );
        editText_disp.append("country : " + coun );
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),ThankYou.class);
                startActivity(i);
            }
        });
    }
}

