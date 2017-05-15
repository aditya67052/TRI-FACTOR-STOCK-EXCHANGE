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


public class SodaAndChips extends AppCompatActivity {
    ListView lv;
    String[] names={"canada dry","cheeto","coca","doritos hempfest","doritos","fanta orange","ginger"};
    String[] amount = { "$10", "$15", "$30", "$20", "$10","$45","$40"};
    int[] images={R.drawable.canadadry,R.drawable.cheeto,R.drawable.coca,R.drawable.doritoshempfest,R.drawable.doritos,R.drawable.fantaorange,R.drawable.ginger};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soda_and_chips);
        lv=(ListView)findViewById(R.id.ListCat);
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
            View view=getLayoutInflater().inflate(R.layout.customlist4,null);
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
