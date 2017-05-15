package com.example.winindo1.smallmedium;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DBAdapter {
    SQLiteDatabase database;
    public DBAdapter(Context context) {
        DBOpenHelper openHelper = new DBOpenHelper(context);
        database = openHelper.getWritableDatabase();
    }
    public long insertValues(String product,String quality) {
        ContentValues values = new ContentValues();
        values.put("Product", product);
        values.put("Quality", quality);
        return database.insert(DBOpenHelper.SAMPLE_TABLE_NAME, null, values);
    }
    public Cursor getAllValues(){
        return database.rawQuery("select * from sample_table", null);
    }

    public void closeConnection(){
        database.close();
    }

}
