package com.example.asus.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private String [] province={"北京","上海","天津","重庆","香港","澳门","台湾","黑龙江","吉林","辽宁","内蒙古","河北","河南","山西",
            "山东","江苏","浙江","福建","江西","安徽","湖北","湖南","广东","广西","海南","贵州","云南","四川","西藏","陕西","宁夏","甘肃",
            "青海","新疆"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);ArrayAdapter<String > adapter=new ArrayAdapter<String>(
                MainActivity.this,android.R.layout.simple_list_item_1,province);
        ListView listView =(ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }
}
