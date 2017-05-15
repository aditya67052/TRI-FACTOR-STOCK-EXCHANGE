package com.example.winindo1.smallmedium;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


public class Candies extends AppCompatActivity {
    ListView lv;
    String[] names={"hersheys","hi chew","kitkat","mango chew","oreo","reeses peanut butter","sour patch"};
    String[] amount = { "$5", "$8", "$10", "$9", "$12","$15","$6" };
    int[] images={R.drawable.hersheys,R.drawable.hichew,R.drawable.kitkat,R.drawable.mangochew,R.drawable.oreo,R.drawable.reesespeanut,R.drawable.sour};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candies);
        lv=(ListView)findViewById(R.id.LiCatalog);
        MyBaseAdapter adapter=new MyBaseAdapter();
        lv.setAdapter(adapter);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView tv=(TextView)view.findViewById(R.id.textView);
                Toast.makeText(getApplicationContext(),tv.getText().toString(),Toast.LENGTH_SHORT).show();
                Intent i=new Intent(getApplicationContext(),Cart.class);
                startActivity(i);
            }
        });
    }
    class MyBaseAdapter extends BaseAdapter {
        @Override
        public int getCount() {
            return names.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view=getLayoutInflater().inflate(R.layout.customlist2,null);
            TextView name=(TextView)view.findViewById(R.id.textView);
            TextView price = (TextView) view.findViewById(R.id.textView1);
            ImageView image=(ImageView)view.findViewById(R.id.imageView);
            image.setImageResource(images[position]);
            name.setText(names[position]);
            price.setText(amount[position]);
            return view;
        }
    }
}