package com.example.tony_macbook.placeholder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.io.IOException;
import java.util.List;

/**
 * Created by Tony-MacBook on 4/30/16.
 */
public class Results extends AppCompatActivity {

    ListView listView;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        listView = (ListView) findViewById(R.id.list);

        List<DataContainer> dataSet = null;
        try {
            XMLPullParserHandler parser = new XMLPullParserHandler();
            dataSet = parser.parse(getAssets().open("data.xml"));
            ArrayAdapter<DataContainer> adapter =
                    new ArrayAdapter<DataContainer>(this,R.layout.list_item, dataSet);
            listView.setAdapter(adapter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
