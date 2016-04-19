package com.example.tony_macbook.placeholder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Tony-MacBook on 4/18/16.
 */
public class SubmitConfirmation extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_conf);

        Button fab = (Button) findViewById(R.id.no_button);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubmitConfirmation.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button fab2 = (Button) findViewById(R.id.yes_button);

        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubmitConfirmation.this, AddInfo.class);
                startActivity(intent);
            }
        });
    }





}
