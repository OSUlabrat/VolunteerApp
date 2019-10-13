package com.mrpanda2.volunteerapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    /*Button volunteerSignInButton;
    Button organizationSignInButton;
    Button volunteerSignUpButton;
    Button organizationSignUpButton;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new LandingPage();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }


        /*volunteerSignInButton = findViewById(R.id.volunteerSignInButton);
        organizationSignInButton = findViewById(R.id.organizationSignInButton);
        volunteerSignInButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, volunteerSignInPage.class);
                startActivity(intent);
            }
        });

        organizationSignInButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this, organizationSignInPage.class);
                startActivity(intent);
            }


        });
    }

    @Override
    public void onClick(View view) {

    }*/
}
