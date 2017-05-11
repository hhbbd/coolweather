package com.example.asus.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;

import static android.R.attr.data;

public class MainActivity extends AppCompatActivity {
    private String [] province=new String[]{"北京","上海","浙江"};
    private String [] beijing=new String[]{"东城区","西城区","朝阳区","丰台区","石景山区","海淀区","门头沟区","房山区","通州区"
            ,"顺义区","昌平区","大兴区","怀柔区","平谷区","密云区","延庆区"};
    private String [] zhejiang=new String[]{"杭州","宁波","温州","绍兴","湖州","嘉兴","金华","衢州","舟山","台州","丽水"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ListView listView =(ListView) findViewById(R.id.list_view);
        final Button backButton = (Button) findViewById(R.id.back_button);


        ArrayAdapter adapter=
        new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,province);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){

            @Override

            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                backButton.setVisibility(View.VISIBLE);

                if ("北京".equals(province[position])) {
                    ArrayAdapter adapter =
                            new ArrayAdapter<String>(MainActivity.this
                                    , android.R.layout.simple_list_item_1,
                                    MainActivity.this.beijing);
                    listView.setAdapter(adapter);
                }
                else if("浙江".equals(province[position]))
                {
                    ArrayAdapter adapter =
                            new ArrayAdapter<String>(MainActivity.this
                                    , android.R.layout.simple_list_item_1,
                                    MainActivity.this.zhejiang);
                    listView.setAdapter(adapter);
                }

                }

        });
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                backButton.setVisibility(View.GONE);
                ArrayAdapter adapter =
                        new ArrayAdapter<String>(MainActivity.this
                                , android.R.layout.simple_list_item_1,
                                province);
                listView.setAdapter(adapter);
            }
        });

    }
}
