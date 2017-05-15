package com.example.winindo1.smallmedium;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpenHelper extends SQLiteOpenHelper {
    // database name
    private final static String DATABASE_NAME = "sample_db";

    // datbase version code
    private final static int DATABASE_VERSION_CODE = 1;

    // table name
    public final static String SAMPLE_TABLE_NAME = "sample_table";

    // table creation
    private final String CREATE_SAMPLE_TABLE = "create table " + SAMPLE_TABLE_NAME + "(_id integer primary key autoincrement, name text, phone text);";

    public DBOpenHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION_CODE);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_SAMPLE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
