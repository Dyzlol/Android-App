package com.example.tony_macbook.placeholder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Tony-MacBook on 4/18/16.
 * SubmitConfirmation page that shows up after
 * submitting new information to the application
 */
public class SubmitConfirmation extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_conf);

        // Custom Listener for No Button.
            // Returns to Main Menu on Click
        Button fab = (Button) findViewById(R.id.no_button);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubmitConfirmation.this, MainActivity.class);
                startActivity(intent);
            }
        });

        // Custom Listener for Yes Button.
            // Returns to AddInfo on Click
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
