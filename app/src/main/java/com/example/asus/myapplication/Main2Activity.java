package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Main2Activity extends AppCompatActivity {
    private String [] beijing={"asd","asd","dsa","sad","sd","as"};
    private String [] zhejiang={"ds","sd"};
    private String [] City={};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent=getIntent();
        String data=intent.getStringExtra("p");
        String city[]=null;
        if ("北京".equals(data)){
            city=beijing;
        }
        else if ("浙江".equals(data)){
            city=zhejiang;
        }
        else{
            city=City;
        }
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(
                Main2Activity.this,android.R.layout.simple_list_item_1,city);
        ListView listView =(ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
