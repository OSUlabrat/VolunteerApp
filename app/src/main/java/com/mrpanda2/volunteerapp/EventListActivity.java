package com.mrpanda2.volunteerapp;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

public class EventListActivity extends NewEventActivity{

    protected Fragment createFragment(){
        return new EventListFragment();
    }
}
