package com.mrpanda2.volunteerapp;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public abstract class EventListFragmentActivity extends AppCompatActivity{
    protected abstract Fragment createFragment();
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_event);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById((R.id.new_event_fragment_container));

        if (fragment == null){
            fragment = createFragment();
            fm.beginTransaction().add(R.id.new_event_fragment_container, fragment).commit();
        }
    }
}

