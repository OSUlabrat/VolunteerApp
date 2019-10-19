package com.mrpanda2.volunteerapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;

public class volunteerSignInPage extends AppCompatActivity {
    Button EventsButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.volunteer_sign_in);
        Log.d("Fragment Lifecyle", "Working!");
        EventsButton = findViewById(R.id.button2);
        EventsButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(volunteerSignInPage.this, EventListActivity.class);
                startActivity(intent);
            }
        });
    }
}
