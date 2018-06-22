package com.example.tuanp_000.sqlite.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

public class DBManager extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "student_manager.db";
    private static final String TABLE_NAME = "student";
    private static final String ID = "id";
    private static final String STUDENT_NAME = "name";
    private static final String PHONE_NUMBER = "number";
    private static final String ADDRESS = "address";
    private static final String EMAIL = "email";
    private static final int VERSION = 1 ;
    private static final String SQLQuery =
            "CREATE TABLE " + TABLE_NAME + " (" +
                    ID + " INTEGER PRIMARY KEY, " +
                    STUDENT_NAME + " TEXT," +
                    PHONE_NUMBER + " TEXT," +
                    ADDRESS + " TEXT," +
                    EMAIL + " TEXT )";
    private Context context;


    public DBManager(Context context) {
        super(context, DATABASE_NAME, null, VERSION);
        this.context=context;
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL(SQLQuery);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    public void hello(){
        Toast.makeText(context, "hello hooman", Toast.LENGTH_LONG).show();
    }
}
