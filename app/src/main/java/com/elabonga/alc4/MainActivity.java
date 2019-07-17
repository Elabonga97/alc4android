package com.elabonga.alc4;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button aboutButton, profileButton;
    Context activityContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        profileButton = (Button) findViewById(R.id.profileButton);
        aboutButton = (Button)  findViewById(R.id.aboutButton);
        activityContext = this;

        View.OnClickListener aboutClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Intent goToAbout = new Intent(activityContext, AboutALC.class);
                        startActivity(goToAbout);
            }
        };
        aboutButton.setOnClickListener(aboutClickListener);

        View.OnClickListener profileClickListener =new View.OnClickListener() {
            @Override
            public void onClick(View v) {

        Intent goToProfile = new Intent(getApplicationContext(), Profile.class);
        startActivity(goToProfile);

            }
        };
        profileButton.setOnClickListener(profileClickListener);


    }


}
