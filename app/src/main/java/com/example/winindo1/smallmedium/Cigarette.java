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

public class Cigarette extends AppCompatActivity {
    ListView lv;
    String[] names={"NewPort","NewPort Lights","NewPort Non Menthol","Marlboro","Marlboro Lights","Marlboro Special Blend"};
    String[] amount = { "$5", "$10", "$12", "$15", "$9","$10" };
    int[] images={R.drawable.c,R.drawable.ci,R.drawable.cig,R.drawable.cigr,R.drawable.cigre,R.drawable.cigret};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cigarette);
        lv=(ListView)findViewById(R.id.listCatalog);
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
            View view=getLayoutInflater().inflate(R.layout.customlist,null);
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