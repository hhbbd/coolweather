package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

import static android.R.attr.data;

public class MainActivity extends AppCompatActivity {
    private String [] province=new String[]{"北京","上海","浙江"};
    private String [] beijing=new String[]{"asd","asd","dsa","sad","sd","as"};
    private String [] zhejiang=new String[]{"ds","sd"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView listView =(ListView) findViewById(R.id.list_view);
        ArrayAdapter adapter=
        new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,province);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this,province.get(position),Toast.LENGTH_SHORT).show();
                if ("北京".equals(MainActivity.this,province.get(position))) {
                    ArrayAdapter adapter =
                            new ArrayAdapter<String>(MainActivity.this
                                    , android.R.layout.simple_list_item_1,
                                    MainActivity.this.beijing);
                    listView.setAdapter(adapter);
                }
                else if("浙江".equals(MainActivity.this,province.get(position)))
                {
                    ArrayAdapter adapter =
                            new ArrayAdapter<String>(MainActivity.this
                                    , android.R.layout.simple_list_item_1,
                                    MainActivity.this.zhejiang);
                    listView.setAdapter(adapter);
                }

                }

        });

    }
}
