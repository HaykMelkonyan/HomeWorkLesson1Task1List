package com.example.user.homeworklesson1task1list;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView lv = (ListView) findViewById(R.id.mainListView);
        ArrayList<String > strList= new ArrayList<String>();
        for (int i = 0; i < 6; i++) {
            strList.add("item"+i);
        }

        ArrayAdapter<String> mHistory = new ArrayAdapter<String>(this, android.R.layout., strList);
        lv.setAdapter(mHistory);


    }
}
