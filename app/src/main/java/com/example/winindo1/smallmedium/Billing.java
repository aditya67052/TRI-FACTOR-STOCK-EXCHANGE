package com.example.winindo1.smallmedium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Billing extends AppCompatActivity {
    private Button b,bt;
    private EditText nam,mbn,adr,st,ctr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billing);
        //Firebase.setAndroidContext(this);
        nam=(EditText)findViewById(R.id.name);
        mbn=(EditText)findViewById(R.id.mobile);
        adr=(EditText)findViewById(R.id.address);
        st=(EditText)findViewById(R.id.stat);
        ctr=(EditText)findViewById(R.id.cont);
        //mRootRef = new Firebase("https://fir-auth-c9a7b.firebaseio.com/");
        b=(Button)findViewById(R.id.submit);
        bt=(Button)findViewById(R.id.cancel);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=nam.getText().toString();
                String mobile=mbn.getText().toString();
                String address=adr.getText().toString();
                String state=st.getText().toString();
                String country=ctr.getText().toString();
                //Firebase childRef =mRootRef.child("Name");
                //childRef.push().setValue(value);
                Intent i=new Intent(getApplicationContext(),Confirm.class);
                i.putExtra("Name", name);
                i.putExtra("Mobile No", mobile);
                i.putExtra("Address", address);
                i.putExtra("State", state);
                i.putExtra("Country", country);
                startActivity(i);
                finish();;
            }
        });
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nam.setText("");
                mbn.setText("");
                adr.setText("");
                st.setText("");
                ctr.setText("");
            }
        });
    }
}

