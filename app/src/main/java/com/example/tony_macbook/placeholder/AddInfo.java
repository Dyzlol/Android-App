package com.example.tony_macbook.placeholder;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Tony-MacBook on 4/18/16.
 * Custom AddInfo Class for user to input data
 * TODO: Make it actually store the data into new DataContainer
 */


public class AddInfo extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addinfo);

        // Upload Photo --- Currently just a toast window as a placeholder
        Button uploadButton = (Button) findViewById(R.id.upload_photo);
        uploadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder saveDialog = new AlertDialog.Builder(AddInfo.this);
                saveDialog.setTitle("Upload Photo");
                saveDialog.setMessage("This is currently a placeholder");

                // Yes & No choice do same thing currently
                saveDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                saveDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                saveDialog.show();
            }
        });


        // Depreciated!!!! --- Should probably remove this, but still unsure if I want a spinner
        /* Spinner dropdown = (Spinner)findViewById(R.id.spinner1);
        String[] items = new String[]{"Canned Food", "Clothing Drive", "Shelter", "Other"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter); */

        // Submit Button
        Button submitButton = (Button) findViewById(R.id.submit_info);
        submitButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View v) {
                    Intent intent = new Intent(AddInfo.this, SubmitConfirmation.class);
                    startActivity(intent);
                }
        });

    }

}
