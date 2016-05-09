package com.example.tony_macbook.placeholder;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.AdapterView.OnItemClickListener;
import java.io.IOException;
import java.util.List;

/**
 * Created by Tony-MacBook on 4/30/16.
 * Custom Results Class that displays the search
 * results from Search Class in a ListView.
 *
 * ***
 * Currently opens list results by address in GoogleMaps
 * when each result is clicked on.
 */

public class Results extends AppCompatActivity {

    // Declarations
    ListView listView;

    /* OnCreate()
    *
    *  *** TO DO ***
    *  Move the XML to do this when App opens, so we can populate, and
    *  update/store info from the AddInfo page. Also don't want it parsing and xml every
    *  time we open the Results page
    */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        // Get ListView ID
        listView = (ListView) findViewById(R.id.list);
        List<DataContainer> dataSet = null;

        // Parse the xml file we populated
        try {
            XMLPullParserHandler parser = new XMLPullParserHandler();
            dataSet = parser.parse(getAssets().open("data.xml"));
            ArrayAdapter<DataContainer> adapter = new ArrayAdapter<DataContainer>(this,R.layout.list_item, R.id.Itemname, dataSet);
            listView.setAdapter(adapter);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // OnItemClickListener for Custom ListView
        listView.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String temp = ""; // Might be buggy. Needs more testing to see if this resolves
                if (temp != "") {temp = "";} //   // issue where Addresses get added together multiple times

                // Get the Address from the lView clicked, and form the googleAddress for Maps
                temp += ((DataContainer)listView.getAdapter().getItem(position)).getGoogleAddr();
                Uri uri = Uri.parse(temp);

                // Open URI in GoogleMaps with our custom String
                Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                startActivity(intent);

            }
        });

    }
}
