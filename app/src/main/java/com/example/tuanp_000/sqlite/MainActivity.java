package com.example.tuanp_000.sqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tuanp_000.sqlite.Data.DBManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DBManager dbManager= new DBManager(this);
        dbManager.hello();
    }
}
