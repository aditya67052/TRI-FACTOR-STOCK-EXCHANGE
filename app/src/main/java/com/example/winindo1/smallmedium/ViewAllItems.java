package com.example.winindo1.smallmedium;

import android.content.Intent;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ViewAllItems extends AppCompatActivity {
    DBAdapter dbAdapter;
    ListView listView;
    Cursor cursor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_all_items);
        listView = (ListView) findViewById(R.id.viewall_listView);
        dbAdapter = new DBAdapter(getApplicationContext());
        cursor = dbAdapter.getAllValues();
        cursor.moveToFirst();
        MyAdapter adapter = new MyAdapter();
        listView.setAdapter(adapter);
    }
    private class MyAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return cursor.getCount();
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

            cursor.moveToPosition(position);
            View view = getLayoutInflater().inflate(R.layout.customlistviewitem, null);
            TextView textView_name = (TextView) view.findViewById(R.id.custom_textView_name);
            TextView textView_contact = (TextView) view.findViewById(R.id.custom_textView_quality);
            TextView textView_id = (TextView) view.findViewById(R.id.custom_textView_id);
            textView_id.setText("" + cursor.getInt(0));
            textView_name.setText(cursor.getString(1));
            textView_contact.setText(cursor.getString(2));
            return view;
        }
    }
    public void product(View view){
        Intent intent = new Intent(getApplicationContext(),Billing.class);
        startActivity(intent);
    }
    public void cont(View view){
        Intent intent = new Intent(getApplicationContext(),Products.class);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        dbAdapter.closeConnection();
    }
}
