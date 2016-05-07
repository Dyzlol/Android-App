package com.example.tony_macbook.placeholder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Tony-MacBook on 4/30/16.
 * Custom Search Class for searching specific
 * info from DataContainers, then opens a Listview
 */

public class Search extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        // Custom Listener for Submit Button
            // Transitions to Results Page (ListView)
        Button submitButton = (Button) findViewById(R.id.search_submit_button);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Search.this, Results.class);
                startActivity(intent);
            }
        });
    }
}
