package com.example.tony_macbook.placeholder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/********************************
 * MainActivity Landing Page
 ********************************/


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Buttons for Main Menu Choices
        Button fab = (Button) findViewById(R.id.mmain_but_addinfo);
        Button fab1 = (Button) findViewById(R.id.mmenu_but_search);

        // Listener for AddInfo
        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AddInfo.class);
                startActivity(intent);
            }
        });

        // Listener for Search Info
        fab1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Search.class);
                startActivity(intent);
            }
        });

    }




}
