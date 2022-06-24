package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String arr[] = {"hello ", "ram", "sita", "mohan ", "karma", "shyam", "mohan","hello ", "ram", "sita", "mohan ", "karma", "shyam","hello ", "ram", "sita", "mohan ", "karma", "shyam",  };
    ListView l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        l = (ListView) findViewById(R.id.lv);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.support.constraint.R.layout.support_simple_spinner_dropdown_item,arr);
       l.setAdapter(adapter);
    }
}